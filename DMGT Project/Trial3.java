import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trial3 {
    public static class Edge {
        String source;
        String destination;
        double distance;
        int route;

        public Edge(String source, String destination, double distance, int route) {
            this.source = source;
            this.destination = destination;
            this.distance = distance;
            this.route = route;
        }
    }

    public static void createGraph(ArrayList<Edge>[] map) {
        String[][] routes = {
            {"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk", "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk", "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},
            {"HN Shukla College", "Pradyumna Park", "Marketing Yard", "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road", "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk", "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk", "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}
        };

        double[][] distanceArray = {
            {1.4, 0.75, 0.8, 0.65, 0.85, 0.8, 0.85, 1.1, 0.75, 0.75, 0.6},
            {8.7, 5.3, 1.3, 0.3, 0.9, 1.1, 5.4, 4.7, 0.2, 9.1, 1.0, 2.6, 2.8, 0.65, 0.8, 0.28, 1.6, 2.2, 0.75, 1.8, 2.8, 0.9, 5.9, 0.9, 0.92, 2.2, 3.4}
        };

        int nodeCount = 0;

        // Calculate the total number of nodes
        for (String[] route : routes) {
            nodeCount += route.length;
        }

        // Initialize the map
        for (int i = 0; i < nodeCount; i++) {
            map[i] = new ArrayList<>();
        }

        int nodeIndex = 0; // Keep track of the current node index

        for (int routeIndex = 0; routeIndex < routes.length; routeIndex++) {
            String[] route = routes[routeIndex];
            double[] distances = distanceArray[routeIndex];

            for (int i = 0; i < route.length - 1; i++) {
                map[nodeIndex].add(new Edge(route[i], route[i + 1], distances[i], routeIndex + 1));
                nodeIndex++;
            }
        }
    }

    public static void printAllPath(ArrayList<Edge>[] map, boolean[][] visited, String current, String path, String destination, Map<Double, String> pathMap, Double length) {
        if (current.equals(destination)) {
            pathMap.put(length, path + " " + destination);
            return;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].size(); j++) {
                Edge e = map[i].get(j);

                if (!visited[e.route - 1][j] && e.source.equals(current)) {
                    visited[e.route - 1][j] = true;
                    Double newLength = length + e.distance;
                    printAllPath(map, visited, e.destination, path + " " + current, destination, pathMap, newLength);
                    visited[e.route - 1][j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        String source = "Saurastra University";
        String destination = "Raiya Gam";

        int routeCount = 2; // Number of routes
        int maxNodesInRoute = 29; // Maximum number of nodes in a route

        ArrayList<Edge>[] map = new ArrayList[routeCount * maxNodesInRoute];
        Map<Double, String> pathMap = new HashMap<>();
        createGraph(map);

        boolean[][] visited = new boolean[routeCount][maxNodesInRoute];
        printAllPath(map, visited, source, "", destination, pathMap, 0.0);

        List<Map.Entry<Double, String>> entryList = new ArrayList<>(pathMap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Double, String>>() {
            @Override
            public int compare(Map.Entry<Double, String> entry1, Map.Entry<Double, String> entry2) {
                return Double.compare(entry1.getKey(), entry2.getKey());
            }
        });

        int pathCount = 0;
        System.out.println("All Possible Paths:");
        for (Map.Entry<Double, String> entry : entryList) {
            pathCount++;
            System.out.println(pathCount + ") Path: " + entry.getValue() + "\n   Length: " + entry.getKey() + "\n____________________");
        }
    }
}
