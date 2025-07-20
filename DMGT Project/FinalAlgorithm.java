import java.util.*;

public class FinalAlgorithm {
    public static class Edge {
        int src;
        int des;
        float weight;

        public Edge(int src, int des, float weight) {
            this.des = des;
            this.src = src;
            this.weight = weight;
        }
    }

    public static class Path {
        float length;
        String path;

        public Path(float length, String path) {
            this.length = length;
            this.path = path;
        }
    }

    public static void createGraph(List<List<Edge>> graph) {
        graph.add(new ArrayList<>()); // Node 0
        graph.add(new ArrayList<>()); // Node 1
        graph.add(new ArrayList<>()); // Node 2
        graph.add(new ArrayList<>()); // Node 3
        graph.add(new ArrayList<>()); // Node 4
        graph.add(new ArrayList<>()); // Node 5

        graph.get(0).add(new Edge(0, 1, 1));
        graph.get(0).add(new Edge(0, 2, 5));
        graph.get(0).add(new Edge(0, 3, 24));

        graph.get(1).add(new Edge(1, 0, 5));
        graph.get(1).add(new Edge(1, 2, 8));

        graph.get(2).add(new Edge(2, 1, 8));
        graph.get(2).add(new Edge(2, 3, 12));
        graph.get(2).add(new Edge(2, 5, 7));

        graph.get(3).add(new Edge(3, 2, 12));
        graph.get(3).add(new Edge(3, 4, 11));

        graph.get(4).add(new Edge(4, 5, 9));
        graph.get(4).add(new Edge(4, 3, 11));

        graph.get(5).add(new Edge(5, 4, 9));
        graph.get(5).add(new Edge(5, 2, 7));
        graph.get(5).add(new Edge(5, 0, 6));
    }

    public static void printAllPaths(List<List<Edge>> graph, int src, int tar) {
        PriorityQueue<Path> pq = new PriorityQueue<>(Comparator.comparing(p -> p.length));

        pq.add(new Path(0.0f, "" + src));

        while (!pq.isEmpty()) {
            Path currentPath = pq.poll();
            int currentNode = Character.getNumericValue(currentPath.path.charAt(currentPath.path.length() - 1));

            if (currentNode == tar) {
                System.out.println("Path: " + currentPath.path);
                System.out.println("Length: " + currentPath.length);
                System.out.println("____________________");
                continue;
            }

            for (Edge edge : graph.get(currentNode)) {
                int neighbor = edge.des;

                float newLength = currentPath.length + edge.weight;
                String newPath = currentPath.path + neighbor;
                pq.add(new Path(newLength, newPath));
            }
        }
        return;
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Edge>> graph = new ArrayList<>();
        createGraph(graph);
        int src = 0;
        int tar = 5;

        System.out.println("All Possible Paths:");
        printAllPaths(graph, src, tar);
    }
}
