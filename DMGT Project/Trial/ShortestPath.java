import java.util.*;

public class ShortestPath {
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

    public static void createGraph(List<Edge>[] graph, Map<String, Integer> stationIndices) {
        stationIndices.put("Marwadi College", 0);
        stationIndices.put("Marketing Yard", 1);
        stationIndices.put("Bedi Chowkdi", 2);
        stationIndices.put("Greenland Chowkdi", 3);
        stationIndices.put("Madhapar Chowk", 4);
        stationIndices.put("Astron Chowk", 5);
        stationIndices.put("Trikon Baug", 6);

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
    }

    public static List<String> findShortestPath(List<Edge>[] graph, Map<String, Integer> stationIndices, String src, String tar) {
        Map<String, Float> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparing(distance::get));

        distance.put(src, 0.0f);
        queue.add(src);

        while (!queue.isEmpty()) {
            String u = queue.poll();
            if (u.equals(tar)) {
                break; // Found the target
            }

            int uIndex = stationIndices.get(u);

            for (Edge edge : graph[uIndex]) {
                String v = edge.Destination;
                float alt = distance.get(u) + edge.distance;
                if (alt < distance.getOrDefault(v, Float.MAX_VALUE)) {
                    distance.put(v, alt);
                    previous.put(v, u);
                    queue.add(v);
                }
            }
        }

        List<String> path = new ArrayList<>();
        String current = tar;
        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path);

        return path.size() > 1 ? path : Collections.emptyList();
    }

    public static void main(String[] args) {
        List<Edge>[] graph = new List[7];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        Map<String, Integer> stationIndices = new HashMap<>();
        createGraph(graph, stationIndices);

        String src = getSrc();
        String tar = getTar();

        List<String> shortestPath = findShortestPath(graph, stationIndices, src, tar);

        if (shortestPath.isEmpty()) {
            System.out.println("No path available.");
        } else {
            System.out.println("Shortest Path:");
            float totalDistance = 0.0f;
            String prevStation = shortestPath.get(0);
            for (String station : shortestPath) {
                int prevIndex = stationIndices.get(prevStation);
                int currentIndex = stationIndices.get(station);
                for (Edge edge : graph[prevIndex]) {
                    if (edge.Destination.equals(station)) {
                        String routeDescription = (edge.Route == 0) ? "BRTS" : "R-" + edge.Route;
                        System.out.println(routeDescription + " : " + prevStation);
                        totalDistance += edge.distance;
                    }
                }
                prevStation = station;
            }
            System.out.println("Length: " + totalDistance + " km");
        }
    }
}
