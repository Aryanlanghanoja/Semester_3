// import java.util.*;
// import java.lang.Math;

// public class OptimizedAStar {
//     static class Edge {
//         String Source;
//         String Destination;
//         int Route;
//         float distance;

//         public Edge(String Source, String Destination, int Route, float distance) {
//             this.Source = Source;
//             this.Destination = Destination;
//             this.Route = Route;
//             this.distance = distance;
//         }
//     }

//     public static String getSrc() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Source :- ");
//         String src = sc.nextLine();
//         return src;
//     }

//     public static String getTar() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Target :- ");
//         String tar = sc.nextLine();
//         return tar;
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         // Route - 0
        // graph[70].add(new Edge("Madhapar Chowk", "Ayodhya Park Chowk", 0, 0.6f));
        // graph[281].add(new Edge("Ayodhya Park Chowk", "Shital Park", 0, 0.65f));
        // graph[365].add(new Edge("Shital Park", "Ramdevpir Chowk", 0, 0.9f));
        // graph[153].add(new Edge("Ramdevpir Chowk", "Nanavati Chowk", 0, 0.75f));
        // graph[116].add(new Edge("Nanavati Chowk", "Raiya Chowk", 0, 0.55f));
        // graph[299].add(new Edge("Raiya Chowk", "Raiya TelePhone Exchange", 0, 1.2f));
        // graph[313].add(new Edge("Raiya TelePhone Exchange", "Indira Circle", 0, 0.8f));
        // graph[325].add(new Edge("Indira Circle", "West Zone Office", 0, 1.4f));
        // graph[352].add(new Edge("West Zone Office", "Nana Mava Chowk", 0, 0.65f));
        // graph[181].add(new Edge("Nana Mava Chowk", "Maha Puja Dham Chowk", 0, 0.7f));
        // graph[339].add(new Edge("Maha Puja Dham Chowk", "Om Nagar Chowk", 0, 0.5f));
        // graph[340].add(new Edge("Om Nagar Chowk", "Mavdi Chowk", 0, 0.55f));
        // graph[338].add(new Edge("Mavdi Chowk", "Umiya Chowk", 0, 0.7f));
        // graph[213].add(new Edge("Umiya Chowk", "Ambedkar Chowk", 0, 0.7f));
        // graph[283].add(new Edge("Ambedkar Chowk", "Goverdhan Chowk", 0, 0.5f));
        // graph[212].add(new Edge("Goverdhan Chowk", "Punit Nagar Chowk", 0, 0.6f));
        // graph[27].add(new Edge("Punit Nagar Chowk", "Gondal Chowk", 0, 0.75f));

        // graph[281].add(new Edge("Ayodhya Park Chowk", "Madhapar Chowk", 0, 0.6f));
        // graph[365].add(new Edge("Shital Park", "Ayodhya Park Chowk", 0, 0.65f));
        // graph[153].add(new Edge("Ramdevpir Chowk", "Shital Park", 0, 0.9f));
        // graph[116].add(new Edge("Nanavati Chowk", "Ramdevpir Chowk", 0, 0.75f));
        // graph[299].add(new Edge("Raiya Chowk", "Nanavati Chowk", 0, 0.55f));
        // graph[313].add(new Edge("Raiya TelePhone Exchange", "Raiya Chowk", 0, 1.2f));
        // graph[325].add(new Edge("Indira Circle", "Raiya TelePhone Exchange", 0, 0.8f));
        // graph[352].add(new Edge("West Zone Office", "Indira Circle", 0, 1.4f));
        // graph[181].add(new Edge("Nana Mava Chowk", "West Zone Office", 0, 0.65f));
        // graph[339].add(new Edge("Maha Puja Dham Chowk", "Nana Mava Chowk", 0, 0.7f));
        // graph[340].add(new Edge("Om Nagar Chowk", "Maha Puja Dham Chowk", 0, 0.5f));
        // graph[338].add(new Edge("Mavdi Chowk", "Om Nagar Chowk", 0, 0.55f));
        // graph[213].add(new Edge("Umiya Chowk", "Mavdi Chowk", 0, 0.7f));
        // graph[283].add(new Edge("Ambedkar Chowk", "Umiya Chowk", 0, 0.7f));
        // graph[212].add(new Edge("Goverdhan Chowk", "Ambedkar Chowk", 0, 0.5f));
        // graph[27].add(new Edge("Punit Nagar Chowk", "Goverdhan Chowk", 0, 0.6f));
        // graph[149].add(new Edge("Gondal Chowk", "Punit Nagar Chowk", 0, 0.75f));
        
