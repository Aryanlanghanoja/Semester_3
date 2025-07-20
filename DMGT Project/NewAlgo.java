import java.util.*;

public class NewAlgo {

static class Edge {

    String Source;
    String Destination ;
    double distance ;
    int route;

    Edge(String Source , String Destination , double distance , int route) {
        this.Source = Source ;
        this.Destination = Destination ;
        this.distance = distance ;
        this.route = route ;
    }
}

public static void createGraph(ArrayList<Edge> graph[]) {

    for(int i = 0 ; i < graph.length ; i++) {
        graph[i] = new ArrayList<Edge>() ;
    }

    String[][] routes = {
        {"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk", "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},
        {"HN Shukla College", "Pradyumna Park", "Marketing Yard", "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road", "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk", "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk", "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}
    };

    double[][] distanceArray = {
        {1.4, 0.75, 0.8, 0.65 , 0.85, 0.8, 0.85, 1.1, 0.75, 0.75, 0.6},
        {8.7, 5.3, 1.3, 0.3, 0.9, 1.1, 5.4, 4.7, 0.2, 9.1, 1.0, 2.6, 2.8, 0.65, 0.8, 0.28, 1.6, 2.2, 0.75, 1.8, 2.8, 0.9, 5.9, 0.9, 0.92, 2.2, 3.4}
    };

    for(int i=0;i<routes.length ;i++) {
        for(int j = 0 ;j <= routes[i].length - 2 ; j++) {
            graph[i].add(new Edge(routes[i][j], routes[i][j+1],distanceArray[i][j],i+1));
        }
    }
    }

    public static void main(String[] args) {
        int V = 2 ;
        ArrayList<Edge>[] graph = new ArrayList[2];
        createGraph(graph);
        

    }
}
    

