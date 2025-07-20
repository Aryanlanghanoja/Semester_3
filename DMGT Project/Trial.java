import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trial {
    public static class Edge {
        String source;
        String destination;
        double distance;
        int route;

        public Edge(String source, String destination, double distance , int route) {
            this.source = source;
            this.destination = destination;
            this.distance = distance;
            this.route = route;
        }
    }

    public static void createGraph(ArrayList<Edge>[] map) {
        for (int i = 0; i < map.length; i++) {
            map[i] = new ArrayList<Edge>();
        }

        String[][] routes = {{"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk",
                "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk",
                "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},{"HN Shukla College", "Pradyumna Park", "Marketing Yard",
                "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road",
                "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk",
                "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk",
                "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}};

        double[][] distanceArray = {{1.4, 0.75, 0.8, 0.65, 0.85, 0.8, 0.85, 1.1, 0.75, 0.75, 0.6},
                                    {8.7, 5.3, 1.3, 0.3, 0.9, 1.1, 5.4, 4.7, 0.2, 9.1, 1.0, 2.6, 2.8, 
                                    0.65, 0.8, 0.28, 1.6, 2.2, 0.75, 1.8, 2.8, 0.9, 5.9, 
                                    0.9, 0.92, 2.2, 3.4}};

                for(int i=0;i<routes.length ;i++) {
                    for(int j = 0 ;j <= routes[i].length - 2 ; j++) {
                        map[i].add(new Edge(routes[i][j], routes[i][j+1],distanceArray[i][j],i+1));
                    }
                }
    }

    public static void printAllPath(ArrayList<Edge>[] map , boolean[][] visited , String Current , String Path , String Destination , Map<Double ,String > Map , Double Length) {

        String[][] routes = {{"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk",
        "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk",
        "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},{"HN Shukla College", "Pradyumna Park", "Marketing Yard",
        "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road",
        "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk",
        "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk",
        "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}};

        if(Current.equals(Destination)) {
            Map.put(Length, Path + " " + Destination);
            return ;
        }

        int i = 0,j = 0;
        for(i=0 ;i<routes.length ; i++) {
            for(j = 0 ; j<routes[i].length ; j++) {
                if(routes[i][j].equals(Current)) {
                    visited[i][j] = true ;
                    break;
                }
            }
        }

        Edge e = map[i].get(0);

        if(!visited[i][j]) {
            Length = Length + e.distance ;
            printAllPath(map, visited, e.destination, Path + " " + Current, Destination, Map, Length);
        }
        visited[i][j] = false ;
    }

    public static void main(String[] args) {
    
        String[][] routes = {{"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk",
                "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk",
                "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},{"HN Shukla College", "Pradyumna Park", "Marketing Yard",
                "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road",
                "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk",
                "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk",
                "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}};

        int rows = routes.length;
        int columns = routes[0].length ;

        ArrayList<Edge>[] map = new ArrayList[rows*columns];
        Map<Double,String> Map = new HashMap<>() ;
        createGraph(map);
        String Source = " " ;
        String Destination = " " ;
        boolean visited[][] = new boolean[rows][columns];
        printAllPath(map, visited, Source, "", Destination, Map, 0.0);

        List<Map.Entry<Double,String>> entryList = new ArrayList<>(Map.entrySet());

        Collections.sort(entryList , new Comparator<Map.Entry<Double,String>>() {
            @Override

            public int compare(Map.Entry<Double,String> entry1 , Map.Entry<Double, String> entry2) {
                return Double.compare(entry1.getKey(), entry2.getKey());
            }
        });

        int i = 0 ;
        System.out.println("All Possible Path :- ");

        for (Map.Entry<Double, String> entry : entryList) {
            i++;
            System.out.println(i+ ") Path: " + entry.getValue() + "\n   Length: " + entry.getKey() + "\n____________________");
        }
    }

}