//         // Route - 1 

//         graph[114].add(new Edge("Saurastra University" , "BT Savani (Kidni) Hospital" , 1 , 1.4f));
//         graph[361].add(new Edge("BT Savani (Kidni) Hospital" , "Akashvani Chowk" , 1 , 0.75f));
//         graph[353].add(new Edge("Akashvani Chowk" , "Panchayat Nagar Chowk" , 1 , 0.8f));
//         graph[30].add(new Edge("Panchayat Nagar Chowk" , "Indira Circle" , 1 , 0.65f));
//         graph[325].add(new Edge("Indira Circle" , "Indubai Mahasatiji Chowk" , 1 , 0.85f));
//         graph[35].add(new Edge("Indubai Mahasatiji Chowk" , "Swaminarayan Mandir / Mahila" , 1 , 0.8f));
//         graph[369].add(new Edge("Swaminarayan Mandir / Mahila" , "Astron Chowk" , 1 , 0.85f));
//         graph[202].add(new Edge("Astron Chowk" , "Hemu Gadhvi Hall" , 1 , 1.1f));
//         graph[2].add(new Edge("Hemu Gadhvi Hall" , "Ramkrushna Aashram" , 1 , 0.75f));
//         graph[28].add(new Edge("Ramkrushna Aashram" , "Malaviya Chowk" , 1 , 0.75f));
//         graph[79].add(new Edge("Malaviya Chowk" , "Trikon Baug" , 1 , 0.6f));

//         graph[162].add(new Edge("BT Savani (Kidni) Hospital" ,"Saurastra University" , 1 , 1.4f));
//         graph[361].add(new Edge("Akashvani Chowk" , "BT Savani (Kidni) Hospital" , 1 , 0.75f));
//         graph[114].add(new Edge("Panchayat Nagar Chowk" , "Akashvani Chowk" , 1 , 0.8f));
//         graph[325].add(new Edge("Indira Circle" , "Panchayat Nagar Chowk" ,  1 , 0.65f));
//         graph[35].add(new Edge( "Indubai Mahasatiji Chowk" ,"Indira Circle" , 1 , 0.85f));
//         graph[369].add(new Edge("Swaminarayan Mandir / Mahila" ,"Indubai Mahasatiji Chowk" ,  1 , 0.8f));
//         graph[202].add(new Edge("Astron Chowk" ,"Swaminarayan Mandir / Mahila" ,  1 , 0.85f));
//         graph[2].add(new Edge( "Hemu Gadhvi Hall" ,"Astron Chowk" , 1 , 1.1f));
//         graph[28].add(new Edge("Ramkrushna Aashram" ,"Hemu Gadhvi Hall" ,  1 , 0.75f));
//         graph[79].add(new Edge("Malaviya Chowk","Ramkrushna Aashram" , 1 , 0.75f));
//         graph[162].add(new Edge("Trikon Baug" ,"Malaviya Chowk" , 1 , 0.6f));

//         // Route - 2

