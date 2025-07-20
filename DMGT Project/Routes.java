import java.util.ArrayList;

public class Routes {
    public static class Edge {
        String source;
        String destination;
        // float distance;
        int route;

        public Edge(String source, String destination, int route) {
            this.source = source;
            this.destination = destination;
            // this.distance = distance;
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
                "Indira Circle", "Panchayat Nagar Chowk", "Sadhu Vasvani School", "Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", "Aalap Green City", "Raiya Gam"},{"Jivraj Park", "Aarya Land Residency", "Jetko Chokdi", "Dream City", "Mavdi Gam", "Mavdi Chowk", "Fuliya Hanuman Mandir", "Mavdi Fire Station",
                "Aanand Bunglows", "Swaminarayan Chowk", "P. D. M. College", "Gurukul", "Bhaktinagar Circle", "Kanta Stri Vikash Gruh", "S.T. Bus Stand",
                "Trikon Baug", "Hospital Chowk", "I.P. Mission School", "Kothicompound", "Junction Railway Station", "Popatpara Central Jail", "Popatpara", "Central Ware House", "Bhaktinagar Park"},{"AajiDam", "Government Polytechnic", "Field Marshal Chowk", "Sarvoday Society", "Udhyog Nagar", "Chunarvad Chowk", "R.M.C East Zone Office", "Manhar Pura/Bedinaka Fire Station", 
                "Jalaram Chowk (Santkabir Road)", "no Khuno)", "Patel Vadi", "Parevadi Chowk", "I.P. Mission School", "Hospital Chowk", "Jubilee Baug", "Trikon Baug", "Malaviya Chowk", "Ramkrushna Aashram", 
                "Hemu Gadhvi Hall", "Astron Chowk", "Swaminarayan Mandir / Mahila", "College Chowk", "Indubai Mahasatiji Chowk", "K.K.V. Hall", "Atmiya College/Central School", "Crystal Mall", "Vrundavan Society", 
                "A.G. Society", "Everest Park", "Mota Mava", "Cosmoplex Cinema", "Kankot Kalwad Road", "Vruksh Mandir", "Uma P.T.C. College", "Mukhyamantri Aavas Yogna", "Quater", "Haripar Gam", "W.P. Engineering College", 
                "Virda Vajdi Gam", "Vagudad VadVajdi Gam", "G.I.D.C. Gate 1", "G.I.D.C. Gate 2", "G.I.D.C. Gate 3"},{"Raiya Gam", "Aalap Green City", "Bapa Sitaram Chowk", "Raiya Chokdi", "Hanuman Madhi", "Alkapuri", "Aazad Chowk", 
                "Aamrapali Fatak", "Kishanpara Chowk", "Jilla Panchayat Chowk", "Pulchhab Chowk", "Chitralekha Chowk", "Limda Chowk", "Trikon Baug", "S.T. Bus Stand", "Kanta Stri Vikash Gruh", "Bhaktinagar Circle", "Sheth High school", 
                "Kothariya Colony", "Sorthiya Vadi Circle", "Jangleshwer Crossing/ Bapunagar", "Aaji G.I.D.C.", "Field Marshal Chowk", "Government Polytechnic", "Aaji Dam", "Mahika Patiyu", "Kalipat", "R.K. University", "Tramba Gam"}};


                for(int i=0;i<routes.length ;i++) {
                    for(int j = 0 ;j < routes[i].length - 2 ; j++) {
                        map[i].add(new Edge(routes[i][j], routes[i][j+1],i+1));
                    }
                }
    }
    public static void main(String[] args) {
        
    }
}
