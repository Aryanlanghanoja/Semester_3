public class Temp1 {
    static class Edge {
        String Source ;
        String Destination;
        Double Distance;

        Edge(String Source , String Destination , Double Distance) {
            this.Source = Source ;
            this.Destination = Destination ;
            this.Distance = Distance ;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[][] routes = {
            {"Saurastra University", "BT Savani (Kidni) Hospital", "Akashvani Chowk", "Panchayat Nagar Chowk", "Indira Circle", "Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", "Astron Chowk", "Hemu Gadhvi Hall", "Ramkrushna Aashram", "Malaviya Chowk", "Trikon Baug"},
            {"HN Shukla College", "Pradyumna Park", "Marketing Yard", "Bhagirath Society", "Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approach Road", "Aayaknagar - Pedak Road", "Narayan Nagar Approach Road - Govind Nagar", "Champak Nagar - Panino Ghodo", "Patel Vadi", "Parevadi Chowk", "Hospital Chowk", "Trikon Baug", "Malaviya Chowk", "Ramkrushna Aashram", "Dharmendrasihnji College", "Jilla Panchayat Chowk", "Kishanpara Chowk", "Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk", "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"}
        };

        double[][] distanceArray = {
            {1.4, 0.75, 0.8, 0.65 , 0.85, 0.8, 0.85, 1.1, 0.75, 0.75, 0.6},
            {8.7, 5.3, 1.3, 0.3, 0.9, 1.1, 5.4, 4.7, 0.2, 9.1, 1.0, 2.6, 2.8, 0.65, 0.8, 0.28, 1.6, 2.2, 0.75, 1.8, 2.8, 0.9, 5.9, 0.9, 0.92, 2.2, 3.4}
        };

        System.out.println(routes[1].length + " " + distanceArray[1].length);

        double[] Temp =  { 1.4 , 0.75 , 0.8 , 0.65 , 0.85 , 0.8 , 0.85 , 1.1 , 0.75 , 0.75 ,  0.6  } ;
    }
    
}