//         graph[74].add(new Edge("HN Shukla College", "Pradyumna Park", 2, 8.7f));
//         graph[277].add(new Edge("Pradyumna Park", "Marketing Yard", 2, 5.3f));
//         graph[234].add(new Edge("Marketing Yard", "Bhagirath Society", 2, 1.3f));
//         graph[93].add(new Edge("Bhagirath Society", "Lakheshvar Society - R.T.O. Office", 2, 0.3f));
//         graph[163].add(new Edge("Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", 2, 0.9f));
//         graph[125].add(new Edge("GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approch Road", 2, 1.1f));
//         graph[336].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road", "Aayaknagar - Pedak Road", 2, 5.4f));
//         graph[62].add(new Edge("Aayaknagar - Pedak Road", "Narayan Nagar Aproch Road - Govind Nagar", 2, 4.7f));
//         graph[18].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar", "Champak Nagar - Panino Ghodo", 2, 0.2f));
//         graph[81].add(new Edge("Champak Nagar - Panino Ghodo", "Patel Vadi", 2, 9.1f));
//         graph[282].add(new Edge("Patel Vadi", "Parevadi Chowk", 2, 1f));
//         graph[148].add(new Edge("Parevadi Chowk", "Hospital Chowk", 2, 2.6f));
//         graph[107].add(new Edge("Hospital Chowk", "Trikon Baug", 2, 2.8f));
//         graph[162].add(new Edge("Trikon Baug", "Malaviya Chowk", 2, 0.65f));
//         graph[79].add(new Edge("Malaviya Chowk", "Ramkrushna Aashram", 2, 0.8f));
//         graph[28].add(new Edge("Ramkrushna Aashram", "Dharmendrasihnji College", 2, 0.28f));
//         graph[349].add(new Edge("Dharmendrasihnji College", "Jilla Panchayat Chowk", 2, 1.6f));
//         graph[75].add(new Edge("Jilla Panchayat Chowk", "Kishanpara Chowk", 2, 2.2f));
//         graph[271].add(new Edge("Kishanpara Chowk", "Swaminarayan Mandir / Mahila", 2, 0.75f));
//         graph[369].add(new Edge("Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk", 2, 1.8f));
//         graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Indira Circle", 2, 2.8f));
//         graph[325].add(new Edge("Indira Circle", "Panchayat Nagar Chowk", 2, 0.9f));
//         graph[30].add(new Edge("Panchayat Nagar Chowk", "Sadhu Vasvani School", 2, 5.9f));
//         graph[177].add(new Edge("Sadhu Vasvani School", "Ajanta Park / Janak Puri", 2, 0.9f));
//         graph[343].add(new Edge("Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", 2, 0.92f));
//         graph[370].add(new Edge("Balaji Park / Satellite Park", "Aalap Green City", 2, 2.2f));
//         graph[55].add(new Edge("Aalap Green City", "Raiya Gam", 2, 3.4f));
                    
//         graph[277].add(new Edge("Pradyumna Park","HN Shukla College",  2, 8.7f));
//         graph[234].add(new Edge("Marketing Yard", "Pradyumna Park",  2, 5.3f));
//         graph[93].add(new Edge("Bhagirath Society","Marketing Yard",  2, 1.3f));
//         graph[163].add(new Edge("Lakheshvar Society - R.T.O. Office","Bhagirath Society",  2, 0.3f));
//         graph[125].add(new Edge("GramUdhyog Mandir Pedak" , "Lakheshvar Society - R.T.O. Office", 2, 0.9f));
//         graph[336].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road","GramUdhyog Mandir Pedak",  2, 1.1f));
//         graph[62].add(new Edge("Aayaknagar - Pedak Road","Setelite Chowk - Maruti Nagar Approch Road",  2, 5.4f));
//         graph[18].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar","Aayaknagar - Pedak Road" ,  2, 4.7f));
//         graph[81].add(new Edge("Champak Nagar - Panino Ghodo","Narayan Nagar Aproch Road - Govind Nagar",  2, 0.2f));
//         graph[282].add(new Edge("Patel Vadi","Champak Nagar - Panino Ghodo",  2, 9.1f));
//         graph[148].add(new Edge("Parevadi Chowk", "Patel Vadi",  2, 1f));
//         graph[107].add(new Edge("Hospital Chowk", "Parevadi Chowk", 2, 2.6f));
//         graph[162].add(new Edge("Trikon Baug", "Hospital Chowk", 2, 2.8f));
//         graph[79].add(new Edge("Malaviya Chowk", "Trikon Baug", 2, 0.65f));
//         graph[28].add(new Edge("Ramkrushna Aashram", "Malaviya Chowk", 2, 0.8f));
//         graph[349].add(new Edge("Dharmendrasihnji College", "Ramkrushna Aashram", 2, 0.28f));
//         graph[75].add(new Edge("Jilla Panchayat Chowk", "Dharmendrasihnji College", 2, 1.6f));
//         graph[271].add(new Edge("Kishanpara Chowk", "Jilla Panchayat Chowk", 2, 2.2f));
//         graph[369].add(new Edge("Swaminarayan Mandir / Mahila", "Kishanpara Chowk", 2, 0.75f));
//         graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", 2, 1.8f));
//         graph[325].add(new Edge("Indira Circle", "Indubai Mahasatiji Chowk", 2, 2.8f));
//         graph[30].add(new Edge("Panchayat Nagar Chowk", "Indira Circle", 2, 0.9f));
//         graph[177].add(new Edge("Sadhu Vasvani School", "Panchayat Nagar Chowk", 2, 5.9f));
//         graph[343].add(new Edge("Ajanta Park / Janak Puri", "Sadhu Vasvani School", 2, 0.9f));
//         graph[370].add(new Edge("Balaji Park / Satellite Park", "Ajanta Park / Janak Puri", 2, 0.92f));
//         graph[55].add(new Edge("Aalap Green City", "Balaji Park / Satellite Park", 2, 2.2f));
//         graph[119].add(new Edge("Raiya Gam", "Aalap Green City", 2, 3.4f));
                
