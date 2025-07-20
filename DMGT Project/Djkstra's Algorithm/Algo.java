import java.util.*;

public class Algo {

    static class Edge {
        String Destination ;
        int Route;
        float Distance ;

        public Edge (String Destination , int Route , float Distance) {
            this.Destination = Destination ;
            this.Route = Route ;
            this.Distance = Distance ;
        }
    }

    public static String getSrc() {
        Scanner sc = new Scanner(System.in);
        String Source ;
        System.out.print("Enter Your Source :- ");
        Source = sc.nextLine();
        return Source ;
    }

    public static String getTar() {
        Scanner sc = new Scanner(System.in);
        String Destination ;
        System.out.print("Enter Your Destination :- ");
        Destination = sc.nextLine();
        return Destination ;
    }

    public static void createGraph(List<Edge>[] graph , Map<String,Integer> station) {
        station.put("Madhapar Chowk",0);
        station.put("Ayodhya Park Chowk",1);
        station.put("Shital Park",2);
        station.put("Ramdevpir Chowk",3);
        station.put("Nanavati Chowk",4);
        station.put("Raiya Chowk",5);
        station.put("Raiya TelePhone Exchange",6);
        station.put("Indira Circle",7);
        station.put("West Zone Office",8);
        station.put("Nana Mava Chowk",9);
        station.put("Maha Puja Dham Chowk",10);
        station.put("Om Nagar Chowk",11);
        station.put("Mavdi Chowk",12);
        station.put("Umiya Chowk",13);
        station.put("Ambedkar Chowk",14);
        station.put("Goverdhan Chowk",15);
        station.put("Punit Nagar Chowk",16);
        station.put("Gondal Chowk",17);
        station.put("Saurastra University",18);
        station.put("BT Savani (Kidni) Hospital",19);
        station.put("Akashvani Chowk",20);
        station.put("Panchayat Nagar Chowk",21);
        station.put("Indubai Mahasatiji Chowk",22);
        station.put("Swaminarayan Mandir / Mahila",23);
        station.put("Astron Chowk",24);
        station.put("Hemu Gadhvi Hall",25);
        station.put("Ramkrushna Aashram",26);
        station.put("Malaviya Chowk",27);
        station.put("Trikon Baug",28);
        station.put("HN Shukla College",29);
        station.put("Pradyumna Park",30);
        station.put("Marketing Yard",31);
        station.put("Bhagirath Society",32);
        station.put("Lakheshvar Society - R.T.O. Office",33);
        station.put("GramUdhyog Mandir Pedak",34);
        station.put("Setelite Chowk - Maruti Nagar Approch Road",35);
        station.put("Aayaknagar - Pedak Road",36);
        station.put("Narayan Nagar Aproch Road - Govind Nagar",37);
        station.put("Champak Nagar - Panino Ghodo",38);
        station.put("Patel Vadi",39);
        station.put("Parevadi Chowk",40);
        station.put("Hospital Chowk",41);
        station.put("Jubilee Baug",42);
        station.put("Kothicompound",43);
        station.put("Junction Railway Station",44);
        station.put("Popatpara Central Jail",45);
        station.put("Popatpara",46);
        station.put("Central Ware House",47);
        station.put("AajiDam",48);
        station.put("Government Polytechnic",49);
        station.put("Field Marshal Chowk",50);
        station.put("Sarvoday Society",51);
        station.put("Udhyog Nagar",52);
        station.put("Chunarvad Chowk",53);
        station.put("R.M.C East Zone Office",54);
        station.put("Manhar Pura/Bedinaka Fire Station",55);
        station.put("Jalaram Chowk (Santkabir Road no Khuno)",56);
        station.put("Aajidam Chokdi",57);
        station.put("Mansarovar Society",58);
        station.put("Aarti Industrial Area",59);
        station.put("Thebchada Mahika Patiyu",60);
        station.put("Krishna International School",61);
        station.put("kalipat",62);
        station.put("R.K. University",63);
        station.put("Tramba Gam",64);
        station.put("Santoshinagar Railway Crossing",65);
        station.put("Santoshinagar",66);
        station.put("Railnagar",67);
        station.put("Central Ware House",68);
        station.put("Popatpara",69);
        station.put("Jangleshwer Crossing/ Bapunagar",70);
        station.put("Aaji G.I.D.C.",71);
        station.put("Field Marshal Chowk",72);
        station.put("Government Polytechnic",73);
        station.put("AajiDam",74);
        station.put("Mahika Patiyu",75);
        station.put("kalipat",76);
        station.put("R.K. University",77);
        station.put("Bharad Engineering College",78);
        station.put("Tramba Gam",79);
        station.put("Bajrangvadi Circle",80);
        station.put("Punitnagar",81);
        station.put("Lakhno Bunglow",82);
        station.put("Jivantika Main Road Crossing",83);
        station.put("Ramapir Chokdi",84);
        station.put("Bramh Samaj",85);
        station.put("Government Engineering College",86);
        station.put("Labhubhai Engineering college",87);
        station.put("Arpit Eng. College (Hadala Gam)",88);
        station.put("Darshan Eng. College",89);
        station.put("Ratanpar (Ramji Mandir)",90);
        station.put("Ratanpar gam",91);
        station.put("Ratanpar Telephone Exchange",92);
        station.put("Gauridal",93);
        station.put("I.O.C.",94);
        station.put("Marwadi College",95);
        station.put("Bedi Marketing Yard",96);
        station.put("Bedi",97);
        station.put("150 Feet Jamnagar Road Crossing",98);
        station.put("Mukhyamantri Aavas Yogna Quarter",99);
        station.put("Aastha Sangrila",100);
        station.put("Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)",101);
        station.put("Manhar Pura (150 ft. Ring Road)",102);
        station.put("Vora Society",103);
        station.put("Gaytridham",104);
        station.put("Vankaner Society",105);
        station.put("Bajrangvadi",106);
        station.put("Railway Colony",107);
        station.put("Bhomeshvar",108);
        station.put("Special School For Boys",109);
        station.put("Ruda Office",110);
        station.put("Kadvibai School",111);
        station.put("Sheth High school",112);
        station.put("Kothariya Coloni",113);
        station.put("Sorthiya Vadi Circle",114);
        station.put("Jangleshwer Crossing/ Bapunagar",115);
        station.put("Aaji G.I.D.C.",116);
        station.put("Field Marshal Chowk",117);
        station.put("Aajidam Chokdi",118);
        station.put("Mansarovar Society",119);
        station.put("Aarti Industrial Area",120);
        station.put("Thebchada Mahika Patiyu",121);
        station.put("Krishna International School",122);
        station.put("kalipat",123);
        station.put("R.K. University",124);
        station.put("Bharad Engineering College",125);
        station.put("Tramba Gam",126);
        station.put("Dharmendrasihnji College",127);
        station.put("Jilla Panchayat Chowk",128);
        station.put("Kishanpara Chowk",129);
        station.put("Sadhu Vasvani School",130);
        station.put("Ajanta Park / Janak Puri",131);
        station.put("Balaji Park / Satellite Park",132);
        station.put("Aalap Green City",133);
        station.put("Raiya Gam",134);
        station.put("Jivraj Park",135);
        station.put("Aarya Land Residency",136);
        station.put("Jetko Chokdi",137);
        station.put("Dream City",138);
        station.put("Mavdi Gam",139);
        station.put("Fuliya Hanuman Mandir",140);
        station.put("Mavdi Fire Station",141);
        station.put("Aanand Bunglows",142);
        station.put("Swaminarayan Chowk",143);
        station.put("P. D. M. College",144);
        station.put("Gurukul",145);
        station.put("Bhaktinagar Circle",146);
        station.put("Kanta Stri Vikash Gruh",147);
        station.put("S.T. Bus Stand",148);
        station.put("I.P. Mission School",149);
        station.put("Bhaktinagar Park",150);
        station.put("Swaminarayan Mandir / Mahila College Chowk",151);
        station.put("K.K.V. Hall",152);
        station.put("Atmiya College/Central School",153);
        station.put("Crystal Mall",154);
        station.put("Vrundavan Society",155);
        station.put("A.G. Society",156);
        station.put("Everest Park",157);
        station.put("Mota Mava",158);
        station.put("Cosmoplex Cinema",159);
        station.put("Kankot Kalwad Road",160);
        station.put("Vruksh Mandir",161);
        station.put("Uma P.T.C. College",162);
        station.put("Haripar Gam",163);
        station.put("W.P. Engineering College",164);
        station.put("Virda Vajdi Gam",165);
        station.put("Vagudad VadVajdi Gam",166);
        station.put("G.I.D.C. Gate 1",167);
        station.put("G.I.D.C. Gate 2",168);
        station.put("G.I.D.C. Gate 3",169);
        station.put("Bapa Sitaram Chowk",170);
        station.put("Raiya Chokdi",171);
        station.put("Hanuman Madhi",172);
        station.put("Alkapuri",173);
        station.put("Aazad Chowk",174);
        station.put("Aamrapali Fatak",175);
        station.put("Pulchhab Chowk",176);
        station.put("Chitralekha Chowk",177);
        station.put("Limda Chowk",178);
        station.put("Aaryasamaj",179);
        station.put("Greenland Chokdi",180);
        station.put("Marutinagar 50 Feet Road Chowk",181);
        station.put("Gurudev Park",182);
        station.put("Ranchhod Aashram",183);
        station.put("Makkam Chowk",184);
        station.put("Sarita Vihar",185);

        graph[0].add(new Edge("Ayodhya Park Chowk", 0, 0.6f));
        graph[1].add(new Edge("Shital Park", 0, 0.65f));
        graph[2].add(new Edge("Ramdevpir Chowk", 0, 0.9f));
        graph[3].add(new Edge("Nanavati Chowk", 0, 0.75f));
        graph[4].add(new Edge("Raiya Chowk", 0, 0.55f));
        graph[5].add(new Edge("Raiya TelePhone Exchange", 0, 1.2f));
        graph[6].add(new Edge("Indira Circle", 0, 0.8f));
        graph[7].add(new Edge("West Zone Office", 0, 1.4f));
        graph[8].add(new Edge("Nana Mava Chowk", 0, 0.65f));
        graph[9].add(new Edge("Maha Puja Dham Chowk", 0, 0.7f));
        graph[10].add(new Edge("Om Nagar Chowk", 0, 0.5f));
        graph[11].add(new Edge("Mavdi Chowk", 0, 0.55f));
        graph[12].add(new Edge("Umiya Chowk", 0, 0.7f));
        graph[13].add(new Edge("Ambedkar Chowk", 0, 0.7f));
        graph[14].add(new Edge("Goverdhan Chowk", 0, 0.5f));
        graph[15].add(new Edge("Punit Nagar Chowk", 0, 0.6f));
        graph[16].add(new Edge("Gondal Chowk", 0, 0.75f));
        
        graph[1].add(new Edge("Madhapar Chowk", 0, 0.6f));
        graph[2].add(new Edge("Ayodhya Park Chowk", 0, 0.65f));
        graph[3].add(new Edge("Shital Park", 0, 0.9f));
        graph[4].add(new Edge("Nanavati Chowk", 0, 0.75f));
        graph[5].add(new Edge("Raiya Chowk", 0, 0.55f));
        graph[6].add(new Edge("Raiya Chowk", 0, 1.2f));
        graph[7].add(new Edge("Raiya TelePhone Exchange", 0, 0.8f));
        graph[8].add(new Edge("Indira Circle", 0, 1.4f));
        graph[9].add(new Edge("West Zone Office", 0, 0.65f));
        graph[10].add(new Edge("Nana Mava Chowk", 0, 0.7f));
        graph[11].add(new Edge("Maha Puja Dham Chowk", 0, 0.5f));
        graph[12].add(new Edge("Om Nagar Chowk", 0, 0.55f));
        graph[13].add(new Edge("Mavdi Chowk", 0, 0.7f));
        graph[14].add(new Edge("Umiya Chowk", 0, 0.7f));
        graph[15].add(new Edge("Ambedkar Chowk", 0, 0.5f));
        graph[16].add(new Edge("Goverdhan Chowk", 0, 0.6f));
        graph[17].add(new Edge("Punit Nagar Chowk", 0, 0.75f));
        
        
        // Route - 1 

        graph[18].add(new Edge("BT Savani (Kidni) Hospital" , 1 , 1.4f));
        graph[19].add(new Edge("Akashvani Chowk" , 1 , 0.75f));
        graph[20].add(new Edge("Panchayat Nagar Chowk" , 1 , 0.8f));
        graph[21].add(new Edge("Indira Circle" , 1 , 0.65f));
        graph[7].add(new Edge("Indubai Mahasatiji Chowk" , 1 , 0.85f));
        graph[22].add(new Edge("Swaminarayan Mandir / Mahila" , 1 , 0.8f));
        graph[23].add(new Edge("Astron Chowk" , 1 , 0.85f));
        graph[24].add(new Edge("Hemu Gadhvi Hall" , 1 , 1.1f));
        graph[25].add(new Edge("Ramkrushna Aashram" , 1 , 0.75f));
        graph[26].add(new Edge("Malaviya Chowk" , 1 , 0.75f));
        graph[27].add(new Edge("Trikon Baug" , 1 , 0.6f));

        graph[19].add(new Edge("Saurastra University" , 1 , 1.4f));
        graph[20].add(new Edge("BT Savani (Kidni) Hospital" , 1 , 0.75f));
        graph[21].add(new Edge("Akashvani Chowk" , 1 , 0.8f));
        graph[7].add(new Edge("Panchayat Nagar Chowk" ,  1 , 0.65f));
        graph[22].add(new Edge("Indira Circle" , 1 , 0.85f));
        graph[23].add(new Edge("Indubai Mahasatiji Chowk" ,  1 , 0.8f));
        graph[24].add(new Edge("Swaminarayan Mandir / Mahila" ,  1 , 0.85f));
        graph[25].add(new Edge("Astron Chowk" , 1 , 1.1f));
        graph[26].add(new Edge("Hemu Gadhvi Hall" ,  1 , 0.75f));
        graph[27].add(new Edge("Ramkrushna Aashram" , 1 , 0.75f));
        graph[28].add(new Edge("Malaviya Chowk" , 1 , 0.6f));

        // Route - 2

        graph[29].add(new Edge("Pradyumna Park", 2, 8.7f));
        graph[30].add(new Edge("Marketing Yard", 2, 5.3f));
        graph[31].add(new Edge("Bhagirath Society", 2, 1.3f));
        graph[32].add(new Edge("Lakheshvar Society - R.T.O. Office", 2, 0.3f));
        graph[33].add(new Edge("GramUdhyog Mandir Pedak", 2, 0.9f));
        graph[34].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road", 2, 1.1f));
        graph[35].add(new Edge("Aayaknagar - Pedak Road", 2, 5.4f));
        graph[36].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar", 2, 4.7f));
        graph[37].add(new Edge("Champak Nagar - Panino Ghodo", 2, 0.2f));
        graph[38].add(new Edge("Patel Vadi", 2, 9.1f));
        graph[39].add(new Edge("Parevadi Chowk", 2, 1f));
        graph[40].add(new Edge("Hospital Chowk", 2, 2.6f));
        graph[41].add(new Edge("Trikon Baug", 2, 2.8f));
        graph[28].add(new Edge("Malaviya Chowk", 2, 0.65f));
        graph[27].add(new Edge("Ramkrushna Aashram", 2, 0.8f));
        graph[26].add(new Edge("Dharmendrasihnji College", 2, 0.28f));
        graph[127].add(new Edge("Jilla Panchayat Chowk", 2, 1.6f));
        graph[128].add(new Edge("Kishanpara Chowk", 2, 2.2f));
        graph[129].add(new Edge("Swaminarayan Mandir / Mahila", 2, 0.75f));
        graph[23].add(new Edge("Indubai Mahasatiji Chowk", 2, 1.8f));
        graph[22].add(new Edge("Indira Circle", 2, 2.8f));
        graph[7].add(new Edge("Panchayat Nagar Chowk", 2, 0.9f));
        graph[21].add(new Edge("Sadhu Vasvani School", 2, 5.9f));
        graph[130].add(new Edge("Ajanta Park / Janak Puri", 2, 0.9f));
        graph[131].add(new Edge("Balaji Park / Satellite Park", 2, 0.92f));
        graph[132].add(new Edge("Aalap Green City", 2, 2.2f));
        graph[133].add(new Edge("Raiya Gam", 2, 3.4f));
                    
        graph[29].add(new Edge("HN Shukla College",  2, 8.7f));
        graph[30].add(new Edge("Pradyumna Park",  2, 5.3f));
        graph[31].add(new Edge("Marketing Yard",  2, 1.3f));
        graph[32].add(new Edge("Bhagirath Society",  2, 0.3f));
        graph[33].add(new Edge("Lakheshvar Society - R.T.O. Office", 2, 0.9f));
        graph[34].add(new Edge("GramUdhyog Mandir Pedak",  2, 1.1f));
        graph[35].add(new Edge("Setelite Chowk - Maruti Nagar Approch Road",  2, 5.4f));
        graph[36].add(new Edge("Aayaknagar - Pedak Road" ,  2, 4.7f));
        graph[37].add(new Edge("Narayan Nagar Aproch Road - Govind Nagar",  2, 0.2f));
        graph[38].add(new Edge("Champak Nagar - Panino Ghodo",  2, 9.1f));
        graph[39].add(new Edge("Patel Vadi",  2, 1f));
        graph[40].add(new Edge("Parevadi Chowk", 2, 2.6f));
        graph[28].add(new Edge("Hospital Chowk", 2, 2.8f));
        graph[27].add(new Edge("Trikon Baug", 2, 0.65f));
        graph[26].add(new Edge("Malaviya Chowk", 2, 0.8f));
        graph[127].add(new Edge("Ramkrushna Aashram", 2, 0.28f));
        graph[128].add(new Edge("Dharmendrasihnji College", 2, 1.6f));
        graph[129].add(new Edge("Jilla Panchayat Chowk", 2, 2.2f));
        graph[23].add(new Edge("Kishanpara Chowk", 2, 0.75f));
        graph[22].add(new Edge("Swaminarayan Mandir / Mahila", 2, 1.8f));
        graph[7].add(new Edge("Indubai Mahasatiji Chowk", 2, 2.8f));
        graph[21].add(new Edge("Indira Circle", 2, 0.9f));
        graph[130].add(new Edge("Panchayat Nagar Chowk", 2, 5.9f));
        graph[131].add(new Edge("Sadhu Vasvani School", 2, 0.9f));
        graph[132].add(new Edge("Ajanta Park / Janak Puri", 2, 0.92f));
        graph[133].add(new Edge("Balaji Park / Satellite Park", 2, 2.2f));
        graph[134].add(new Edge("Aalap Green City", 2, 3.4f));

        // Route - 3 

        graph[135].add(new Edge("Aarya Land Residency", 3, 0.5f));
        graph[136].add(new Edge("Jetko Chokdi", 3, 1.5f));
        graph[137].add(new Edge("Dream City", 3, 1.5f));
        graph[138].add(new Edge("Mavdi Gam", 3, 1.2f));
        graph[139].add(new Edge("Mavdi Chowk", 3, 1.2f));
        graph[12].add(new Edge("Fuliya Hanuman Mandir", 3, 0.8f));
        graph[140].add(new Edge("Mavdi Fire Station", 3, 0.25f));
        graph[141].add(new Edge("Aanand Bunglows", 3, 0.45f));
        graph[142].add(new Edge("Swaminarayan Chowk", 3, 0.6f));
        graph[143].add(new Edge("P. D. M. College", 3, 0.95f));
        graph[144].add(new Edge("Gurukul", 3, 1f));
        graph[145].add(new Edge("Bhaktinagar Circle", 3, 0.75f));
        graph[146].add(new Edge("Kanta Stri Vikash Gruh", 3, 0.7f));
        graph[147].add(new Edge("S.T. Bus Stand", 3, 0.9f));
        graph[148].add(new Edge("Trikon Baug", 3, 0.8f));
        graph[28].add(new Edge("Hospital Chowk", 3, 1.2f));
        graph[41].add(new Edge("I.P. Mission School", 3, 0.6f));
        graph[149].add(new Edge("Kothicompound", 3, 1f));
        graph[43].add(new Edge("Junction Railway Station", 3, 0.6f));
        graph[44].add(new Edge("Popatpara Central Jail", 3, 1.9f));
        graph[45].add(new Edge("Popatpara", 3, 0.95f));
        graph[46].add(new Edge("Central Ware House", 3, 0.6f));
        graph[47].add(new Edge("Bhaktinagar Park", 3, 6.3f));

        graph[136].add(new Edge("Jivraj Park", 3, 0.5f));
        graph[137].add(new Edge("Aarya Land Residency", 3, 1.5f));
        graph[138].add(new Edge("Jetko Chokdi", 3, 1.5f));
        graph[139].add(new Edge("Dream City", 3, 1.2f));
        graph[12].add(new Edge("Mavdi Gam", 3, 1.2f));
        graph[140].add(new Edge("Mavdi Chowk", 3, 0.8f));
        graph[141].add(new Edge("Fuliya Hanuman Mandir", 3, 0.25f));
        graph[142].add(new Edge("Mavdi Fire Station", 3, 0.45f));
        graph[143].add(new Edge("Aanand Bunglows", 3, 0.6f));
        graph[144].add(new Edge("Swaminarayan Chowk", 3, 0.95f));
        graph[145].add(new Edge("P. D. M. College", 3, 1f));
        graph[146].add(new Edge("Gurukul", 3, 0.75f));
        graph[147].add(new Edge("Bhaktinagar Circle", 3, 0.7f));
        graph[148].add(new Edge("Kanta Stri Vikash Gruh", 3, 0.9f));
        graph[28].add(new Edge("S.T. Bus Stand", 3, 0.8f));
        graph[41].add(new Edge("Trikon Baug", 3, 1.2f));
        graph[149].add(new Edge("Hospital Chowk", 3, 0.6f));
        graph[43].add(new Edge("I.P. Mission School", 3, 1f));
        graph[44].add(new Edge("Kothicompound", 3, 0.6f));
        graph[45].add(new Edge("Junction Railway Station", 3, 1.9f));
        graph[46].add(new Edge("Popatpara Central Jail", 3, 0.95f));
        graph[47].add(new Edge("Popatpara", 3, 0.6f));
        graph[150].add(new Edge("Central Ware House", 3, 6.3f)); 

        // Route - 4

        graph[48].add(new Edge("Government Polytechnic", 4, 0.19f));
        graph[49].add(new Edge("Field Marshal Chowk", 4, 1.20f));
        graph[50].add(new Edge("Sarvoday Society", 4, 0.95f));
        graph[51].add(new Edge("Udhyog Nagar", 4, 2.80f));
        graph[52].add(new Edge("Chunarvad Chowk", 4, 3.60f));
        graph[53].add(new Edge("R.M.C East Zone Office", 4, 0.50f));
        graph[54].add(new Edge("Manhar Pura/Bedinaka Fire Station", 4, 5.10f));
        graph[55].add(new Edge("Jalaram Chowk (Santkabir Road no Khuno)", 4, 5.80f));
        graph[56].add(new Edge("Patel Vadi", 4, 8.50f));
        graph[39].add(new Edge("Parevadi Chowk", 4, 9.10f));
        graph[40].add(new Edge("I.P. Mission School", 4, 1.20f));
        graph[149].add(new Edge("Hospital Chowk", 4, 1.30f));
        graph[41].add(new Edge("Jubilee Baug", 4, 0.28f));
        graph[42].add(new Edge("Trikon Baug", 4, 0.55f));
        graph[28].add(new Edge("Malaviya Chowk", 4, 0.75f));
        graph[27].add(new Edge("Ramkrushna Aashram", 4, 0.60f));
        graph[26].add(new Edge("Hemu Gadhvi Hall", 4, 0.85f));
        graph[25].add(new Edge("Astron Chowk", 4, 0.35f));
        graph[24].add(new Edge("Swaminarayan Mandir / Mahila College Chowk", 4, 0.90f));
        graph[151].add(new Edge("Indubai Mahasatiji Chowk", 4, 1.70f));
        graph[22].add(new Edge("K.K.V. Hall", 4, 1.00f));
        graph[152].add(new Edge("Atmiya College/Central School", 4, 0.75f));
        graph[153].add(new Edge("Crystal Mall", 4, 0.35f));
        graph[154].add(new Edge("Vrundavan Society", 4, 8.80f));
        graph[155].add(new Edge("A.G. Society", 4, 9.90f));
        graph[156].add(new Edge("Everest Park", 4, 0.80f));
        graph[157].add(new Edge("Mota Mava", 4, 2.60f));
        graph[158].add(new Edge("Cosmoplex Cinema", 4, 3.30f));
        graph[159].add(new Edge("Kankot Kalwad Road", 4, 0.70f));
        graph[160].add(new Edge("Vruksh Mandir", 4, 0.70f));
        graph[161].add(new Edge("Uma P.T.C. College", 4, 0.90f));
        graph[162].add(new Edge("Mukhyamantri Aavas Yogna Quater", 4, 1.40f));
        graph[99].add(new Edge("Haripar Gam", 4, 3.30f));
        graph[163].add(new Edge("W.P. Engineering College", 4, 1.70f));
        graph[164].add(new Edge("Virda Vajdi Gam", 4, 1.10f));
        graph[165].add(new Edge("Vagudad VadVajdi Gam", 4, 6.00f));
        graph[166].add(new Edge("G.I.D.C. Gate 1", 4, 5.50f));
        graph[167].add(new Edge("G.I.D.C. Gate 2", 4, 0.15f));
        graph[168].add(new Edge("G.I.D.C. Gate 3", 4, 0.70f));

        graph[49].add(new Edge("Field Marshal Chowk", 4, 1.20f));
        graph[50].add(new Edge("Sarvoday Society", 4, 0.95f));
        graph[51].add(new Edge("Udhyog Nagar", 4, 2.80f));
        graph[52].add(new Edge("Chunarvad Chowk", 4, 3.60f));
        graph[53].add(new Edge("R.M.C East Zone Office", 4, 0.50f));
        graph[54].add(new Edge("Manhar Pura/Bedinaka Fire Station", 4, 5.10f));
        graph[55].add(new Edge("Jalaram Chowk (Santkabir Road no Khuno)", 4, 5.80f));
        graph[56].add(new Edge("Patel Vadi", 4, 8.50f));
        graph[39].add(new Edge("Parevadi Chowk", 4, 9.10f));
        graph[40].add(new Edge("I.P. Mission School", 4, 1.20f));
        graph[149].add(new Edge("Hospital Chowk", 4, 1.30f));
        graph[41].add(new Edge("Jubilee Baug", 4, 0.28f));
        graph[42].add(new Edge("Trikon Baug", 4, 0.55f));
        graph[28].add(new Edge("Malaviya Chowk", 4, 0.75f));
        graph[27].add(new Edge("Ramkrushna Aashram", 4, 0.60f));
        graph[26].add(new Edge("Hemu Gadhvi Hall", 4, 0.85f));
        graph[25].add(new Edge("Astron Chowk", 4, 0.35f));
        graph[24].add(new Edge("Swaminarayan Mandir / Mahila College Chowk", 4, 0.90f));
        graph[151].add(new Edge("Indubai Mahasatiji Chowk", 4, 1.70f));
        graph[22].add(new Edge("K.K.V. Hall", 4, 1.00f));
        graph[152].add(new Edge("Atmiya College/Central School", 4, 0.75f));
        graph[153].add(new Edge("Crystal Mall", 4, 0.35f));
        graph[154].add(new Edge("Vrundavan Society", 4, 8.80f));
        graph[155].add(new Edge("A.G. Society", 4, 9.90f));
        graph[156].add(new Edge("Everest Park", 4, 0.80f));
        graph[157].add(new Edge("Mota Mava", 4, 2.60f));
        graph[158].add(new Edge("Cosmoplex Cinema", 4, 3.30f));
        graph[159].add(new Edge("Kankot Kalwad Road", 4, 0.70f));
        graph[160].add(new Edge("Vruksh Mandir", 4, 0.70f));
        graph[161].add(new Edge("Uma P.T.C. College", 4, 0.90f));
        graph[162].add(new Edge("Mukhyamantri Aavas Yogna Quater", 4, 1.40f));
        graph[99].add(new Edge("Haripar Gam", 4, 3.30f));
        graph[163].add(new Edge("W.P. Engineering College", 4, 1.70f));
        graph[164].add(new Edge("Virda Vajdi Gam", 4, 1.10f));
        graph[165].add(new Edge("Vagudad VadVajdi Gam", 4, 6.00f));
        graph[166].add(new Edge("G.I.D.C. Gate 1", 4, 5.50f));
        graph[167].add(new Edge("G.I.D.C. Gate 2", 4, 0.15f));
        graph[168].add(new Edge("G.I.D.C. Gate 3", 4, 0.70f));
        graph[169].add(new Edge("G.I.D.C. Gate 2", 4, 0.70f));

        // Route - 5

        graph[134].add(new Edge("Aalap Green City", 5, 4.20f));
        graph[133].add(new Edge("Bapa Sitaram Chowk", 5, 0.75f));
        graph[170].add(new Edge("Raiya Chokdi", 5, 5.50f));
        graph[171].add(new Edge("Hanuman Madhi", 5, 3.80f));
        graph[172].add(new Edge("Alkapuri", 5, 0.50f));
        graph[173].add(new Edge("Aazad Chowk", 5, 0.50f));
        graph[174].add(new Edge("Aamrapali Fatak", 5, 0.28f));
        graph[175].add(new Edge("Kishanpara Chowk", 5, 0.90f));
        graph[129].add(new Edge("Jilla Panchayat Chowk", 5, 0.55f));
        graph[128].add(new Edge("Pulchhab Chowk", 5, 0.30f));
        graph[176].add(new Edge("Chitralekha Chowk", 5, 0.40f));
        graph[177].add(new Edge("Limda Chowk", 5, 0.27f));
        graph[178].add(new Edge("Trikon Baug", 5, 0.17f));
        graph[28].add(new Edge("S.T. Bus Stand", 5, 0.85f));
        graph[148].add(new Edge("Kanta Stri Vikash Gruh", 5, 0.85f));
        graph[147].add(new Edge("Bhaktinagar Circle", 5, 0.60f));
        graph[146].add(new Edge("Sheth High school", 5, 0.40f));
        graph[112].add(new Edge("Kothariya Coloni", 5, 0.35f));
        graph[113].add(new Edge("Sorthiya Vadi Circle", 5, 0.28f));
        graph[114].add(new Edge("Jangleshwer Crossing/ Bapunagar", 5, 0.65f));
        graph[70].add(new Edge("Aaji G.I.D.C.", 5, 1.50f));
        graph[71].add(new Edge("Field Marshal Chowk", 5, 0.85f));
        graph[50].add(new Edge("Government Polytechnic", 5, 1.50f));
        graph[49].add(new Edge("AajiDam", 5, 0.50f));
        graph[48].add(new Edge("Mahika Patiyu", 5, 5.10f));
        graph[75].add(new Edge("kalipat", 5, 5.40f));
        graph[62].add(new Edge("R.K. University", 5, 2.60f));
        graph[63].add(new Edge("Tramba Gam", 5, 2.80f));

        graph[133].add(new Edge("Raiya Gam", 5, 4.20f));
        graph[170].add(new Edge("Aalap Green City", 5, 0.75f));
        graph[171].add(new Edge("Bapa Sitaram Chowk", 5, 5.50f));
        graph[172].add(new Edge("Raiya Chokdi", 5, 3.80f));
        graph[173].add(new Edge("Hanuman Madhi", 5, 0.50f));
        graph[174].add(new Edge("Alkapuri", 5, 0.50f));
        graph[175].add(new Edge("Aazad Chowk", 5, 0.28f));
        graph[129].add(new Edge("Aamrapali Fatak", 5, 0.90f));
        graph[128].add(new Edge("Kishanpara Chowk", 5, 0.55f));
        graph[176].add(new Edge("Jilla Panchayat Chowk", 5, 0.30f));
        graph[177].add(new Edge("Pulchhab Chowk", 5, 0.40f));
        graph[178].add(new Edge("Chitralekha Chowk", 5, 0.27f));
        graph[28].add(new Edge("Limda Chowk", 5, 0.17f));
        graph[148].add(new Edge("Trikon Baug", 5, 0.85f));
        graph[147].add(new Edge("S.T. Bus Stand", 5, 0.85f));
        graph[146].add(new Edge("Kanta Stri Vikash Gruh", 5, 0.60f));
        graph[112].add(new Edge("Bhaktinagar Circle", 5, 0.40f));
        graph[113].add(new Edge("Sheth High school", 5, 0.35f));
        graph[114].add(new Edge("Kothariya Coloni", 5, 0.28f));
        graph[70].add(new Edge("Sorthiya Vadi Circle", 5, 0.65f));
        graph[71].add(new Edge("Jangleshwer Crossing/ Bapunagar", 5, 1.50f));
        graph[50].add(new Edge("Aaji G.I.D.C.", 5, 0.85f));
        graph[49].add(new Edge("Field Marshal Chowk", 5, 1.50f));
        graph[48].add(new Edge("Government Polytechnic", 5, 0.50f));
        graph[75].add(new Edge("AajiDam", 5, 5.10f));
        graph[62].add(new Edge("Mahika Patiyu", 5, 5.40f));
        graph[63].add(new Edge("kalipat", 5, 2.60f));
        graph[64].add(new Edge("R.K. University", 5, 2.80f));

        // Route - 6



    }

