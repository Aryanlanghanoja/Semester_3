import java.util.*;

public class chatgpt {
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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge("Marwadi University", "Bedi Market Yard", 1, 1.2f));
        graph[1].add(new Edge("Bedi Market Yard", "Bedi Chowkdi", 1, 2.3f));
        graph[2].add(new Edge("Bedi Chowkdi", "Greenland Circle", 1, 4.5f));
        graph[3].add(new Edge("Greenland Circle", "Trikon Baug", 1, 3.4f));

        graph[2].add(new Edge("Bedi Chowkdi", "Madhapar Chowkdi", 2, 5.4f));
        graph[4].add(new Edge("Madhapar Chowkdi", "Astron Chowk", 2, 9.6f));
        graph[5].add(new Edge("Astron Chowk", "Trikon Baug", 2, 4.2f));


        graph[1].add(new Edge("Bedi Market Yard", "Marwadi University", 1, 1.2f));
        graph[2].add(new Edge("Bedi Chowkdi", "Bedi Market Yard", 1, 2.3f));
        graph[3].add(new Edge("Greenland Circle", "Bedi Chowkdi", 1, 4.5f));
        graph[6].add(new Edge("Trikon Baug","Greenland Circle" , 1, 3.4f));

        graph[4].add(new Edge("Madhapar Chowkdi", "Bedi Chowkdi", 2, 5.4f));
        graph[5].add(new Edge("Astron Chowk", "Madhapar Chowkdi", 2, 9.6f));
        graph[6].add(new Edge("Trikon Baug", "Astron Chowk", 2, 4.2f));

    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, String curr, String path, String tar,
            Map<Float, String> Map, float length , String source) {
        if (curr.equals(tar)) {
            Map.put(length, path + " -> " + tar);
            return;
        }

        int currindex = 0;

        String[] dict = { "Marwadi University", "Bedi Market Yard", "Bedi Chowkdi", "Greenland Circle", "Madhapar Chowkdi",
                "Astron Chowk", "Trikon Baug" };

        for (int i = 0; i < dict.length; i++) {
            if (dict[i].equals(curr)) {
                currindex = i;
                break;
            }
        }

        vis[currindex] = true;

        for (int i = 0; i < graph[currindex].size(); i++) {
            Edge e = graph[currindex].get(i);

            int desindex = 0;
            for (int j = 0; j < dict.length; j++) {
                if (dict[j].equals(e.Destination)) {
                    desindex = j;
                    break;
                }
            }

            if (!vis[desindex]) {
                if(curr.equals(source)) {
                    float newLength = length + e.distance;
                    printAllPath(graph, vis, e.Destination, curr, tar, Map, newLength , source);
                    length = length - e.distance;
                }

                else {
                    float newLength = length + e.distance;
                    printAllPath(graph, vis, e.Destination, path + " -> " + curr, tar, Map, newLength , source);
                    length = length - e.distance;
                }
            }
        }

        vis[currindex] = false;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        Map<Float, String> Map = new HashMap<>();
        createGraph(graph);
        String src = "Marwadi University";
        String tar = "Trikon Baug";
        boolean visit[] = new boolean[7];
        printAllPath(graph, visit, src, "", tar, Map, 0.0f , src);

        List<Map.Entry<Float, String>> entryList = new ArrayList<>(Map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Float, String>>() {
            @Override
            public int compare(Map.Entry<Float, String> entry1, Map.Entry<Float, String> entry2) {
                return Float.compare(entry1.getKey(), entry2.getKey());
            }
        });

        int i = 0;
        System.out.println("All Possible Paths:");
        for (Map.Entry<Float, String> entry : entryList) {
            i++;
            System.out.println(i + ") Path: " + entry.getValue() + "\nLength: " + entry.getKey()
                    + "\n___________________________________________");
        }
    }
}