//     }

//     public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, String curr, String path, String tar,
//             Map<Float, String> Map, float length, String source) {

//         int currindex = 0;

//         String[] dict = {
//             "Udhyog Nagar",
//             "Darshan Eng. College",
//             "Hemu Gadhvi Hall",
//             "S.T. Bus Stand",
//             "Bapa Sitaram Chowk",
//             "Fulvadi Park",
//             "Astron Society",
//             "K.S. Diesel Engine (80 feet Road Crossing)",
//             "Manhar Pura (150 ft. Ring Road)",
//             "Navagam",
//             "Madhapar Gam",
//             "Punit Nagar (Jetko 66 k.v.a.)",
//             "Christ College",
//             "Hudko Police Chokdi",
//             "Swati Society",
//             "Ghanshyam Nagar / Nanda Hall",
//             "Gopalnagar Choro",
//             "Ghanteshvar S.R.P Camp (G- Company Gate)",
//             "Narayan Nagar Aproch Road - Govind Nagar",
//             "Rajnagar Main Road Crossing",
//             "Kankot Patiyu",
//             "Akshar Vatika (Mavdi)",
//             "Vishvanagar",
//             "Greenland Chokdi",
//             "Patidar Chowk",
//             "Aastha Sangrila",
//             "Sankalp Siddhpark",
//             "Punit Nagar Chowk",
//             "Ramkrushna Aashram",
//             "Amin Marg Akshar Marg Crossing",
//             "Panchayat Nagar Chowk",
//             "Chitralekha Chowk",
//             "Jay Sardar Chowk",
//             "K.K.V. Hall",
//             "Sardar Vallabhbhai Viddhyalay",
//             "Indubai Mahasatiji Chowk",
//             "Golden Park",
//             "Indraprasth Society",
//             "R.K. University",
//             "Marwadi College",
//             "Tulshi Baug",
//         };

//         for (int i = 0; i < dict.length; i++) {
//             if (dict[i].equals(curr)) {
//                 currindex = i;
//                 break;
//             }
//         }

//         String RouteNo = "Destination";
//         if (curr.equals(tar)) {
//             for (int i = 0; i < graph[currindex].size(); i++) {
//                 Edge edge = graph[currindex].get(i);

//                 if (edge.Destination.equals(tar)) {
//                     RouteNo = "R-" + Integer.toString(edge.Route);
//                 }
//             }

//             Map.put(length, path + "\n" + RouteNo + " : " + tar);
//             return;
//         } else {

//             vis[currindex] = true;

//             for (int i = 0; i < graph[currindex].size(); i++) {
//                 Edge e = graph[currindex].get(i);

//                 if(e.Route == 0) {
//                     RouteNo = "BRTS";
//                 }

//                 else {
//                     RouteNo = "R-" + Integer.toString(e.Route);
//                 }

//                 int desindex = 0;
//                 for (int j = 0; j < dict.length; j++) {
//                     if (dict[j].equals(e.Destination)) {
//                         desindex = j;
//                         break;
//                     }
//                 }

//                 if (!vis[desindex]) {
//                     if (curr.equals(source)) {
//                         float newLength = length + e.distance;
//                         printAllPath(graph, vis, e.Destination, RouteNo + " : " + curr, tar, Map, newLength, source);
//                     } else {
//                         float newLength = length + e.distance;
//                         printAllPath(graph, vis, e.Destination, path + "\n" + RouteNo + " : " + curr, tar, Map,
//                                 newLength, source);
//                     }
//                 }
//             }

//             vis[currindex] = false;
//         }
//     }

//     public static void main(String[] args) {