    public static List<String> findShortestPath(List<Edge>[] graph, Map<String, Integer> stationIndices, String src, String tar) {
        Map<String, Float> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        Set<String> visited = new HashSet<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparing(distance::get));

        distance.put(src, 0.0f);
        queue.add(src);

        while (!queue.isEmpty()) {
            String u = queue.poll();
            visited.add(u);

            if (u.equals(tar)) {
                break;
            }

            int uIndex = stationIndices.get(u);

            for (Edge edge : graph[uIndex]) {
                String v = edge.Destination;
                if (!visited.contains(v)) {
                    float alt = distance.get(u) + edge.Distance;
                    if (alt < distance.getOrDefault(v, Float.MAX_VALUE)) {
                        distance.put(v, alt);
                        previous.put(v, u);
                        queue.add(v);
                    }
                }
            }
        }

        List<String> path = new ArrayList<>();
        String current = tar;
        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path);

        return path.size() > 1 ? path : Collections.emptyList();
    }

    public static void main(String[] args) {
        List<Edge>[] graph = new List[185];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        Map<String, Integer> stationIndices = new HashMap<>();
        createGraph(graph, stationIndices);
    
        String src = getSrc();
        String tar = getTar();
    
        // Check if the source and target stations exist
        if (!stationIndices.containsKey(src) || !stationIndices.containsKey(tar)) {
            System.out.println("One or both of the specified stations are not found.");
        } else {
            List<String> shortestPath = findShortestPath(graph, stationIndices, src, tar);
    
            if (shortestPath.contains(src) && shortestPath.contains(tar)) {
                System.out.println("Shortest Path:");
                float totalDistance = 0.0f;
                String prevStation = shortestPath.get(0);
                for (String station : shortestPath) {
                    int prevIndex = stationIndices.get(prevStation);
                    for (Edge edge : graph[prevIndex]) {
                        if (edge.Destination.equals(station)) {
                            String routeDescription = (edge.Route == 0) ? "BRTS" : "R-" + edge.Route;
                            System.out.println(routeDescription + " : " + prevStation);
                            totalDistance += edge.Distance;
                        }
                    }
                    prevStation = station;
                }
                System.out.println("Length: " + totalDistance + " km");
            } else {
                System.out.println("No path available.");
            }
        }
    }    
}