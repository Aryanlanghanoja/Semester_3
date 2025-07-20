import java.util.*;

public class NewAlgo {
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
    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, String curr, String path, String tar,
            Map<Float, String> Map, float length , String source) {
        if (curr.equals(tar)) {
            Map.put(length, path + " -> " + tar);
            return;
        }

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
        Scanner sc = new Scanner(System.in);
        int noOfStations = 379 ;
        ArrayList<Edge>[] graph = new ArrayList[noOfStations];
        Map<Float, String> Map = new HashMap<>();
        createGraph(graph);
        System.out.println("Enter Your Source :- ");
        String src = sc.nextLine();
        System.out.println("Enter Your Destination :- ");
        String tar = sc.nextLine();
        boolean visit[] = new boolean[noOfStations];
        printAllPath(graph, visit, src, "", tar, Map, 0.0f , src);

        List<Map.Entry<Float, String>> entryList = new ArrayList<>(Map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Float, String>>() {
            @Override
            public int compare(Map.Entry<Float, String> entry1, Map.Entry<Float, String> entry2) {
                return Float.compare(entry1.getKey(), entry2.getKey());
            }
        });

        // int i = 0;
        // System.out.println("All Possible Paths:");
        // for (Map.Entry<Float, String> entry : entryList) {
        //     i++;
        //     System.out.println(i + ") Path: " + entry.getValue() + "\nLength: " + entry.getKey()
        //             + " km " + "\n___________________________________________");
        // }

        System.out.println("Shortest Path:");
        if (!entryList.isEmpty()) {
            Map.Entry<Float, String> firstEntry = entryList.get(0);
            System.out.println("Path: " + firstEntry.getValue() + "\nLength: " + firstEntry.getKey() + " km");
        } else {
            System.out.println("No paths available.");
        }
    }
}
