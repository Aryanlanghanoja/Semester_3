import java.util.*;
import java.lang.Math;

public class Short {
    static class Edge {
        String Destination;
        int Route;
        float distance;

        public Edge(String Destination, int Route, float distance) {
            this.Destination = Destination;
            this.Route = Route;
            this.distance = distance;
        }
    }

    static Map<String, Integer> locationToIndex = new HashMap<>();

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

    public static void createGraph(ArrayList<Edge>[] graph) {
        locationToIndex.put("Marwadi College", 0);
        locationToIndex.put("Marketing Yard", 1);
        locationToIndex.put("Bedi Chowkdi", 2);
        locationToIndex.put("Greenland Chowkdi", 3);
        locationToIndex.put("Madhapar Chowk", 4);
        locationToIndex.put("Astron Chowk", 5);
        locationToIndex.put("Trikon Baug", 6);

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Initialize the graph with edges based on your actual data.
        // Example:
        graph[0].add(new Edge("Marketing Yard", 1, 5.4f));
        graph[1].add(new Edge("Bedi Chowkdi", 1, 3.2f));
        graph[2].add(new Edge("Greenland Chowkdi", 1, 4.2f));
        graph[3].add(new Edge("Astron Chowk", 1, 10.2f));
        graph[4].add(new Edge("Trikon Baug", 1, 1.2f));

        graph[1].add(new Edge("Marwadi College", 1, 5.4f));
        graph[2].add(new Edge("Marketing Yard", 1, 3.2f));
        graph[3].add(new Edge("Bedi Chowkdi", 1, 4.2f));
        graph[4].add(new Edge("Greenland Chowkdi", 1, 10.2f));
        graph[5].add(new Edge("Astron Chowk", 1, 1.2f));

        graph[0].add(new Edge("Marketing Yard", 2, 5.4f));
        graph[1].add(new Edge("Bedi Chowkdi", 2, 3.2f));
        graph[2].add(new Edge("Madhapar Chowk", 2, 4.2f));
        graph[3].add(new Edge("Astron Chowk", 2, 10.2f));
        graph[4].add(new Edge("Trikon Baug", 2, 1.2f));

        graph[1].add(new Edge("Marwadi College", 2, 5.4f));
        graph[2].add(new Edge("Marketing Yard", 2, 3.2f));
        graph[3].add(new Edge("Bedi Chowkdi", 2, 4.2f));
        graph[4].add(new Edge("Madhapar Chowk", 2, 10.2f));
        graph[5].add(new Edge("Astron Chowk", 2, 1.2f));

        // // Reverse edges for bidirectional paths (optional):
        // for (int i = 0; i < graph.length; i++) {
        //     for (Edge edge : graph[i]) {
        //         int destIndex = locationToIndex.get(edge.Destination);
        //         graph[destIndex].add(new Edge(dict[i], edge.Route, edge.distance));
        //     }
        // }
    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, String curr, String path, String tar,
            Map<Float, String> Map, float length, String source) {
        int currIndex = locationToIndex.get(curr);
        vis[currIndex] = true;

        String[] dict = {
            "Marwadi College",
            "Marketing Yard",
            "Bedi Chowkdi",
            "Greenland Chowkdi",
            "Madhapar Chowk",
            "Astron Chowk",
            "Trikon Baug"
        };

        String RouteNo = "Destination";
        if (curr.equals(tar)) {
            for (int i = 0; i < graph[currIndex].size(); i++) {
                Edge edge = graph[currIndex].get(i);

                if (edge.Destination.equals(tar)) {
                    RouteNo = "R-" + edge.Route;
                }
            }

            Map.put(length, path + "\n" + RouteNo + " : " + tar);
        } else {
            for (Edge e : graph[currIndex]) {
                if (e.Route == 0) {
                    RouteNo = "BRTS";
                } else {
                    RouteNo = "R-" + e.Route;
                }

                int desIndex = locationToIndex.get(e.Destination);
                if (!vis[desIndex]) {
                    if (curr.equals(source)) {
                        float newLength = length + e.distance;
                        printAllPath(graph, vis, e.Destination, RouteNo + " : " + curr, tar, Map, newLength, source);
                    } else {
                        float newLength = length + e.distance;
                        printAllPath(graph, vis, e.Destination, path + "\n" + RouteNo + " : " + curr, tar, Map,
                                newLength, source);
                    }
                }
            }
        }

        vis[currIndex] = false;
    }

    public static void main(String[] args) {
        noofroute m = new noofroute();
        int noOfStations = 7;
        ArrayList<Edge>[] graph = new ArrayList[noOfStations];
        Map<Float, String> Map = new HashMap<>();
        createGraph(graph);
        String src = m.getSrc();
        String tar = m.getTar();
        boolean visit[] = new boolean[noOfStations];
        printAllPath(graph, visit, src, "", tar, Map, 0.0f, src);

        PriorityQueue<Map.Entry<Float, String>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Float, String>>() {
            @Override
            public int compare(Map.Entry<Float, String> entry1, Map.Entry<Float, String> entry2) {
                return Float.compare(entry1.getKey(), entry2.getKey());
            }
        });

        pq.addAll(Map.entrySet());

        System.out.println("Shortest Path:");
        if (!pq.isEmpty()) {
            Map.Entry<Float, String> shortestPath = pq.poll();
            System.out.println(shortestPath.getValue() + "\nLength: " + shortestPath.getKey() + " km");
        } else {
            System.out.println("No paths available.");
        }
    }
}