//         noofroute m = new noofroute();
//         int noOfStations = 379;
//         ArrayList<Edge>[] graph = new ArrayList[noOfStations];
//         Map<Float, String> Map = new HashMap<>();
//         createGraph(graph);
//         String src = m.getSrc();
//         String tar = m.getTar();
//         boolean visit[] = new boolean[noOfStations];
//         printAllPath(graph, visit, src, "", tar, Map, 0.0f, src);

//         List<Map.Entry<Float, String>> entryList = new ArrayList<>(Map.entrySet());

//         Collections.sort(entryList, new Comparator<Map.Entry<Float, String>>() {
//             @Override
//             public int compare(Map.Entry<Float, String> entry1, Map.Entry<Float, String> entry2) {
//                 return Float.compare(entry1.getKey(), entry2.getKey());
//             }
//         });

//         System.out.println("Shortest Path :");
//         if (!entryList.isEmpty()) {
//             Map.Entry<Float, String> firstEntry = entryList.get(0);
//             System.out.println(firstEntry.getValue() + "\nLength: " + (String) (Math.abs((float) firstEntry.getKey()) + " km"));
//         } else {
//             System.out.println("No paths available.");
//         }
//     }
// }

import java.util.*;

public class OptimizedAStar {
    static class Edge {
        String destination;
        int route;
        float distance;

        public Edge(String destination, int route, float distance) {
            this.destination = destination;
            this.route = route;
            this.distance = distance;
        }
    }

    public static void addEdge(ArrayList<ArrayList<Edge>> graph, int source, int route, String destination, float distance) {
        graph.get(source).add(new Edge(destination, route, distance));
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph) {
    addEdge(graph, 70, 0, "Ayodhya Park Chowk", 0.6f);
    addEdge(graph, 281, 0, "Shital Park", 0.65f);
    // Add other edges for Route 0
    // ...

    addEdge(graph, 114, 1, "BT Savani (Kidni) Hospital", 1.4f);
    addEdge(graph, 361, 1, "Akashvani Chowk", 0.75f);
    // Add other edges for Route 1
    // ...

    addEdge(graph, 74, 2, "Pradyumna Park", 8.7f);
    addEdge(graph, 277, 2, "Marketing Yard", 5.3f);
    // Add other edges for Route 2
    // ...
    }

    public static void printShortestPath(ArrayList<ArrayList<Edge>> graph, boolean[] visited, int current, int target,
            String path, String source, Map<Float, String> paths, float length) {
        visited[current] = true;

        if (current == target) {
            paths.put(length, path);
            visited[current] = false;
            return;
        }

        for (Edge edge : graph.get(current)) {
            if (!visited[edge.route]) {
                float newLength = length + edge.distance;
                String newPath = path + "\n" + (edge.route == 0 ? "BRTS" : "R-" + edge.route) + " : " + stationNames[current];
                printShortestPath(graph, visited, stationIndices.get(edge.destination), target, newPath, source, paths, newLength);
            }
        }

        visited[current] = false;
    }

    public static void main(String[] args) {
        int noOfStations = 379;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(noOfStations);

        for (int i = 0; i < noOfStations; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);

        String source = getSrc();
        String target = getTar();
        int sourceIndex = stationIndices.get(source);
        int targetIndex = stationIndices.get(target);

        boolean[] visited = new boolean[noOfStations];
        Map<Float, String> shortestPaths = new HashMap<>();

        printShortestPath(graph, visited, sourceIndex, targetIndex, "", source, shortestPaths, 0.0f);

        if (!shortestPaths.isEmpty()) {
            Map.Entry<Float, String> firstEntry = shortestPaths.entrySet().iterator().next();
            System.out.println("Shortest Path:");
            System.out.println(firstEntry.getValue() + "\nLength: " + firstEntry.getKey() + " km");
        } else {
            System.out.println("No paths available.");
        }
    }

    // Define station names and their indices
    static String[] stationNames = {
        "Udhyog Nagar", "Darshan Eng. College", "Hemu Gadhvi Hall", "S.T. Bus Stand", "Bapa Sitaram Chowk",
        // ... (add all station names)
    };

    static Map<String, Integer> stationIndices = new HashMap<>();

    static {
        for (int i = 0; i < stationNames.length; i++) {
            stationIndices.put(stationNames[i], i);
        }
    }

    public static String getSrc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Source :- ");
        return sc.nextLine();
    }

    public static String getTar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Target :- ");
        return sc.nextLine();
    }
}

