import java.util.*;

public class DijkstrasAlgorithm {
    static class Edge {
        String Source;
        String Destination;
        int Route;
        float distance;

        public Edge(String Source, String Destination, int Route, float distance) {
            this.Source = Source;
            this.Destination = Destination;
            this.Route = Route;
            this.distance = distance;
        }
    }

    public static String getSrc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Source: ");
        return sc.nextLine();
    }

    public static String getTar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Target: ");
        return sc.nextLine();
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge("Marwadi College", "Marketing Yard", 1, 5.4f));
        graph[1].add(new Edge("Marketing Yard", "Bedi Chowkdi", 1, 3.2f));
        graph[2].add(new Edge("Bedi Chowkdi", "Greenland Chowkdi", 1, 4.2f));
        graph[3].add(new Edge("Greenland Chowkdi", "Astron Chowk", 1, 10.2f));
        graph[4].add(new Edge("Astron Chowk", "Trikon Baug", 1, 1.2f));

        graph[1].add(new Edge("Marketing Yard", "Marwadi College", 1, 5.4f));
        graph[2].add(new Edge("Bedi Chowkdi", "Marketing Yard", 1, 3.2f));
        graph[3].add(new Edge("Greenland Chowkdi", "Bedi Chowkdi", 1, 4.2f));
        graph[4].add(new Edge("Astron Chowk", "Greenland Chowkdi", 1, 10.2f));
        graph[5].add(new Edge("Trikon Baug", "Astron Chowk", 1, 1.2f));

        graph[0].add(new Edge("Marwadi College", "Marketing Yard", 2, 5.4f));
        graph[1].add(new Edge("Marketing Yard", "Bedi Chowkdi", 2, 3.2f));
        graph[2].add(new Edge("Bedi Chowkdi", "Madhapar Chowk", 2, 4.2f));
        graph[3].add(new Edge("Madhapar Chowk", "Astron Chowk", 2, 10.2f));
        graph[4].add(new Edge("Astron Chowk", "Trikon Baug", 2, 1.2f));

        graph[1].add(new Edge("Marketing Yard", "Marwadi College", 2, 5.4f));
        graph[2].add(new Edge("Bedi Chowkdi", "Marketing Yard", 2, 3.2f));
        graph[3].add(new Edge("Madhapar Chowk", "Bedi Chowkdi", 2, 4.2f));
        graph[4].add(new Edge("Astron Chowk", "Madhapar Chowk", 2, 10.2f));
        graph[5].add(new Edge("Trikon Baug", "Astron Chowk", 2, 1.2f));
    }

    public static void dijkstra(ArrayList<Edge>[] graph, String src, String tar) {
        int noOfStations = graph.length;
        float[] distance = new float[noOfStations];
        int[] parent = new int[noOfStations];
        boolean[] visited = new boolean[noOfStations];

        Arrays.fill(distance, Float.MAX_VALUE);
        int srcIndex = 0;
        int tarIndex = 0;

        String[] dict = {
            "Marwadi College",
            "Marketing Yard",
            "Bedi Chowkdi",
            "Greenland Chowkdi",
            "Madhapar Chowk",
            "Astron Chowk",
            "Trikon Baug"
        };

        for (int i = 0; i < dict.length; i++) {
            if (dict[i].equals(src)) {
                srcIndex = i;
            } else if (dict[i].equals(tar)) {
                tarIndex = i;
            }
        }

        if (srcIndex == -1 || tarIndex == -1) {
            System.out.println("Source or target station not found in the graph.");
            return;
        }

        distance[srcIndex] = 0;

        for (int i = 0; i < noOfStations; i++) {
            int u = minDistance(distance, visited, noOfStations);
            visited[u] = true;

            for (int v = 0; v < noOfStations; v++) {
                if (!visited[v] && graph[u].contains(v)) {
                    float newDist = distance[u] + graph[u].get(v).distance;

                    if (newDist < distance[v]) {
                        distance[v] = newDist;
                        parent[v] = u;
                    }
                }
            }
        }

        printPath(graph, srcIndex, tarIndex, parent);
        System.out.println("Length: " + distance[tarIndex] + " km");
    }

    public static int minDistance(float[] distance, boolean[] visited, int noOfStations) {
        float min = Float.MAX_VALUE;
        int minIndex = 0;
        for (int v = 0; v < noOfStations; v++) {
            if (!visited[v] && distance[v] < min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void printPath(ArrayList<Edge>[] graph, int srcIndex, int tarIndex, int[] parent) {
        if (srcIndex == tarIndex) {
            return;
        }
        printPath(graph, srcIndex, parent[tarIndex], parent);
        Edge edge = graph[parent[tarIndex]].get(tarIndex);

        if (edge.Route == 0) {
            System.out.println("BRTS" + " : " + edge.Source);
        } else {
            System.out.println("R-" + edge.Route + " : " + edge.Source);
        }
    }

    public static void main(String[] args) {
        int noOfStations = 7;
        ArrayList<Edge>[] graph = new ArrayList[noOfStations];
        createGraph(graph);
        String src = getSrc();
        String tar = getTar();

        dijkstra(graph, src, tar);
    }
}
