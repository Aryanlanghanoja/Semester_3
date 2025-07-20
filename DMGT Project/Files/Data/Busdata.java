package Data;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class Busdata {
    public static class Edge {
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

    public static String getSrc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Source :- ");
        String src = sc.nextLine();
        return src;
    }

    public static String getTar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Target :- ");
        String tar = sc.nextLine();
        return tar;
    }

   public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Route - 0
        graph[70].add(new Edge("Madhapar Chowk", "Ayodhya Park Chowk", 0, 0.6f));
        graph[281].add(new Edge("Ayodhya Park Chowk", "Shital Park", 0, 0.65f));
        graph[365].add(new Edge("Shital Park", "Ramdevpir Chowk", 0, 0.9f));
        graph[153].add(new Edge("Ramdevpir Chowk", "Nanavati Chowk", 0, 0.75f));
        graph[116].add(new Edge("Nanavati Chowk", "Raiya Chowk", 0, 0.55f));
        graph[299].add(new Edge("Raiya Chowk", "Raiya TelePhone Exchange", 0, 1.2f));
        graph[313].add(new Edge("Raiya TelePhone Exchange", "Indira Circle", 0, 0.8f));
        graph[325].add(new Edge("Indira Circle", "West Zone Office", 0, 1.4f));
        graph[352].add(new Edge("West Zone Office", "Nana Mava Chowk", 0, 0.65f));
        graph[181].add(new Edge("Nana Mava Chowk", "Maha Puja Dham Chowk", 0, 0.7f));
        graph[339].add(new Edge("Maha Puja Dham Chowk", "Om Nagar Chowk", 0, 0.5f));
        graph[340].add(new Edge("Om Nagar Chowk", "Mavdi Chowk", 0, 0.55f));
        graph[338].add(new Edge("Mavdi Chowk", "Umiya Chowk", 0, 0.7f));
        graph[213].add(new Edge("Umiya Chowk", "Ambedkar Chowk", 0, 0.7f));
        graph[283].add(new Edge("Ambedkar Chowk", "Goverdhan Chowk", 0, 0.5f));
        graph[212].add(new Edge("Goverdhan Chowk", "Punit Nagar Chowk", 0, 0.6f));
        graph[27].add(new Edge("Punit Nagar Chowk", "Gondal Chowk", 0, 0.75f));

        graph[281].add(new Edge("Ayodhya Park Chowk", "Madhapar Chowk", 0, 0.6f));
        graph[365].add(new Edge("Shital Park", "Ayodhya Park Chowk", 0, 0.65f));
        graph[153].add(new Edge("Ramdevpir Chowk", "Shital Park", 0, 0.9f));
        graph[116].add(new Edge("Nanavati Chowk", "Ramdevpir Chowk", 0, 0.75f));
        graph[299].add(new Edge("Raiya Chowk", "Nanavati Chowk", 0, 0.55f));
        graph[313].add(new Edge("Raiya TelePhone Exchange", "Raiya Chowk", 0, 1.2f));
        graph[325].add(new Edge("Indira Circle", "Raiya TelePhone Exchange", 0, 0.8f));
        graph[352].add(new Edge("West Zone Office", "Indira Circle", 0, 1.4f));
        graph[181].add(new Edge("Nana Mava Chowk", "West Zone Office", 0, 0.65f));
        graph[339].add(new Edge("Maha Puja Dham Chowk", "Nana Mava Chowk", 0, 0.7f));
        graph[340].add(new Edge("Om Nagar Chowk", "Maha Puja Dham Chowk", 0, 0.5f));
        graph[338].add(new Edge("Mavdi Chowk", "Om Nagar Chowk", 0, 0.55f));
        graph[213].add(new Edge("Umiya Chowk", "Mavdi Chowk", 0, 0.7f));
        graph[283].add(new Edge("Ambedkar Chowk", "Umiya Chowk", 0, 0.7f));
        graph[212].add(new Edge("Goverdhan Chowk", "Ambedkar Chowk", 0, 0.5f));
        graph[27].add(new Edge("Punit Nagar Chowk", "Goverdhan Chowk", 0, 0.6f));
        graph[149].add(new Edge("Gondal Chowk", "Punit Nagar Chowk", 0, 0.75f));
        
        // Route - 1 

        graph[114].add(new Edge("Saurastra University" , "BT Savani (Kidni) Hospital" , 1 , 1.4f));
        graph[361].add(new Edge("BT Savani (Kidni) Hospital" , "Akashvani Chowk" , 1 , 0.75f));
        graph[353].add(new Edge("Akashvani Chowk" , "Panchayat Nagar Chowk" , 1 , 0.8f));
        graph[30].add(new Edge("Panchayat Nagar Chowk" , "Indira Circle" , 1 , 0.65f));
        graph[325].add(new Edge("Indira Circle" , "Indubai Mahasatiji Chowk" , 1 , 0.85f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk" , "Swaminarayan Mandir / Mahila" , 1 , 0.8f));
        graph[369].add(new Edge("Swaminarayan Mandir / Mahila" , "Astron Chowk" , 1 , 0.85f));
        graph[202].add(new Edge("Astron Chowk" , "Hemu Gadhvi Hall" , 1 , 1.1f));
        graph[2].add(new Edge("Hemu Gadhvi Hall" , "Ramkrushna Aashram" , 1 , 0.75f));
        graph[28].add(new Edge("Ramkrushna Aashram" , "Malaviya Chowk" , 1 , 0.75f));
        graph[79].add(new Edge("Malaviya Chowk" , "Trikon Baug" , 1 , 0.6f));

        graph[162].add(new Edge("BT Savani (Kidni) Hospital" ,"Saurastra University" , 1 , 1.4f));
        graph[361].add(new Edge("Akashvani Chowk" , "BT Savani (Kidni) Hospital" , 1 , 0.75f));
        graph[114].add(new Edge("Panchayat Nagar Chowk" , "Akashvani Chowk" , 1 , 0.8f));
        graph[325].add(new Edge("Indira Circle" , "Panchayat Nagar Chowk" ,  1 , 0.65f));
        graph[35].add(new Edge( "Indubai Mahasatiji Chowk" ,"Indira Circle" , 1 , 0.85f));
        graph[369].add(new Edge("Swaminarayan Mandir / Mahila" ,"Indubai Mahasatiji Chowk" ,  1 , 0.8f));
        graph[202].add(new Edge("Astron Chowk" ,"Swaminarayan Mandir / Mahila" ,  1 , 0.85f));
        graph[2].add(new Edge( "Hemu Gadhvi Hall" ,"Astron Chowk" , 1 , 1.1f));
        graph[28].add(new Edge("Ramkrushna Aashram" ,"Hemu Gadhvi Hall" ,  1 , 0.75f));
        graph[79].add(new Edge("Malaviya Chowk","Ramkrushna Aashram" , 1 , 0.75f));
        graph[162].add(new Edge("Trikon Baug" ,"Malaviya Chowk" , 1 , 0.6f));

        // Route - 2

        graph[74].add(new Edge("HN Shukla College", "Pradyumna Park", 2, 8.7f));
        graph[277].add(new Edge("Pradyumna Park", "Marketing Yard", 2, 5.3f));
        graph[234].add(new Edge("Marketing Yard", "Bhagirath Society", 2, 1.3f));
        graph[93].add(new Edge("Bhagirath Society", "Lakheshvar Society - R.T.O. Office", 2, 0.3f));
        graph[163].add(new Edge("Lakheshvar Society - R.T.O. Office", "GramUdhyog Mandir Pedak", 2, 0.9f));
        graph[125].add(new Edge("GramUdhyog Mandir Pedak", "Setelite Chowk - Maruti Nagar Approch Road", 2, 1.1f));
        graph[336].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road", "Aayaknagar - Pedak Road", 2, 5.4f));
        graph[62].add(new Edge("Aayaknagar - Pedak Road", "Narayan Nagar Aproch Road - Govind Nagar", 2, 4.7f));
        graph[18].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar", "Champak Nagar - Panino Ghodo", 2, 0.2f));
        graph[81].add(new Edge("Champak Nagar - Panino Ghodo", "Patel Vadi", 2, 9.1f));
        graph[282].add(new Edge("Patel Vadi", "Parevadi Chowk", 2, 1f));
        graph[148].add(new Edge("Parevadi Chowk", "Hospital Chowk", 2, 2.6f));
        graph[107].add(new Edge("Hospital Chowk", "Trikon Baug", 2, 2.8f));
        graph[162].add(new Edge("Trikon Baug", "Malaviya Chowk", 2, 0.65f));
        graph[79].add(new Edge("Malaviya Chowk", "Ramkrushna Aashram", 2, 0.8f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Dharmendrasihnji College", 2, 0.28f));
        graph[349].add(new Edge("Dharmendrasihnji College", "Jilla Panchayat Chowk", 2, 1.6f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Kishanpara Chowk", 2, 2.2f));
        graph[271].add(new Edge("Kishanpara Chowk", "Swaminarayan Mandir / Mahila", 2, 0.75f));
        graph[369].add(new Edge("Swaminarayan Mandir / Mahila", "Indubai Mahasatiji Chowk", 2, 1.8f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Indira Circle", 2, 2.8f));
        graph[325].add(new Edge("Indira Circle", "Panchayat Nagar Chowk", 2, 0.9f));
        graph[30].add(new Edge("Panchayat Nagar Chowk", "Sadhu Vasvani School", 2, 5.9f));
        graph[177].add(new Edge("Sadhu Vasvani School", "Ajanta Park / Janak Puri", 2, 0.9f));
        graph[343].add(new Edge("Ajanta Park / Janak Puri", "Balaji Park / Satellite Park", 2, 0.92f));
        graph[370].add(new Edge("Balaji Park / Satellite Park", "Aalap Green City", 2, 2.2f));
        graph[55].add(new Edge("Aalap Green City", "Raiya Gam", 2, 3.4f));
                    
        graph[277].add(new Edge("Pradyumna Park","HN Shukla College",  2, 8.7f));
        graph[234].add(new Edge("Marketing Yard", "Pradyumna Park",  2, 5.3f));
        graph[93].add(new Edge("Bhagirath Society","Marketing Yard",  2, 1.3f));
        graph[163].add(new Edge("Lakheshvar Society - R.T.O. Office","Bhagirath Society",  2, 0.3f));
        graph[125].add(new Edge("GramUdhyog Mandir Pedak" , "Lakheshvar Society - R.T.O. Office", 2, 0.9f));
        graph[336].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road","GramUdhyog Mandir Pedak",  2, 1.1f));
        graph[62].add(new Edge("Aayaknagar - Pedak Road","Setelite Chowk - Maruti Nagar Approch Road",  2, 5.4f));
        graph[18].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar","Aayaknagar - Pedak Road" ,  2, 4.7f));
        graph[81].add(new Edge("Champak Nagar - Panino Ghodo","Narayan Nagar Aproch Road - Govind Nagar",  2, 0.2f));
        graph[282].add(new Edge("Patel Vadi","Champak Nagar - Panino Ghodo",  2, 9.1f));
        graph[148].add(new Edge("Parevadi Chowk", "Patel Vadi",  2, 1f));
        graph[107].add(new Edge("Hospital Chowk", "Parevadi Chowk", 2, 2.6f));
        graph[162].add(new Edge("Trikon Baug", "Hospital Chowk", 2, 2.8f));
        graph[79].add(new Edge("Malaviya Chowk", "Trikon Baug", 2, 0.65f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Malaviya Chowk", 2, 0.8f));
        graph[349].add(new Edge("Dharmendrasihnji College", "Ramkrushna Aashram", 2, 0.28f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Dharmendrasihnji College", 2, 1.6f));
        graph[271].add(new Edge("Kishanpara Chowk", "Jilla Panchayat Chowk", 2, 2.2f));
        graph[369].add(new Edge("Swaminarayan Mandir / Mahila", "Kishanpara Chowk", 2, 0.75f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila", 2, 1.8f));
        graph[325].add(new Edge("Indira Circle", "Indubai Mahasatiji Chowk", 2, 2.8f));
        graph[30].add(new Edge("Panchayat Nagar Chowk", "Indira Circle", 2, 0.9f));
        graph[177].add(new Edge("Sadhu Vasvani School", "Panchayat Nagar Chowk", 2, 5.9f));
        graph[343].add(new Edge("Ajanta Park / Janak Puri", "Sadhu Vasvani School", 2, 0.9f));
        graph[370].add(new Edge("Balaji Park / Satellite Park", "Ajanta Park / Janak Puri", 2, 0.92f));
        graph[55].add(new Edge("Aalap Green City", "Balaji Park / Satellite Park", 2, 2.2f));
        graph[119].add(new Edge("Raiya Gam", "Aalap Green City", 2, 3.4f));

        // Route - 3

        graph[190].add(new Edge("Jivraj Park", "Aarya Land Residency", 3, 0.5f));
        graph[321].add(new Edge("Aarya Land Residency", "Jetko Chokdi", 3, 1.5f));
        graph[84].add(new Edge("Jetko Chokdi", "Dream City", 3, 1.5f));
        graph[260].add(new Edge("Dream City", "Mavdi Gam", 3, 1.2f));
        graph[345].add(new Edge("Mavdi Gam", "Mavdi Chowk", 3, 1.2f));
        graph[338].add(new Edge("Mavdi Chowk", "Fuliya Hanuman Mandir", 3, 0.8f));
        graph[225].add(new Edge("Fuliya Hanuman Mandir", "Mavdi Fire Station", 3, 0.25f));
        graph[77].add(new Edge("Mavdi Fire Station", "Aanand Bunglows", 3, 0.45f));
        graph[168].add(new Edge("Aanand Bunglows", "Swaminarayan Chowk", 3, 0.6f));
        graph[185].add(new Edge("Swaminarayan Chowk", "P. D. M. College", 3, 0.95f));
        graph[187].add(new Edge("P. D. M. College", "Gurukul", 3, 1f));
        graph[229].add(new Edge("Gurukul", "Bhaktinagar Circle", 3, 0.75f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Kanta Stri Vikash Gruh", 3, 0.7f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "S.T. Bus Stand", 3, 0.9f));
        graph[3].add(new Edge("S.T. Bus Stand", "Trikon Baug", 3, 0.8f));
        graph[162].add(new Edge("Trikon Baug", "Hospital Chowk", 3, 1.2f));
        graph[107].add(new Edge("Hospital Chowk", "I.P. Mission School", 3, 0.6f));
        graph[195].add(new Edge("I.P. Mission School", "Kothicompound", 3, 1f));
        graph[218].add(new Edge("Kothicompound", "Junction Railway Station", 3, 0.6f));
        graph[96].add(new Edge("Junction Railway Station", "Popatpara Central Jail", 3, 1.9f));
        graph[198].add(new Edge("Popatpara Central Jail", "Popatpara", 3, 0.95f));
        graph[167].add(new Edge("Popatpara", "Central Ware House", 3, 0.6f));
        graph[274].add(new Edge("Central Ware House", "Bhaktinagar Park", 3, 6.3f));

        graph[321].add(new Edge("Aarya Land Residency", "Jivraj Park", 3, 0.5f));
        graph[84].add(new Edge("Jetko Chokdi", "Aarya Land Residency", 3, 1.5f));
        graph[260].add(new Edge("Dream City", "Jetko Chokdi", 3, 1.5f));
        graph[345].add(new Edge("Mavdi Gam", "Dream City", 3, 1.2f));
        graph[338].add(new Edge("Mavdi Chowk", "Mavdi Gam", 3, 1.2f));
        graph[225].add(new Edge("Fuliya Hanuman Mandir", "Mavdi Chowk", 3, 0.8f));
        graph[77].add(new Edge("Mavdi Fire Station", "Fuliya Hanuman Mandir", 3, 0.25f));
        graph[168].add(new Edge("Aanand Bunglows", "Mavdi Fire Station", 3, 0.45f));
        graph[185].add(new Edge("Swaminarayan Chowk", "Aanand Bunglows", 3, 0.6f));
        graph[187].add(new Edge("P. D. M. College", "Swaminarayan Chowk", 3, 0.95f));
        graph[229].add(new Edge("Gurukul", "P. D. M. College", 3, 1f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Gurukul", 3, 0.75f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "Bhaktinagar Circle", 3, 0.7f));
        graph[3].add(new Edge("S.T. Bus Stand", "Kanta Stri Vikash Gruh", 3, 0.9f));
        graph[162].add(new Edge("Trikon Baug", "S.T. Bus Stand", 3, 0.8f));
        graph[107].add(new Edge("Hospital Chowk", "Trikon Baug", 3, 1.2f));
        graph[195].add(new Edge("I.P. Mission School", "Hospital Chowk", 3, 0.6f));
        graph[218].add(new Edge("Kothicompound", "I.P. Mission School", 3, 1f));
        graph[96].add(new Edge("Junction Railway Station", "Kothicompound", 3, 0.6f));
        graph[198].add(new Edge("Popatpara Central Jail", "Junction Railway Station", 3, 1.9f));
        graph[167].add(new Edge("Popatpara", "Popatpara Central Jail", 3, 0.95f));
        graph[274].add(new Edge("Central Ware House", "Popatpara", 3, 0.6f));
        graph[341].add(new Edge("Bhaktinagar Park", "Central Ware House", 3, 6.3f)); 

        // Route - 4

        graph[301].add(new Edge("AajiDam", "Government Polytechnic", 4, 0.19f));
        graph[215].add(new Edge("Government Polytechnic", "Field Marshal Chowk", 4, 1.20f));
        graph[57].add(new Edge("Field Marshal Chowk", "Sarvoday Society", 4, 0.95f));
        graph[127].add(new Edge("Sarvoday Society", "Udhyog Nagar", 4, 2.80f));
        graph[0].add(new Edge("Udhyog Nagar", "Chunarvad Chowk", 4, 3.60f));
        graph[203].add(new Edge("Chunarvad Chowk", "R.M.C East Zone Office", 4, 0.50f));
        graph[71].add(new Edge("R.M.C East Zone Office", "Manhar Pura/Bedinaka Fire Station", 4, 5.10f));
        graph[371].add(new Edge("Manhar Pura/Bedinaka Fire Station", "Jalaram Chowk (Santkabir Road no Khuno)", 4, 5.80f));
        graph[143].add(new Edge("Jalaram Chowk (Santkabir Road no Khuno)", "Patel Vadi", 4, 8.50f));
        graph[282].add(new Edge("Patel Vadi", "Parevadi Chowk", 4, 9.10f));
        graph[148].add(new Edge("Parevadi Chowk", "I.P. Mission School", 4, 1.20f));
        graph[195].add(new Edge("I.P. Mission School", "Hospital Chowk", 4, 1.30f));
        graph[107].add(new Edge("Hospital Chowk", "Jubilee Baug", 4, 0.28f));
        graph[318].add(new Edge("Jubilee Baug", "Trikon Baug", 4, 0.55f));
        graph[162].add(new Edge("Trikon Baug", "Malaviya Chowk", 4, 0.75f));
        graph[79].add(new Edge("Malaviya Chowk", "Ramkrushna Aashram", 4, 0.60f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Hemu Gadhvi Hall", 4, 0.85f));
        graph[2].add(new Edge("Hemu Gadhvi Hall", "Astron Chowk", 4, 0.35f));
        graph[202].add(new Edge("Astron Chowk", "Swaminarayan Mandir / Mahila College Chowk", 4, 0.90f));
        graph[193].add(new Edge("Swaminarayan Mandir / Mahila College Chowk", "Indubai Mahasatiji Chowk", 4, 1.70f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "K.K.V. Hall", 4, 1.00f));
        graph[33].add(new Edge("K.K.V. Hall", "Atmiya College/Central School", 4, 0.75f));
        graph[372].add(new Edge("Atmiya College/Central School", "Crystal Mall", 4, 0.35f));
        graph[145].add(new Edge("Crystal Mall", "Vrundavan Society", 4, 8.80f));
        graph[207].add(new Edge("Vrundavan Society", "A.G. Society", 4, 9.90f));
        graph[61].add(new Edge("A.G. Society", "Everest Park", 4, 0.80f));
        graph[291].add(new Edge("Everest Park", "Mota Mava", 4, 2.60f));
        graph[334].add(new Edge("Mota Mava", "Cosmoplex Cinema", 4, 3.30f));
        graph[337].add(new Edge("Cosmoplex Cinema", "Kankot Kalwad Road", 4, 0.70f));
        graph[251].add(new Edge("Kankot Kalwad Road", "Vruksh Mandir", 4, 0.70f));
        graph[246].add(new Edge("Vruksh Mandir", "Uma P.T.C. College", 4, 0.90f));
        graph[310].add(new Edge("Uma P.T.C. College", "Mukhyamantri Aavas Yogna Quater", 4, 1.40f));
        graph[373].add(new Edge("Mukhyamantri Aavas Yogna Quater", "Haripar Gam", 4, 3.30f));
        graph[233].add(new Edge("Haripar Gam", "W.P. Engineering College", 4, 1.70f));
        graph[374].add(new Edge("W.P. Engineering College", "Virda Vajdi Gam", 4, 1.10f));
        graph[303].add(new Edge("Virda Vajdi Gam", "Vagudad VadVajdi Gam", 4, 6.00f));
        graph[375].add(new Edge("Vagudad VadVajdi Gam", "G.I.D.C. Gate 1", 4, 5.50f));
        graph[41].add(new Edge("G.I.D.C. Gate 1", "G.I.D.C. Gate 2", 4, 0.15f));
        graph[48].add(new Edge("G.I.D.C. Gate 2", "G.I.D.C. Gate 3", 4, 0.70f));

        graph[215].add(new Edge("Government Polytechnic", "AajiDam", 4, 0.19f));
        graph[57].add(new Edge("Field Marshal Chowk", "Government Polytechnic", 4, 1.20f));
        graph[127].add(new Edge("Sarvoday Society", "Field Marshal Chowk", 4, 0.95f));
        graph[0].add(new Edge("Udhyog Nagar", "Sarvoday Society", 4, 2.80f));
        graph[203].add(new Edge("Chunarvad Chowk", "Udhyog Nagar", 4, 3.60f));
        graph[71].add(new Edge("R.M.C East Zone Office", "Chunarvad Chowk", 4, 0.50f));
        graph[371].add(new Edge("Manhar Pura/Bedinaka Fire Station", "R.M.C East Zone Office", 4, 5.10f));
        graph[143].add(new Edge("Jalaram Chowk (Santkabir Road no Khuno)", "Manhar Pura/Bedinaka Fire Station", 4, 5.80f));
        graph[282].add(new Edge("Patel Vadi", "Jalaram Chowk (Santkabir Road no Khuno)", 4, 8.50f));
        graph[148].add(new Edge("Parevadi Chowk", "Patel Vadi", 4, 9.10f));
        graph[195].add(new Edge("I.P. Mission School", "Parevadi Chowk", 4, 1.20f));
        graph[107].add(new Edge("Hospital Chowk", "I.P. Mission School", 4, 1.30f));
        graph[318].add(new Edge("Jubilee Baug", "Hospital Chowk", 4, 0.28f));
        graph[162].add(new Edge("Trikon Baug", "Jubilee Baug", 4, 0.55f));
        graph[79].add(new Edge("Malaviya Chowk", "Trikon Baug", 4, 0.75f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Malaviya Chowk", 4, 0.60f));
        graph[2].add(new Edge("Hemu Gadhvi Hall", "Ramkrushna Aashram", 4, 0.85f));
        graph[202].add(new Edge("Astron Chowk", "Hemu Gadhvi Hall", 4, 0.35f));
        graph[193].add(new Edge("Swaminarayan Mandir / Mahila College Chowk", "Astron Chowk", 4, 0.90f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Swaminarayan Mandir / Mahila College Chowk", 4, 1.70f));
        graph[33].add(new Edge("K.K.V. Hall", "Indubai Mahasatiji Chowk", 4, 1.00f));
        graph[372].add(new Edge("Atmiya College/Central School", "K.K.V. Hall", 4, 0.75f));
        graph[145].add(new Edge("Crystal Mall", "Atmiya College/Central School", 4, 0.35f));
        graph[207].add(new Edge("Vrundavan Society", "Crystal Mall", 4, 8.80f));
        graph[61].add(new Edge("A.G. Society", "Vrundavan Society", 4, 9.90f));
        graph[291].add(new Edge("Everest Park", "A.G. Society", 4, 0.80f));
        graph[334].add(new Edge("Mota Mava", "Everest Park", 4, 2.60f));
        graph[337].add(new Edge("Cosmoplex Cinema", "Mota Mava", 4, 3.30f));
        graph[251].add(new Edge("Kankot Kalwad Road", "Cosmoplex Cinema", 4, 0.70f));
        graph[246].add(new Edge("Vruksh Mandir", "Kankot Kalwad Road", 4, 0.70f));
        graph[310].add(new Edge("Uma P.T.C. College", "Vruksh Mandir", 4, 0.90f));
        graph[373].add(new Edge("Mukhyamantri Aavas Yogna Quater", "Uma P.T.C. College", 4, 1.40f));
        graph[233].add(new Edge("Haripar Gam", "Mukhyamantri Aavas Yogna Quater", 4, 3.30f));
        graph[374].add(new Edge("W.P. Engineering College", "Haripar Gam", 4, 1.70f));
        graph[303].add(new Edge("Virda Vajdi Gam", "W.P. Engineering College", 4, 1.10f));
        graph[375].add(new Edge("Vagudad VadVajdi Gam", "Virda Vajdi Gam", 4, 6.00f));
        graph[41].add(new Edge("G.I.D.C. Gate 1", "Vagudad VadVajdi Gam", 4, 5.50f));
        graph[48].add(new Edge("G.I.D.C. Gate 2", "G.I.D.C. Gate 1", 4, 0.15f));
        graph[50].add(new Edge("G.I.D.C. Gate 3", "G.I.D.C. Gate 2", 4, 0.70f));

        // Route - 5

        graph[119].add(new Edge("Raiya Gam", "Aalap Green City", 5, 4.20f));
        graph[55].add(new Edge("Aalap Green City", "Bapa Sitaram Chowk", 5, 0.75f));
        graph[4].add(new Edge("Bapa Sitaram Chowk", "Raiya Chokdi", 5, 5.50f));
        graph[317].add(new Edge("Raiya Chokdi", "Hanuman Madhi", 5, 3.80f));
        graph[226].add(new Edge("Hanuman Madhi", "Alkapuri", 5, 0.50f));
        graph[43].add(new Edge("Alkapuri", "Aazad Chowk", 5, 0.50f));
        graph[351].add(new Edge("Aazad Chowk", "Aamrapali Fatak", 5, 0.28f));
        graph[174].add(new Edge("Aamrapali Fatak", "Kishanpara Chowk", 5, 0.90f));
        graph[271].add(new Edge("Kishanpara Chowk", "Jilla Panchayat Chowk", 5, 0.55f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Pulchhab Chowk", 5, 0.30f));
        graph[263].add(new Edge("Pulchhab Chowk", "Chitralekha Chowk", 5, 0.40f));
        graph[31].add(new Edge("Chitralekha Chowk", "Limda Chowk", 5, 0.27f));
        graph[240].add(new Edge("Limda Chowk", "Trikon Baug", 5, 0.17f));
        graph[162].add(new Edge("Trikon Baug", "S.T. Bus Stand", 5, 0.85f));
        graph[3].add(new Edge("S.T. Bus Stand", "Kanta Stri Vikash Gruh", 5, 0.85f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "Bhaktinagar Circle", 5, 0.60f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Sheth High school", 5, 0.40f));
        graph[296].add(new Edge("Sheth High school", "Kothariya Coloni", 5, 0.35f));
        graph[235].add(new Edge("Kothariya Coloni", "Sorthiya Vadi Circle", 5, 0.28f));
        graph[82].add(new Edge("Sorthiya Vadi Circle", "Jangleshwer Crossing/ Bapunagar", 5, 0.65f));
        graph[59].add(new Edge("Jangleshwer Crossing/ Bapunagar", "Aaji G.I.D.C.", 5, 1.50f));
        graph[237].add(new Edge("Aaji G.I.D.C.", "Field Marshal Chowk", 5, 0.85f));
        graph[57].add(new Edge("Field Marshal Chowk", "Government Polytechnic", 5, 1.50f));
        graph[215].add(new Edge("Government Polytechnic", "AajiDam", 5, 0.50f));
        graph[301].add(new Edge("AajiDam", "Mahika Patiyu", 5, 5.10f));
        graph[253].add(new Edge("Mahika Patiyu", "kalipat", 5, 5.40f));
        graph[305].add(new Edge("kalipat", "R.K. University", 5, 2.60f));
        graph[38].add(new Edge("R.K. University", "Tramba Gam", 5, 2.80f));

        graph[55].add(new Edge("Aalap Green City", "Raiya Gam", 5, 4.20f));
        graph[4].add(new Edge("Bapa Sitaram Chowk", "Aalap Green City", 5, 0.75f));
        graph[317].add(new Edge("Raiya Chokdi", "Bapa Sitaram Chowk", 5, 5.50f));
        graph[226].add(new Edge("Hanuman Madhi", "Raiya Chokdi", 5, 3.80f));
        graph[43].add(new Edge("Alkapuri", "Hanuman Madhi", 5, 0.50f));
        graph[351].add(new Edge("Aazad Chowk", "Alkapuri", 5, 0.50f));
        graph[174].add(new Edge("Aamrapali Fatak", "Aazad Chowk", 5, 0.28f));
        graph[271].add(new Edge("Kishanpara Chowk", "Aamrapali Fatak", 5, 0.90f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Kishanpara Chowk", 5, 0.55f));
        graph[263].add(new Edge("Pulchhab Chowk", "Jilla Panchayat Chowk", 5, 0.30f));
        graph[31].add(new Edge("Chitralekha Chowk", "Pulchhab Chowk", 5, 0.40f));
        graph[240].add(new Edge("Limda Chowk", "Chitralekha Chowk", 5, 0.27f));
        graph[162].add(new Edge("Trikon Baug", "Limda Chowk", 5, 0.17f));
        graph[3].add(new Edge("S.T. Bus Stand", "Trikon Baug", 5, 0.85f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "S.T. Bus Stand", 5, 0.85f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Kanta Stri Vikash Gruh", 5, 0.60f));
        graph[296].add(new Edge("Sheth High school", "Bhaktinagar Circle", 5, 0.40f));
        graph[235].add(new Edge("Kothariya Coloni", "Sheth High school", 5, 0.35f));
        graph[82].add(new Edge("Sorthiya Vadi Circle", "Kothariya Coloni", 5, 0.28f));
        graph[59].add(new Edge("Jangleshwer Crossing/ Bapunagar", "Sorthiya Vadi Circle", 5, 0.65f));
        graph[237].add(new Edge("Aaji G.I.D.C.", "Jangleshwer Crossing/ Bapunagar", 5, 1.50f));
        graph[57].add(new Edge("Field Marshal Chowk", "Aaji G.I.D.C.", 5, 0.85f));
        graph[215].add(new Edge("Government Polytechnic", "Field Marshal Chowk", 5, 1.50f));
        graph[301].add(new Edge("AajiDam", "Government Polytechnic", 5, 0.50f));
        graph[253].add(new Edge("Mahika Patiyu", "AajiDam", 5, 5.10f));
        graph[305].add(new Edge("kalipat", "Mahika Patiyu", 5, 5.40f));
        graph[38].add(new Edge("R.K. University", "kalipat", 5, 2.60f));
        graph[115].add(new Edge("Tramba Gam", "R.K. University", 5, 2.80f));

        // Route - 6
        
        graph[346].add(new Edge("Santoshinagar Railway Crossing", "Santoshinagar", 6, 0.55f));
        graph[69].add(new Edge("Santoshinagar", "Railnagar", 6, 1.60f));
        graph[175].add(new Edge("Railnagar", "Central Ware House", 6, 0.90f));
        graph[274].add(new Edge("Central Ware House", "Popatpara", 6, 0.55f));
        graph[167].add(new Edge("Popatpara", "Popatpara Central Jail", 6, 0.95f));
        graph[198].add(new Edge("Popatpara Central Jail", "Junction Railway Station", 6, 1.90f));
        graph[96].add(new Edge("Junction Railway Station", "I.P. Mission School", 6, 1.50f));
        graph[195].add(new Edge("I.P. Mission School", "Hospital Chowk", 6, 0.60f));
        graph[107].add(new Edge("Hospital Chowk", "Jubilee Baug", 6, 0.50f));
        graph[318].add(new Edge("Jubilee Baug", "Trikon Baug", 6, 0.50f));
        graph[162].add(new Edge("Trikon Baug", "S.T. Bus Stand", 6, 0.80f));
        graph[3].add(new Edge("S.T. Bus Stand", "Kadvibai School", 6, 1.10f));
        graph[134].add(new Edge("Kadvibai School", "Bhaktinagar Circle", 6, 0.95f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Sheth High school", 6, 0.40f));
        graph[296].add(new Edge("Sheth High school", "Kothariya Coloni", 6, 0.35f));
        graph[235].add(new Edge("Kothariya Coloni", "Sorthiya Vadi Circle", 6, 0.30f));
        graph[82].add(new Edge("Sorthiya Vadi Circle", "Jangleshwer Crossing/ Bapunagar", 6, 0.65f));
        graph[59].add(new Edge("Jangleshwer Crossing/ Bapunagar", "Aaji G.I.D.C.", 6, 1.70f));
        graph[237].add(new Edge("Aaji G.I.D.C.", "Field Marshal Chowk", 6, 0.85f));
        graph[57].add(new Edge("Field Marshal Chowk", "Government Polytechnic", 6, 1.50f));
        graph[215].add(new Edge("Government Polytechnic", "Aajidam Chokdi", 6, 0.50f));
        graph[86].add(new Edge("Aajidam Chokdi", "Mansarovar Society", 6, 0.35f));
        graph[265].add(new Edge("Mansarovar Society", "Aarti Industrial Area", 6, 1.80f));
        graph[252].add(new Edge("Aarti Industrial Area", "Thebchada Mahika Patiyu", 6, 4.20f));
        graph[376].add(new Edge("Thebchada Mahika Patiyu", "Krishna International School", 6, 11.40f));
        graph[329].add(new Edge("Krishna International School", "kalipat", 6, 14.90f));
        graph[305].add(new Edge("kalipat", "R.K. University", 6, 2.70f));
        graph[38].add(new Edge("R.K. University", "Bharad Engineering College", 6, 1.30f));
        graph[306].add(new Edge("Bharad Engineering College", "Tramba Gam", 6, 1.60f));
        
        graph[69].add(new Edge("Santoshinagar", "Santoshinagar Railway Crossing", 6, 0.55f));
        graph[175].add(new Edge("Railnagar", "Santoshinagar", 6, 1.60f));
        graph[274].add(new Edge("Central Ware House", "Railnagar", 6, 0.90f));
        graph[167].add(new Edge("Popatpara", "Central Ware House", 6, 0.55f));
        graph[198].add(new Edge("Popatpara Central Jail", "Popatpara", 6, 0.95f));
        graph[96].add(new Edge("Junction Railway Station", "Popatpara Central Jail", 6, 1.90f));
        graph[195].add(new Edge("I.P. Mission School", "Junction Railway Station", 6, 1.50f));
        graph[107].add(new Edge("Hospital Chowk", "I.P. Mission School", 6, 0.60f));
        graph[318].add(new Edge("Jubilee Baug", "Hospital Chowk", 6, 0.50f));
        graph[162].add(new Edge("Trikon Baug", "Jubilee Baug", 6, 0.50f));
        graph[3].add(new Edge("S.T. Bus Stand", "Trikon Baug", 6, 0.80f));
        graph[134].add(new Edge("Kadvibai School", "S.T. Bus Stand", 6, 1.10f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Kadvibai School", 6, 0.95f));
        graph[296].add(new Edge("Sheth High school", "Bhaktinagar Circle", 6, 0.40f));
        graph[235].add(new Edge("Kothariya Coloni", "Sheth High school", 6, 0.35f));
        graph[82].add(new Edge("Sorthiya Vadi Circle", "Kothariya Coloni", 6, 0.30f));
        graph[59].add(new Edge("Jangleshwer Crossing/ Bapunagar", "Sorthiya Vadi Circle", 6, 0.65f));
        graph[237].add(new Edge("Aaji G.I.D.C.", "Jangleshwer Crossing/ Bapunagar", 6, 1.70f));
        graph[57].add(new Edge("Field Marshal Chowk", "Aaji G.I.D.C.", 6, 0.85f));
        graph[215].add(new Edge("Government Polytechnic", "Field Marshal Chowk", 6, 1.50f));
        graph[86].add(new Edge("Aajidam Chokdi", "Government Polytechnic", 6, 0.50f));
        graph[265].add(new Edge("Mansarovar Society", "Aajidam Chokdi", 6, 0.35f));
        graph[252].add(new Edge("Aarti Industrial Area", "Mansarovar Society", 6, 1.80f));
        graph[376].add(new Edge("Thebchada Mahika Patiyu", "Aarti Industrial Area", 6, 4.20f));
        graph[329].add(new Edge("Krishna International School", "Thebchada Mahika Patiyu", 6, 11.40f));
        graph[305].add(new Edge("kalipat", "Krishna International School", 6, 14.90f));
        graph[38].add(new Edge("R.K. University", "kalipat", 6, 2.70f));
        graph[306].add(new Edge("Bharad Engineering College", "R.K. University", 6, 1.30f));
        graph[115].add(new Edge("Tramba Gam", "Bharad Engineering College", 6, 1.60f));
        
        // Route - 7

        graph[104].add(new Edge("Bajrangvadi Circle", "Punitnagar", 7, 10.00f));
        graph[270].add(new Edge("Punitnagar", "Lakhno Bunglow", 7, 8.60f));
        graph[100].add(new Edge("Lakhno Bunglow", "Jivantika Main Road Crossing", 7, 0.24f));
        graph[102].add(new Edge("Jivantika Main Road Crossing", "Ramapir Chokdi", 7, 1.10f));
        graph[249].add(new Edge("Ramapir Chokdi", "Nanavati Chowk", 7, 0.65f));
        graph[116].add(new Edge("Nanavati Chowk", "Raiya Chokdi", 7, 5.70f));
        graph[317].add(new Edge("Raiya Chokdi", "Bramh Samaj", 7, 1.10f));
        graph[206].add(new Edge("Bramh Samaj", "Hanuman Madhi", 7, 0.80f));
        graph[226].add(new Edge("Hanuman Madhi", "Alkapuri", 7, 0.35f));
        graph[43].add(new Edge("Alkapuri", "Aazad Chowk", 7, 0.45f));
        graph[351].add(new Edge("Aazad Chowk", "Aamrapali Fatak", 7, 0.28f));
        graph[174].add(new Edge("Aamrapali Fatak", "Kishanpara Chowk", 7, 0.90f));
        graph[271].add(new Edge("Kishanpara Chowk", "Jilla Panchayat Chowk", 7, 0.55f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Pulchhab Chowk", 7, 0.30f));
        graph[263].add(new Edge("Pulchhab Chowk", "Chitralekha Chowk", 7, 0.50f));
        graph[31].add(new Edge("Chitralekha Chowk", "Limda Chowk", 7, 0.27f));
        graph[240].add(new Edge("Limda Chowk", "Trikon Baug", 7, 0.17f));
        graph[162].add(new Edge("Trikon Baug", "S.T. Bus Stand", 7, 0.80f));
        graph[3].add(new Edge("S.T. Bus Stand", "Aaryasamaj", 7, 1.30f));
        graph[98].add(new Edge("Aaryasamaj", "Kanta Stri Vikash Gruh", 7, 2.00f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "Bhaktinagar Circle", 7, 0.60f));

        graph[270].add(new Edge("Punitnagar", "Bajrangvadi Circle", 7, 10.00f));
        graph[100].add(new Edge("Lakhno Bunglow", "Punitnagar", 7, 8.60f));
        graph[102].add(new Edge("Jivantika Main Road Crossing", "Lakhno Bunglow", 7, 0.24f));
        graph[249].add(new Edge("Ramapir Chokdi", "Jivantika Main Road Crossing", 7, 1.10f));
        graph[116].add(new Edge("Nanavati Chowk", "Ramapir Chokdi", 7, 0.65f));
        graph[317].add(new Edge("Raiya Chokdi", "Nanavati Chowk", 7, 5.70f));
        graph[206].add(new Edge("Bramh Samaj", "Raiya Chokdi", 7, 1.10f));
        graph[226].add(new Edge("Hanuman Madhi", "Bramh Samaj", 7, 0.80f));
        graph[43].add(new Edge("Alkapuri", "Hanuman Madhi", 7, 0.35f));
        graph[351].add(new Edge("Aazad Chowk", "Alkapuri", 7, 0.45f));
        graph[174].add(new Edge("Aamrapali Fatak", "Aazad Chowk", 7, 0.28f));
        graph[271].add(new Edge("Kishanpara Chowk", "Aamrapali Fatak", 7, 0.90f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Kishanpara Chowk", 7, 0.55f));
        graph[263].add(new Edge("Pulchhab Chowk", "Jilla Panchayat Chowk", 7, 0.30f));
        graph[31].add(new Edge("Chitralekha Chowk", "Pulchhab Chowk", 7, 0.50f));
        graph[240].add(new Edge("Limda Chowk", "Chitralekha Chowk", 7, 0.27f));
        graph[162].add(new Edge("Trikon Baug", "Limda Chowk", 7, 0.17f));
        graph[3].add(new Edge("S.T. Bus Stand", "Trikon Baug", 7, 0.80f));
        graph[98].add(new Edge("Aaryasamaj", "S.T. Bus Stand", 7, 1.30f));
        graph[60].add(new Edge("Kanta Stri Vikash Gruh", "Aaryasamaj", 7, 2.00f));
        graph[123].add(new Edge("Bhaktinagar Circle", "Kanta Stri Vikash Gruh", 7, 0.60f));

        // Route - 8

        graph[23].add(new Edge("Greenland Chokdi", "Marutinagar 50 Feet Road Chowk", 8, 0.75f));
        graph[330].add(new Edge("Marutinagar 50 Feet Road Chowk", "Gurudev Park", 8, 7.60f));
        graph[165].add(new Edge("Gurudev Park", "Ranchhod Aashram", 8, 7.00f));
        graph[56].add(new Edge("Ranchhod Aashram", "Parevadi Chowk", 8, 1.30f));
        graph[148].add(new Edge("Parevadi Chowk", "I.P. Mission School", 8, 1.00f));
        graph[195].add(new Edge("I.P. Mission School", "Hospital Chowk", 8, 0.60f));
        graph[107].add(new Edge("Hospital Chowk", "Jubilee Baug", 8, 0.50f));
        graph[318].add(new Edge("Jubilee Baug", "Trikon Baug", 8, 5.50f));
        graph[162].add(new Edge("Trikon Baug", "S.T. Bus Stand", 8, 0.80f));
        graph[3].add(new Edge("S.T. Bus Stand", "Aaryasamaj", 8, 1.20f));
        graph[98].add(new Edge("Aaryasamaj", "Kadvibai School", 8, 2.30f));
        graph[134].add(new Edge("Kadvibai School", "Makkam Chowk", 8, 0.65f));
        graph[158].add(new Edge("Makkam Chowk", "Aanand Bunglows", 8, 1.10f));
        graph[168].add(new Edge("Aanand Bunglows", "Mavdi Fire Station", 8, 0.45f));
        graph[77].add(new Edge("Mavdi Fire Station", "Fuliya Hanuman Mandir", 8, 0.23f));
        graph[225].add(new Edge("Fuliya Hanuman Mandir", "Mavdi Chowk", 8, 0.60f));
        graph[338].add(new Edge("Mavdi Chowk", "Bapa Sitaram Chowk", 8, 0.65f));
        graph[4].add(new Edge("Bapa Sitaram Chowk", "Mavdi Gam", 8, 0.65f));
        graph[345].add(new Edge("Mavdi Gam", "Dream City", 8, 2.50f));
        graph[260].add(new Edge("Dream City", "Jetko Chokdi", 8, 1.50f));
        graph[84].add(new Edge("Jetko Chokdi", "Government Engineering College", 8, 2.50f));
        graph[87].add(new Edge("Government Engineering College", "Labhubhai Engineering college", 8, 0.70f));

        graph[330].add(new Edge("Marutinagar 50 Feet Road Chowk", "Greenland Chokdi", 8, 0.75f));
        graph[165].add(new Edge("Gurudev Park", "Marutinagar 50 Feet Road Chowk", 8, 7.60f));
        graph[56].add(new Edge("Ranchhod Aashram", "Gurudev Park", 8, 7.00f));
        graph[148].add(new Edge("Parevadi Chowk", "Ranchhod Aashram", 8, 1.30f));
        graph[195].add(new Edge("I.P. Mission School", "Parevadi Chowk", 8, 1.00f));
        graph[107].add(new Edge("Hospital Chowk", "I.P. Mission School", 8, 0.60f));
        graph[318].add(new Edge("Jubilee Baug", "Hospital Chowk", 8, 0.50f));
        graph[162].add(new Edge("Trikon Baug", "Jubilee Baug", 8, 5.50f));
        graph[3].add(new Edge("S.T. Bus Stand", "Trikon Baug", 8, 0.80f));
        graph[98].add(new Edge("Aaryasamaj", "S.T. Bus Stand", 8, 1.20f));
        graph[134].add(new Edge("Kadvibai School", "Aaryasamaj", 8, 2.30f));
        graph[158].add(new Edge("Makkam Chowk", "Kadvibai School", 8, 0.65f));
        graph[168].add(new Edge("Aanand Bunglows", "Makkam Chowk", 8, 1.10f));
        graph[77].add(new Edge("Mavdi Fire Station", "Aanand Bunglows", 8, 0.45f));
        graph[225].add(new Edge("Fuliya Hanuman Mandir", "Mavdi Fire Station", 8, 0.23f));
        graph[338].add(new Edge("Mavdi Chowk", "Fuliya Hanuman Mandir", 8, 0.60f));
        graph[4].add(new Edge("Bapa Sitaram Chowk", "Mavdi Chowk", 8, 0.65f));
        graph[345].add(new Edge("Mavdi Gam", "Bapa Sitaram Chowk", 8, 0.65f));
        graph[260].add(new Edge("Dream City", "Mavdi Gam", 8, 2.50f));
        graph[84].add(new Edge("Jetko Chokdi", "Dream City", 8, 1.50f));
        graph[87].add(new Edge("Government Engineering College", "Jetko Chokdi", 8, 2.50f));
        graph[151].add(new Edge("Labhubhai Engineering college", "Government Engineering College", 8, 0.70f));

        // Route - 9
        
        graph[266].add(new Edge("Arpit Eng. College (Hadala Gam)", "Darshan Eng. College", 9, 1.50f));
        graph[1].add(new Edge("Darshan Eng. College", "Ratanpar (Ramji Mandir)", 9, 2.80f));
        graph[256].add(new Edge("Ratanpar (Ramji Mandir)", "Ratanpar gam", 9, 0.17f));
        graph[323].add(new Edge("Ratanpar gam", "Ratanpar Telephone Exchange", 9, 1.00f));
        graph[220].add(new Edge("Ratanpar Telephone Exchange", "Gauridal", 9, 1.90f));
        graph[164].add(new Edge("Gauridal", "I.O.C.", 9, 1.10f));
        graph[360].add(new Edge("I.O.C.", "Marwadi College", 9, 3.60f));
        graph[39].add(new Edge("Marwadi College", "Bedi Marketing Yard", 9, 3.80f));
        graph[47].add(new Edge("Bedi Marketing Yard", "Bedi", 9, 0.90f));
        graph[49].add(new Edge("Bedi", "150 Feet Jamnagar Road Crossing", 9, 0.65f));
        graph[182].add(new Edge("150 Feet Jamnagar Road Crossing", "Mukhyamantri Aavas Yogna Quarter", 9, 5.20f));
        graph[106].add(new Edge("Mukhyamantri Aavas Yogna Quarter", "Aastha Sangrila", 9, 3.20f));
        graph[25].add(new Edge("Aastha Sangrila", "Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)", 9, 4.00f));
        graph[99].add(new Edge("Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)", "Manhar Pura (150 ft. Ring Road)", 9, 5.30f));
        graph[8].add(new Edge("Manhar Pura (150 ft. Ring Road)", "Madhapar Chowk", 9, 6.30f));
        graph[70].add(new Edge("Madhapar Chowk", "Vora Society", 9, 0.55f));
        graph[76].add(new Edge("Vora Society", "Gaytridham", 9, 4.20f));
        graph[136].add(new Edge("Gaytridham", "Vankaner Society", 9, 3.60f));
        graph[171].add(new Edge("Vankaner Society", "Bajrangvadi", 9, 0.50f));
        graph[324].add(new Edge("Bajrangvadi", "Railway Colony", 9, 1.20f));
        graph[280].add(new Edge("Railway Colony", "Bhomeshvar", 9, 1.60f));
        graph[287].add(new Edge("Bhomeshvar", "Special School For Boys", 9, 0.35f));
        graph[314].add(new Edge("Special School For Boys", "Ruda Office", 9, 0.45f));
        graph[311].add(new Edge("Ruda Office", "Hospital Chowk", 9, 1.60f));
        graph[107].add(new Edge("Hospital Chowk", "Jubilee Baug", 9, 0.50f));
        graph[318].add(new Edge("Jubilee Baug", "Trikon Baug", 9, 0.55f));
        graph[162].add(new Edge("Trikon Baug", "Malaviya Chowk", 9, 0.65f));
        graph[79].add(new Edge("Malaviya Chowk", "Ramkrushna Aashram", 9, 0.50f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Jilla Panchayat Chowk", 9, 1.20f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Kishanpara Chowk", 9, 0.65f));
        graph[271].add(new Edge("Kishanpara Chowk", "Indubai Mahasatiji Chowk", 9, 2.10f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "K.K.V. Hall", 9, 1.50f));
        graph[33].add(new Edge("K.K.V. Hall", "Crystal Mall", 9, 1.10f));
        graph[145].add(new Edge("Crystal Mall", "A.G. Society", 9, 0.60f));
        graph[61].add(new Edge("A.G. Society", "Sarita Vihar", 9, 1.70f));
        graph[247].add(new Edge("Sarita Vihar", "Saurastra University", 9, 2.70f));

        graph[1].add(new Edge("Darshan Eng. College", "Arpit Eng. College (Hadala Gam)", 9, 1.50f));
        graph[256].add(new Edge("Ratanpar (Ramji Mandir)", "Darshan Eng. College", 9, 2.80f));
        graph[323].add(new Edge("Ratanpar gam", "Ratanpar (Ramji Mandir)", 9, 0.17f));
        graph[220].add(new Edge("Ratanpar Telephone Exchange", "Ratanpar gam", 9, 1.00f));
        graph[164].add(new Edge("Gauridal", "Ratanpar Telephone Exchange", 9, 1.90f));
        graph[360].add(new Edge("I.O.C.", "Gauridal", 9, 1.10f));
        graph[39].add(new Edge("Marwadi College", "I.O.C.", 9, 3.60f));
        graph[47].add(new Edge("Bedi Marketing Yard", "Marwadi College", 9, 3.80f));
        graph[49].add(new Edge("Bedi", "Bedi Marketing Yard", 9, 0.90f));
        graph[182].add(new Edge("150 Feet Jamnagar Road Crossing", "Bedi", 9, 0.65f));
        graph[106].add(new Edge("Mukhyamantri Aavas Yogna Quarter", "150 Feet Jamnagar Road Crossing", 9, 5.20f));
        graph[25].add(new Edge("Aastha Sangrila", "Mukhyamantri Aavas Yogna Quarter", 9, 3.20f));
        graph[8].add(new Edge("Manhar Pura (150 ft. Ring Road)", "Aastha Sangrila", 9, 4.00f));
        graph[70].add(new Edge("Madhapar Chowk", "Manhar Pura (150 ft. Ring Road)", 9, 5.30f));
        graph[76].add(new Edge("Vora Society", "Madhapar Chowk", 9, 6.30f));
        graph[136].add(new Edge("Gaytridham", "Vora Society", 9, 0.55f));
        graph[171].add(new Edge("Vankaner Society", "Gaytridham", 9, 4.20f));
        graph[324].add(new Edge("Bajrangvadi", "Vankaner Society", 9, 3.60f));
        graph[280].add(new Edge("Railway Colony", "Bajrangvadi", 9, 0.50f));
        graph[287].add(new Edge("Bhomeshvar", "Railway Colony", 9, 1.20f));
        graph[314].add(new Edge("Special School For Boys", "Bhomeshvar", 9, 1.60f));
        graph[311].add(new Edge("Ruda Office", "Special School For Boys", 9, 0.35f));
        graph[107].add(new Edge("Hospital Chowk", "Ruda Office", 9, 0.45f));
        graph[318].add(new Edge("Jubilee Baug", "Hospital Chowk", 9, 1.60f));
        graph[162].add(new Edge("Trikon Baug", "Jubilee Baug", 9, 0.50f));
        graph[79].add(new Edge("Malaviya Chowk", "Trikon Baug", 9, 0.55f));
        graph[28].add(new Edge("Ramkrushna Aashram", "Malaviya Chowk", 9, 0.65f));
        graph[75].add(new Edge("Jilla Panchayat Chowk", "Ramkrushna Aashram", 9, 0.50f));
        graph[271].add(new Edge("Kishanpara Chowk", "Jilla Panchayat Chowk", 9, 1.20f));
        graph[35].add(new Edge("Indubai Mahasatiji Chowk", "Kishanpara Chowk", 9, 0.65f));
        graph[33].add(new Edge("K.K.V. Hall", "Indubai Mahasatiji Chowk", 9, 2.10f));
        graph[145].add(new Edge("Crystal Mall", "K.K.V. Hall", 9, 1.50f));
        graph[61].add(new Edge("A.G. Society", "Crystal Mall", 9, 1.10f));
        graph[247].add(new Edge("Sarita Vihar", "A.G. Society", 9, 0.60f));
        graph[114].add(new Edge("Saurastra University", "Sarita Vihar", 9, 1.70f));

    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, String curr, String path, String tar,
            Map<Float, String> Map, float length, String source) {

        int currindex = 0;

        String[] dict = {
            "Udhyog Nagar",
            "Darshan Eng. College",
            "Hemu Gadhvi Hall",
            "S.T. Bus Stand",
            "Bapa Sitaram Chowk",
            "Fulvadi Park",
            "Astron Society",
            "K.S. Diesel Engine (80 feet Road Crossing)",
            "Manhar Pura (150 ft. Ring Road)",
            "Navagam",
            "Madhapar Gam",
            "Punit Nagar (Jetko 66 k.v.a.)",
            "Christ College",
            "Hudko Police Chokdi",
            "Swati Society",
            "Ghanshyam Nagar / Nanda Hall",
            "Gopalnagar Choro",
            "Ghanteshvar S.R.P Camp (G- Company Gate)",
            "Narayan Nagar Aproch Road - Govind Nagar",
            "Rajnagar Main Road Crossing",
            "Kankot Patiyu",
            "Akshar Vatika (Mavdi)",
            "Vishvanagar",
            "Greenland Chokdi",
            "Patidar Chowk",
            "Aastha Sangrila",
            "Sankalp Siddhpark",
            "Punit Nagar Chowk",
            "Ramkrushna Aashram",
            "Amin Marg Akshar Marg Crossing",
            "Panchayat Nagar Chowk",
            "Chitralekha Chowk",
            "Jay Sardar Chowk",
            "K.K.V. Hall",
            "Sardar Vallabhbhai Viddhyalay",
            "Indubai Mahasatiji Chowk",
            "Golden Park",
            "Indraprasth Society",
            "R.K. University",
            "Marwadi College",
            "Tulshi Baug",
            "G.I.D.C. Gate 1",
            "Wockhardt Hospital",
            "Alkapuri",
            "Gangotri Park",
            "Nana Mauva Chowk",
            "Refuji Coloni",
            "Bedi Marketing Yard",
            "G.I.D.C. Gate 2",
            "Bedi",
            "G.I.D.C. Gate 3",
            "Gavridad",
            "Vankaner Society Khuno",
            "Bombay Hotel",
            "Ishvariya Park",
            "Aalap Green City",
            "Ranchhod Aashram",
            "Field Marshal Chowk",
            "Divanpara Police Choki",
            "Jangleshwer Crossing/ Bapunagar",
            "Kanta Stri Vikash Gruh",
            "A.G. Society",
            "Aayaknagar - Pedak Road",
            "Baby Doll Museum",
            "Jay Gopal Chowk",
            "Gokulnagar Aproch (Nirav Complex)",
            "Omnagar",
            "Sanidhya Bunglows",
            "Pipaliya Hall / Bhakti Hall",
            "Santoshinagar",
            "Madhapar Chowk",
            "R.M.C East Zone Office",
            "131 Slam quarter",
            "Shivdhara Residency",
            "HN Shukla College",
            "Jilla Panchayat Chowk",
            "Vora Society",
            "Mavdi Fire Station",
            "Dharamnagar",
            "Malaviya Chowk",
            "Maruti Nagar (Sarvodaya Housing Society)",
            "Champak Nagar - Panino Ghodo",
            "Sorthiya Vadi Circle",
            "Patel Chowk",
            "Jetko Chokdi",
            "S.B.I. Bank",
            "Aajidam Chokdi",
            "Government Engineering College",
            "Mansarovar Society / Om Residency",
            "Rajkot Mahanagar Palika - Aavash",
            "Mahila College Chowk (L.I.C Office)",
            "Yadunandan Chowk",
            "Unicare Hospital",
            "Bhagirath Society",
            "Govani Hostel",
            "Balaji Hanuman",
            "Junction Railway Station",
            "Zulelal Mandir",
            "Aaryasamaj",
            "Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)",
            "Lakhno Bunglow",
            "Parsananagar Main Road",
            "Jivantika Main Road Crossing",
            "Radha Krushna Chowk",
            "Bajrangvadi Circle",
            "New Subhashnagar",
            "Mukhyamantri Aavas Yogna Quarter",
            "Hospital Chowk",
            "Shyam Hall",
            "Rajkot Dairy",
            "Madhapar Gam Gate",
            "Vavdi Gam",
            "khokhadadad",
            "Kothariya Chokdi",
            "Saurastra University",
            "Tramba Gam",
            "Nanavati Chowk",
            "Thebchada - Mahika Patiyu",
            "VV.P. Engineering College",
            "Raiya Gam",
            "Gadhiya Nagar",
            "Satya Prakash School",
            "Shantiniketan Park",
            "Bhaktinagar Circle",
            "Hansraj Nagar",
            "GramUdhyog Mandir Pedak",
            "Sainik Society",
            "Sarvoday Society",
            "Vimalnagar",
            "Alfred HighSchool",
            "Aalap Heritage",
            "Aafika Colony",
            "Vrundavan Road Crossing",
            "Shanti Niketan College (Pushkar Dham)",
            "Kadvibai School",
            "Shiv Shakti Colony",
            "Gaytridham",
            "New Rajdeep Society",
            "Gondal Chokdi",
            "Kothariya Housing",
            "Shethnagar",
            "SatyaSai Road Crossing",
            "Transport Nagar",
            "Jalaram Chowk (Santkabir Road no Khuno)",
            "Munjaka Gam",
            "Crystal Mall",
            "R.T.O. Office",
            "S.T. Workshop",
            "Parevadi Chowk",
            "Gondal Chowk",
            "Aaji Vasahat",
            "Labhubhai Engineering college",
            "Suryamukhi Hanuman Chowk",
            "Ramdevpir Chowk",
            "A.G. Staff Quater",
            "Jasani School",
            "Svashray Society",
            "Chandreshvadi Chowk",
            "Makkam Chowk",
            "Amrut Park Main Road",
            "Vidhyutnagar",
            "Rameshvar Chowk",
            "Trikon Baug",
            "Lakheshvar Society - R.T.O. Office",
            "Gauridal",
            "Gurudev Park",
            "Junction Railway Police Station",
            "Popatpara",
            "Aanand Bunglows",
            "Shitalamataji Nu Mandir",
            "Gitanagar",
            "Vankaner Society",
            "Vima nu Davakhanu",
            "Govind Baug",
            "Aamrapali Fatak",
            "Railnagar",
            "Pardi Road Crossing",
            "Sadhu Vasvani School",
            "Guruprasad Chowk",
            "Git Gurjari Crossing",
            "Govind Nagar",
            "Nana Mava Chowk",
            "150 Feet Jamnagar Road Crossing",
            "Naloda Nagar",
            "Sinchai Nagar",
            "Swaminarayan Chowk",
            "Chunarvad Chowk Ramnath Para (B Division Police Station)",
            "P. D. M. College",
            "Pardi Gam",
            "Bhaktinagar Station",
            "Jivraj Park",
            "Nilkanth Cinema",
            "53 Quarter / Popatpara",
            "Swaminarayan Mandir / Mahila College Chowk",
            "Gabanshahpir Dargah",
            "I.P. Mission School",
            "Ramnath para Muktidham",
            "Gautam Buddh Nagar",
            "Popatpara Central Jail",
            "Pushkar dham",
            "Police HeadQuarter",
            "Sant Bhojaram Road Crossing",
            "Astron Chowk",
            "Chunarvad Chowk",
            "Shree Sahjanand Dham",
            "Trishul Chowk",
            "Bramh Samaj",
            "Vrundavan Society",
            "Ghanteshvar S.R.P. Camp",
            "Shree City (Munjka gam)",
            "Vinod Nagar",
            "Ashapura Mandir",
            "Goverdhan Chowk",
            "Umiya Chowk",
            "Akshar Complex",
            "Government Polytechnic",
            "Jay Prakashnagar Society",
            "Babariya Colony",
            "Kothicompound",
            "Satyam Park",
            "Ratanpar Telephone Exchange",
            "Taramandal / RaceCource",
            "Ambika Township",
            "Jaljit Hall",
            "Mochinagar",
            "Fuliya Hanuman Mandir",
            "Hanuman Madhi",
            "Aaji 66 KV Station (Vasahat Road Crossing)",
            "Vagudad",
            "Gurukul",
            "Raghuvanshi Society",
            "Astha Residency",
            "Om Residency",
            "Haripar Gam",
            "Marketing Yard",
            "Kothariya Coloni",
            "Manhar Pura / Bedinaka Fire Station",
            "Aaji G.I.D.C.",
            "Chandranagar Shakmarket",
            "Ghanteshvar Park",
            "Limda Chowk",
            "Madhurnagar",
            "50 Feet Road Crossing",
            "Jalaram Chowk (Gayatrinagar Road)",
            "Dudhsagar Road Crossing",
            "Aksharnagar",
            "Vruksh Mandir",
            "Sarita Vihar",
            "Rajshri Auto",
            "Ramapir Chokdi",
            "Sanskar City",
            "Kankot Kalwad Road",
            "Aarti Industrial Area",
            "Mahika Patiyu",
            "Ambaji Kadva Plot P.D.M. College",
            "R.M.C. Transport Nagar",
            "Ratanpar (Ramji Mandir)",
            "Central Jail",
            "Dr. Aambedkar Chowk",
            "Dudheshvar Mahadev",
            "Dream City",
            "Prashil Park",
            "VadVajdi Gam",
            "Pulchhab Chowk",
            "Aahir Chowk",
            "Mansarovar Society",
            "Arpit Eng. College (Hadala Gam)",
            "Devpara",
            "Ranuja Madir",
            "Jay Javan Jay Kishan Society",
            "Punitnagar",
            "Kishanpara Chowk",
            "Shymal City",
            "Jilla Garden Chowk",
            "Central Ware House",
            "Mahapuja Dham",
            "Shardabaug",
            "Pradyumna Park",
            "Satyasai Hospital",
            "Kothariya",
            "Railway Colony",
            "Ayodhya Park Chowk",
            "Patel Vadi",
            "Ambedkar Chowk",
            "Ashok Garden",
            "Jivraj Hospital",
            "Kothariya Solvant",
            "Bhomeshvar",
            "Gokuldham",
            "Jubilee Watson Museum",
            "Mahakali Society",
            "Everest Park",
            "Lashdhara Park",
            "Velnathpara Saruaat (Shala No. 71 Paase)",
            "Shapar Veraval",
            "Jograna Chowk",
            "Sheth High school",
            "Parsananagar (Ayyapa Mandir)",
            "Bahumali Bhavan",
            "Raiya Chowk",
            "Bhagavati Para Sheri No. 9",
            "AajiDam",
            "Atmiya College / Central School",
            "Virda Vajdi Gam",
            "Panchshil society",
            "kalipat",
            "Bharad Engineering College",
            "Chaudhri Highschool",
            "Aastha Green City",
            "Parsananagar",
            "Uma P.T.C. College",
            "Ruda Office",
            "Kuvadva Police Choki",
            "Raiya TelePhone Exchange",
            "Special School For Boys",
            "Gundavadi Police Choki",
            "Gautam Nagar",
            "Raiya Chokdi",
            "Jubilee Baug",
            "Panchshill Society Aproch Road (Dalibai Hostel)",
            "Bhagavatipara (Jay Prakashnagar)",
            "Aarya Land Residency",
            "Alay Park",
            "Ratanpar gam",
            "Bajrangvadi",
            "Indira Circle",
            "Amin Marg Sivik Center",
            "Jashani School Fatak",
            "Ganjanand Chowk",
            "Krishna International School",
            "Marutinagar 50 Feet Road Chowk",
            "Radha Mira Industrial Area",
            "Valkeshvar",
            "J.K.Park (Raiya Gam)",
            "Mota Mava",
            "Raiya Telephone Exchange",
            "Setelite Chowk - Maruti Nagar Approch Road",
            "Cosmoplex Cinema",
            "Mavdi Chowk",
            "Maha Puja Dham Chowk",
            "Om Nagar Chowk",
            "Bhaktinagar Park",
            "Jivan Jyot School",
            "Ajanta Park / Janak Puri",
            "AV. Jashani T.B. Hospital",
            "Mavdi Gam",
            "Santoshinagar Railway Crossing",
            "Balaji Park/Satellite Park",
            "Shri Dhrmeshwar Marg Chowk",
            "Dharmendrasihnji College",
            "P and T Colony / Gitanagar",
            "Aazad Chowk",
            "West Zone Office",
            "Akashvani Chowk",
            "Shastrinagar",
            "Velnathpara (Sheri No. 17)",
            "Parapipaliya Gam (ekta Society)",
            "Lalbahadur Society (Pardi Road)",
            "Raiyadhar Slam",
            "Gujarat Housing Bodak Quarter",
            "I.O.C.",
            "BT Savani (Kidni) Hospital",
            "Nageshvar Jain Derasar",
            "Bhagavati Para Police Choki",
            "B.A. Dangar College",
            "Shital Park",
            "Rangoli Park (Lakshmi Dholo)",
            "Ghanteshvar Gam",
            "Pandit Dindayal" , 
            "Swaminarayan Mandir / Mahila",
            "Balaji Park / Satellite Park"
        };

        for (int i = 0; i < dict.length; i++) {
            if (dict[i].equals(curr)) {
                currindex = i;
                break;
            }
        }

        String RouteNo = "Destination";
        if (curr.equals(tar)) {
            for (int i = 0; i < graph[currindex].size(); i++) {
                Edge edge = graph[currindex].get(i);

                if (edge.Destination.equals(tar)) {
                    RouteNo = "R-" + Integer.toString(edge.Route);
                }
            }

            Map.put(length, path + "\n" + RouteNo + " : " + tar);
            return;
        } else {

            vis[currindex] = true;

            for (int i = 0; i < graph[currindex].size(); i++) {
                Edge e = graph[currindex].get(i);

                if(e.Route == 0) {
                    RouteNo = "BRTS";
                }

                else {
                    RouteNo = "R-" + Integer.toString(e.Route);
                }

                int desindex = 0;
                for (int j = 0; j < dict.length; j++) {
                    if (dict[j].equals(e.Destination)) {
                        desindex = j;
                        break;
                    }
                }

                if (!vis[desindex]) {
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

            vis[currindex] = false;
        }
    }
}
