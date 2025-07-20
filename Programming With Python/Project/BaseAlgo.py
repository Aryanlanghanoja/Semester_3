import heapq


class Short:
    class Edge:
        def __init__(self, destination, route, distance):
            self.destination = destination
            self.route = route
            self.distance = distance

    location_to_index = {
        "Madhapar Chowk": 0,
        "Ayodhya Park Chowk": 1,
        "Shital Park": 2,
        "Ramdevpir Chowk": 3,
        "Nanavati Chowk": 4,
        "Raiya Chowk": 5,
        "Raiya TelePhone Exchange": 6,
        "Indira Circle": 7,
        "West Zone Office": 8,
        "Nana Mava Chowk": 9,
        "Maha Puja Dham Chowk": 10,
        "Om Nagar Chowk": 11,
        "Mavdi Chowk": 12,
        "Umiya Chowk": 13,
        "Ambedkar Chowk": 14,
        "Goverdhan Chowk": 15,
        "Punit Nagar Chowk": 16,
        "Gondal Chowk": 17,
        "Saurastra University": 18,
        "BT Savani (Kidni) Hospital": 19,
        "Akashvani Chowk": 20,
        "Panchayat Nagar Chowk": 21,
        "Indubai Mahasatiji Chowk": 22,
        "Swaminarayan Mandir / Mahila": 23,
        "Astron Chowk": 24,
        "Hemu Gadhvi Hall": 25,
        "Ramkrushna Aashram": 26,
        "Malaviya Chowk": 27,
        "Trikon Baug": 28,
        "HN Shukla College": 29,
        "Pradyumna Park": 30,
        "Marketing Yard": 31,
        "Bhagirath Society": 32,
        "Lakheshvar Society - R.T.O. Office": 33,
        "GramUdhyog Mandir Pedak": 34,
        "Setelite Chowk - Maruti Nagar Approch Road": 35,
        "Aayaknagar - Pedak Road": 36,
        "Narayan Nagar Aproch Road - Govind Nagar": 37,
        "Champak Nagar - Panino Ghodo": 38,
        "Patel Vadi": 39,
        "Parevadi Chowk": 40,
        "Hospital Chowk": 41,
        "Jubilee Baug": 42,
        "Kothicompound": 43,
        "Junction Railway Station": 44,
        "Popatpara Central Jail": 45,
        "Popatpara": 46,
        "Central Ware House": 47,
        "AajiDam": 48,
        "Government Polytechnic": 49,
        "Field Marshal Chowk": 50,
        "Sarvoday Society": 51,
        "Udhyog Nagar": 52,
        "Chunarvad Chowk": 53,
        "R.M.C East Zone Office": 54,
        "Manhar Pura/Bedinaka Fire Station": 55,
        "Jalaram Chowk (Santkabir Road no Khuno)": 56,
        "Aajidam Chokdi": 57,
        "Mansarovar Society": 58,
        "Aarti Industrial Area": 59,
        "Thebchada Mahika Patiyu": 60,
        "Krishna International School": 61,
        "kalipat": 62,
        "R.K. University": 63,
        "Tramba Gam": 64,
        "Santoshinagar Railway Crossing": 65,
        "Santoshinagar": 66,
        "Railnagar": 67,
        "Central Ware House": 68,
        "Popatpara": 69,
        "Jangleshwer Crossing/ Bapunagar": 70,
        "Aaji G.I.D.C.": 71,
        "Field Marshal Chowk": 72,
        "Government Polytechnic": 73,
        "AajiDam": 74,
        "Mahika Patiyu": 75,
        "kalipat": 76,
        "R.K. University": 77,
        "Bharad Engineering College": 78,
        "Tramba Gam": 79,
        "Bajrangvadi Circle": 80,
        "Punitnagar": 81,
        "Lakhno Bunglow": 82,
        "Jivantika Main Road Crossing": 83,
        "Ramapir Chokdi": 84,
        "Bramh Samaj": 85,
        "Government Engineering College": 86,
        "Labhubhai Engineering college": 87,
        "Arpit Eng. College (Hadala Gam)": 88,
        "Darshan Eng. College": 89,
        "Ratanpar (Ramji Mandir)": 90,
        "Ratanpar gam": 91,
        "Ratanpar Telephone Exchange": 92,
        "Gauridal": 93,
        "I.O.C.": 94,
        "Marwadi College": 95,
        "Bedi Marketing Yard": 96,
        "Bedi": 97,
        "150 Feet Jamnagar Road Crossing": 98,
        "Mukhyamantri Aavas Yogna Quarter": 99,
        "Aastha Sangrila": 100,
        "Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)": 101,
        "Manhar Pura (150 ft. Ring Road)": 102,
        "Vora Society": 103,
        "Gaytridham": 104,
        "Vankaner Society": 105,
        "Bajrangvadi": 106,
        "Railway Colony": 107,
        "Bhomeshvar": 108,
        "Special School For Boys": 109,
        "Ruda Office": 110,
        "Kadvibai School": 111,
        "Sheth High school": 112,
        "Kothariya Coloni": 113,
        "Sorthiya Vadi Circle": 114,
        "Jangleshwer Crossing/ Bapunagar": 115,
        "Aaji G.I.D.C.": 116,
        "Field Marshal Chowk": 117,
        "Aajidam Chokdi": 118,
        "Mansarovar Society": 119,
        "Aarti Industrial Area": 120,
        "Thebchada Mahika Patiyu": 121,
        "Krishna International School": 122,
        "kalipat": 123,
        "R.K. University": 124,
        "Bharad Engineering College": 125,
        "Tramba Gam": 126,
        "Dharmendrasihnji College": 127,
        "Jilla Panchayat Chowk": 128,
        "Kishanpara Chowk": 129,
        "Sadhu Vasvani School": 130,
        "Ajanta Park / Janak Puri": 131,
        "Balaji Park / Satellite Park": 132,
        "Aalap Green City": 133,
        "Raiya Gam": 134,
        "Jivraj Park": 135,
        "Aarya Land Residency": 136,
        "Jetko Chokdi": 137,
        "Dream City": 138,
        "Mavdi Gam": 139,
        "Fuliya Hanuman Mandir": 140,
        "Mavdi Fire Station": 141,
        "Aanand Bunglows": 142,
        "Swaminarayan Chowk": 143,
        "P. D. M. College": 144,
        "Gurukul": 145,
        "Bhaktinagar Circle": 146,
        "Kanta Stri Vikash Gruh": 147,
        "S.T. Bus Stand": 148,
        "I.P. Mission School": 149,
        "Bhaktinagar Park": 150,
        "Swaminarayan Mandir / Mahila College Chowk": 151,
        "K.K.V. Hall": 152,
        "Atmiya College/Central School": 153,
        "Crystal Mall": 154,
        "Vrundavan Society": 155,
        "A.G. Society": 156,
        "Everest Park": 157,
        "Mota Mava": 158,
        "Cosmoplex Cinema": 159,
        "Kankot Kalwad Road": 160,
        "Vruksh Mandir": 161,
        "Uma P.T.C. College": 162,
        "Haripar Gam": 163,
        "W.P. Engineering College": 164,
        "Virda Vajdi Gam": 165,
        "Vagudad VadVajdi Gam": 166,
        "G.I.D.C. Gate 1": 167,
        "G.I.D.C. Gate 2": 168,
        "G.I.D.C. Gate 3": 169,
        "Bapa Sitaram Chowk": 170,
        "Raiya Chokdi": 171,
        "Hanuman Madhi": 172,
        "Alkapuri": 173,
        "Aazad Chowk": 174,
        "Aamrapali Fatak": 175,
        "Pulchhab Chowk": 176,
        "Chitralekha Chowk": 177,
        "Limda Chowk": 178,
        "Aaryasamaj": 179,
        "Greenland Chokdi": 180,
        "Marutinagar 50 Feet Road Chowk": 181,
        "Gurudev Park": 182,
        "Ranchhod Aashram": 183,
        "Makkam Chowk": 184,
        "Sarita Vihar": 185,
        "Mukhyamantri Aavas Yogna Quater": 186
    }

    @staticmethod
    def get_src():
        return input("Enter Your Source: ")

    @staticmethod
    def get_tar():
        return input("Enter Your Target: ")

    @staticmethod
    def create_graph(graph):
        for i in range(len(graph)):
            graph[i] = []

        # Initialize the graph with edges based on your actual data.
        # Example:

        # BRTS
        graph[0].append(Short.Edge("Ayodhya Park Chowk", 0, 0.6))
        graph[1].append(Short.Edge("Shital Park", 0, 0.65))
        graph[2].append(Short.Edge("Ramdevpir Chowk", 0, 0.9))
        graph[3].append(Short.Edge("Nanavati Chowk", 0, 0.75))
        graph[4].append(Short.Edge("Raiya Chowk", 0, 0.55))
        graph[5].append(Short.Edge("Raiya TelePhone Exchange", 0, 1.2))
        graph[6].append(Short.Edge("Indira Circle", 0, 0.8))
        graph[7].append(Short.Edge("West Zone Office", 0, 1.4))
        graph[8].append(Short.Edge("Nana Mava Chowk", 0, 0.65))
        graph[9].append(Short.Edge("Maha Puja Dham Chowk", 0, 0.7))
        graph[10].append(Short.Edge("Om Nagar Chowk", 0, 0.5))
        graph[11].append(Short.Edge("Mavdi Chowk", 0, 0.55))
        graph[12].append(Short.Edge("Umiya Chowk", 0, 0.7))
        graph[13].append(Short.Edge("Ambedkar Chowk", 0, 0.7))
        graph[14].append(Short.Edge("Goverdhan Chowk", 0, 0.5))
        graph[15].append(Short.Edge("Punit Nagar Chowk", 0, 0.6))
        graph[16].append(Short.Edge("Gondal Chowk", 0, 0.75))

        graph[1].append(Short.Edge("Madhapar Chowk", 0, 0.6))
        graph[2].append(Short.Edge("Ayodhya Park Chowk", 0, 0.65))
        graph[3].append(Short.Edge("Shital Park", 0, 0.9))
        graph[4].append(Short.Edge("Nanavati Chowk", 0, 0.75))
        graph[5].append(Short.Edge("Raiya Chowk", 0, 0.55))
        graph[6].append(Short.Edge("Raiya Chowk", 0, 1.2))
        graph[7].append(Short.Edge("Raiya TelePhone Exchange", 0, 0.8))
        graph[8].append(Short.Edge("Indira Circle", 0, 1.4))
        graph[9].append(Short.Edge("West Zone Office", 0, 0.65))
        graph[10].append(Short.Edge("Nana Mava Chowk", 0, 0.7))
        graph[11].append(Short.Edge("Maha Puja Dham Chowk", 0, 0.7))
        graph[12].append(Short.Edge("Om Nagar Chowk", 0, 0.55))
        graph[13].append(Short.Edge("Mavdi Chowk", 0, 0.7))
        graph[14].append(Short.Edge("Umiya Chowk", 0, 0.7))
        graph[15].append(Short.Edge("Ambedkar Chowk", 0, 0.5))
        graph[16].append(Short.Edge("Goverdhan Chowk", 0, 0.6))
        graph[17].append(Short.Edge("Punit Nagar Chowk", 0, 0.75))

        # Route - 1
        graph[18].append(Short.Edge("BT Savani (Kidni) Hospital", 1, 1.4))
        graph[19].append(Short.Edge("Akashvani Chowk", 1, 0.75))
        graph[20].append(Short.Edge("Panchayat Nagar Chowk", 1, 0.8))
        graph[21].append(Short.Edge("Indira Circle", 1, 0.65))
        graph[7].append(Short.Edge("Indubai Mahasatiji Chowk", 1, 0.85))
        graph[22].append(Short.Edge("Swaminarayan Mandir / Mahila", 1, 0.8))
        graph[23].append(Short.Edge("Astron Chowk", 1, 0.85))
        graph[24].append(Short.Edge("Hemu Gadhvi Hall", 1, 1.1))
        graph[25].append(Short.Edge("Ramkrushna Aashram", 1, 0.75))
        graph[26].append(Short.Edge("Malaviya Chowk", 1, 0.75))
        graph[27].append(Short.Edge("Trikon Baug", 1, 0.6))

        graph[19].append(Short.Edge("Saurastra University", 1, 1.4))
        graph[20].append(Short.Edge("BT Savani (Kidni) Hospital", 1, 0.75))
        graph[21].append(Short.Edge("Akashvani Chowk", 1, 0.8))
        graph[7].append(Short.Edge("Panchayat Nagar Chowk", 1, 0.65))
        graph[22].append(Short.Edge("Indira Circle", 1, 0.85))
        graph[23].append(Short.Edge("Indubai Mahasatiji Chowk", 1, 0.8))
        graph[24].append(Short.Edge("Swaminarayan Mandir / Mahila", 1, 0.85))
        graph[25].append(Short.Edge("Astron Chowk", 1, 1.1))
        graph[26].append(Short.Edge("Hemu Gadhvi Hall", 1, 0.75))
        graph[27].append(Short.Edge("Ramkrushna Aashram", 1, 0.75))
        graph[28].append(Short.Edge("Malaviya Chowk", 1, 0.6))

        # Route - 2
        graph[29].append(Short.Edge("Pradyumna Park", 2, 8.7))
        graph[30].append(Short.Edge("Marketing Yard", 2, 5.3))
        graph[31].append(Short.Edge("Bhagirath Society", 2, 1.3))
        graph[32].append(Short.Edge(
            "Lakheshvar Society - R.T.O. Office", 2, 0.3))
        graph[33].append(Short.Edge("GramUdhyog Mandir Pedak", 2, 0.9))
        graph[34].append(Short.Edge(
            "Setelite Chowk - Maruti Nagar Approch Road", 2, 1.1))
        graph[35].append(Short.Edge("Aayaknagar - Pedak Road", 2, 5.4))
        graph[36].append(Short.Edge(
            "Narayan Nagar Aproch Road - Govind Nagar", 2, 4.7))
        graph[37].append(Short.Edge("Champak Nagar - Panino Ghodo", 2, 0.2))
        graph[38].append(Short.Edge("Patel Vadi", 2, 9.1))
        graph[39].append(Short.Edge("Parevadi Chowk", 2, 1))
        graph[40].append(Short.Edge("Hospital Chowk", 2, 2.6))
        graph[41].append(Short.Edge("Trikon Baug", 2, 2.8))
        graph[28].append(Short.Edge("Malaviya Chowk", 2, 0.65))
        graph[27].append(Short.Edge("Ramkrushna Aashram", 2, 0.8))
        graph[26].append(Short.Edge("Dharmendrasihnji College", 2, 0.28))
        graph[127].append(Short.Edge("Jilla Panchayat Chowk", 2, 1.6))
        graph[128].append(Short.Edge("Kishanpara Chowk", 2, 2.2))
        graph[129].append(Short.Edge("Swaminarayan Mandir / Mahila", 2, 0.75))
        graph[23].append(Short.Edge("Indubai Mahasatiji Chowk", 2, 1.8))
        graph[22].append(Short.Edge("Indira Circle", 2, 2.8))
        graph[7].append(Short.Edge("Panchayat Nagar Chowk", 2, 0.9))
        graph[21].append(Short.Edge("Sadhu Vasvani School", 2, 5.9))
        graph[130].append(Short.Edge("Ajanta Park / Janak Puri", 2, 0.9))
        graph[131].append(Short.Edge("Balaji Park / Satellite Park", 2, 0.92))
        graph[132].append(Short.Edge("Aalap Green City", 2, 2.2))
        graph[133].append(Short.Edge("Raiya Gam", 2, 3.4))

        graph[29].append(Short.Edge("HN Shukla College", 2, 8.7))
        graph[30].append(Short.Edge("Pradyumna Park", 2, 5.3))
        graph[31].append(Short.Edge("Marketing Yard", 2, 1.3))
        graph[32].append(Short.Edge("Bhagirath Society", 2, 0.3))
        graph[33].append(Short.Edge(
            "Lakheshvar Society - R.T.O. Office", 2, 0.9))
        graph[34].append(Short.Edge("GramUdhyog Mandir Pedak", 2, 1.1))
        graph[35].append(Short.Edge(
            "Setelite Chowk - Maruti Nagar Approch Road", 2, 5.4))
        graph[36].append(Short.Edge("Aayaknagar - Pedak Road", 2, 4.7))
        graph[37].append(Short.Edge(
            "Narayan Nagar Aproch Road - Govind Nagar", 2, 0.2))
        graph[38].append(Short.Edge("Champak Nagar - Panino Ghodo", 2, 9.1))
        graph[39].append(Short.Edge("Patel Vadi", 2, 1))
        graph[40].append(Short.Edge("Parevadi Chowk", 2, 2.6))
        graph[28].append(Short.Edge("Hospital Chowk", 2, 2.8))
        graph[27].append(Short.Edge("Trikon Baug", 2, 0.65))
        graph[26].append(Short.Edge("Malaviya Chowk", 2, 0.8))
        graph[127].append(Short.Edge("Ramkrushna Aashram", 2, 0.28))
        graph[128].append(Short.Edge("Dharmendrasihnji College", 2, 1.6))
        graph[129].append(Short.Edge("Jilla Panchayat Chowk", 2, 2.2))
        graph[23].append(Short.Edge("Kishanpara Chowk", 2, 0.75))
        graph[22].append(Short.Edge("Swaminarayan Mandir / Mahila", 2, 1.8))
        graph[7].append(Short.Edge("Indubai Mahasatiji Chowk", 2, 2.8))
        graph[21].append(Short.Edge("Indira Circle", 2, 0.9))
        graph[130].append(Short.Edge("Panchayat Nagar Chowk", 2, 5.9))
        graph[131].append(Short.Edge("Sadhu Vasvani School", 2, 0.9))
        graph[132].append(Short.Edge("Ajanta Park / Janak Puri", 2, 0.92))
        graph[133].append(Short.Edge("Balaji Park / Satellite Park", 2, 2.2))
        graph[134].append(Short.Edge("Aalap Green City", 2, 3.4))

        # Route - 3
        graph[135].append(Short.Edge("Aarya Land Residency", 3, 0.5))
        graph[136].append(Short.Edge("Jetko Chokdi", 3, 1.5))
        graph[137].append(Short.Edge("Dream City", 3, 1.5))
        graph[138].append(Short.Edge("Mavdi Gam", 3, 1.2))
        graph[139].append(Short.Edge("Mavdi Chowk", 3, 1.2))
        graph[12].append(Short.Edge("Fuliya Hanuman Mandir", 3, 0.8))
        graph[140].append(Short.Edge("Mavdi Fire Station", 3, 0.25))
        graph[141].append(Short.Edge("Aanand Bunglows", 3, 0.45))
        graph[142].append(Short.Edge("Swaminarayan Chowk", 3, 0.6))
        graph[143].append(Short.Edge("P. D. M. College", 3, 0.95))
        graph[144].append(Short.Edge("Gurukul", 3, 1))
        graph[145].append(Short.Edge("Bhaktinagar Circle", 3, 0.75))
        graph[146].append(Short.Edge("Kanta Stri Vikash Gruh", 3, 0.7))
        graph[147].append(Short.Edge("S.T. Bus Stand", 3, 0.9))
        graph[148].append(Short.Edge("Trikon Baug", 3, 0.8))
        graph[28].append(Short.Edge("Hospital Chowk", 3, 1.2))
        graph[41].append(Short.Edge("I.P. Mission School", 3, 0.6))
        graph[149].append(Short.Edge("Kothicompound", 3, 1))
        graph[43].append(Short.Edge("Junction Railway Station", 3, 0.6))
        graph[44].append(Short.Edge("Popatpara Central Jail", 3, 1.9))
        graph[45].append(Short.Edge("Popatpara", 3, 0.95))
        graph[46].append(Short.Edge("Central Ware House", 3, 0.6))
        graph[47].append(Short.Edge("Bhaktinagar Park", 3, 6.3))

        graph[136].append(Short.Edge("Jivraj Park", 3, 0.5))
        graph[137].append(Short.Edge("Aarya Land Residency", 3, 1.5))
        graph[138].append(Short.Edge("Jetko Chokdi", 3, 1.5))
        graph[139].append(Short.Edge("Dream City", 3, 1.2))
        graph[12].append(Short.Edge("Mavdi Gam", 3, 1.2))
        graph[140].append(Short.Edge("Mavdi Chowk", 3, 0.8))
        graph[141].append(Short.Edge("Fuliya Hanuman Mandir", 3, 0.25))
        graph[142].append(Short.Edge("Mavdi Fire Station", 3, 0.45))
        graph[143].append(Short.Edge("Aanand Bunglows", 3, 0.6))
        graph[144].append(Short.Edge("Swaminarayan Chowk", 3, 0.95))
        graph[145].append(Short.Edge("P. D. M. College", 3, 1))
        graph[146].append(Short.Edge("Gurukul", 3, 0.75))
        graph[147].append(Short.Edge("Bhaktinagar Circle", 3, 0.7))
        graph[148].append(Short.Edge("Kanta Stri Vikash Gruh", 3, 0.9))
        graph[28].append(Short.Edge("S.T. Bus Stand", 3, 0.8))
        graph[41].append(Short.Edge("Trikon Baug", 3, 1.2))
        graph[149].append(Short.Edge("Hospital Chowk", 3, 0.6))
        graph[43].append(Short.Edge("I.P. Mission School", 3, 1))
        graph[44].append(Short.Edge("Kothicompound", 3, 0.6))
        graph[45].append(Short.Edge("Junction Railway Station", 3, 1.9))
        graph[46].append(Short.Edge("Popatpara Central Jail", 3, 0.95))
        graph[47].append(Short.Edge("Popatpara", 3, 0.6))
        graph[150].append(Short.Edge("Central Ware House", 3, 6.3))

        # # Route - 4

        # graph[48].append(Short.Edge("Government Polytechnic", 4, 0.19))
        # graph[49].append(Short.Edge("Field Marshal Chowk", 4, 1.20))
        # graph[50].append(Short.Edge("Sarvoday Society", 4, 0.95))
        # graph[51].append(Short.Edge("Udhyog Nagar", 4, 2.80))
        # graph[52].append(Short.Edge("Chunarvad Chowk", 4, 3.60))
        # graph[53].append(Short.Edge("R.M.C East Zone Office", 4, 0.50))
        # graph[54].append(Short.Edge(
        #     "Manhar Pura/Bedinaka Fire Station", 4, 5.10))
        # graph[55].append(Short.Edge(
        #     "Jalaram Chowk (Santkabir Road no Khuno)", 4, 5.80))
        # graph[56].append(Short.Edge("Patel Vadi", 4, 8.50))
        # graph[39].append(Short.Edge("Parevadi Chowk", 4, 9.10))
        # graph[40].append(Short.Edge("I.P. Mission School", 4, 1.20))
        # graph[149].append(Short.Edge("Hospital Chowk", 4, 1.30))
        # graph[41].append(Short.Edge("Jubilee Baug", 4, 0.28))
        # graph[42].append(Short.Edge("Trikon Baug", 4, 0.55))
        # graph[28].append(Short.Edge("Malaviya Chowk", 4, 0.75))
        # graph[27].append(Short.Edge("Ramkrushna Aashram", 4, 0.60))
        # graph[26].append(Short.Edge("Hemu Gadhvi Hall", 4, 0.85))
        # graph[25].append(Short.Edge("Astron Chowk", 4, 0.35))
        # graph[24].append(Short.Edge(
        #     "Swaminarayan Mandir / Mahila College Chowk", 4, 0.90))
        # graph[151].append(Short.Edge("Indubai Mahasatiji Chowk", 4, 1.70))
        # graph[22].append(Short.Edge("K.K.V. Hall", 4, 1.00))
        # graph[152].append(Short.Edge("Atmiya College/Central School", 4, 0.75))
        # graph[153].append(Short.Edge("Crystal Mall", 4, 0.35))
        # graph[154].append(Short.Edge("Vrundavan Society", 4, 8.80))
        # graph[155].append(Short.Edge("A.G. Society", 4, 9.90))
        # graph[156].append(Short.Edge("Everest Park", 4, 0.80))
        # graph[157].append(Short.Edge("Mota Mava", 4, 2.60))
        # graph[158].append(Short.Edge("Cosmoplex Cinema", 4, 3.30))
        # graph[159].append(Short.Edge("Kankot Kalwad Road", 4, 0.70))
        # graph[160].append(Short.Edge("Vruksh Mandir", 4, 0.70))
        # graph[161].append(Short.Edge("Uma P.T.C. College", 4, 0.90))
        # graph[162].append(Short.Edge(
        #     "Mukhyamantri Aavas Yogna Quater", 4, 1.40))
        # graph[99].append(Short.Edge("Haripar Gam", 4, 3.30))
        # graph[163].append(Short.Edge("W.P. Engineering College", 4, 1.70))
        # graph[164].append(Short.Edge("Virda Vajdi Gam", 4, 1.10))
        # graph[165].append(Short.Edge("Vagudad VadVajdi Gam", 4, 6.00))
        # graph[166].append(Short.Edge("G.I.D.C. Gate 1", 4, 5.50))
        # graph[167].append(Short.Edge("G.I.D.C. Gate 2", 4, 0.15))
        # graph[168].append(Short.Edge("G.I.D.C. Gate 3", 4, 0.70))

        # graph[49].append(Short.Edge("Field Marshal Chowk", 4, 1.20))
        # graph[50].append(Short.Edge("Sarvoday Society", 4, 0.95))
        # graph[51].append(Short.Edge("Udhyog Nagar", 4, 2.80))
        # graph[52].append(Short.Edge("Chunarvad Chowk", 4, 3.60))
        # graph[53].append(Short.Edge("R.M.C East Zone Office", 4, 0.50))
        # graph[54].append(Short.Edge(
        #     "Manhar Pura/Bedinaka Fire Station", 4, 5.10))
        # graph[55].append(Short.Edge(
        #     "Jalaram Chowk (Santkabir Road no Khuno)", 4, 5.80))
        # graph[56].append(Short.Edge("Patel Vadi", 4, 8.50))
        # graph[39].append(Short.Edge("Parevadi Chowk", 4, 9.10))
        # graph[40].append(Short.Edge("I.P. Mission School", 4, 1.20))
        # graph[149].append(Short.Edge("Hospital Chowk", 4, 1.30))
        # graph[41].append(Short.Edge("Jubilee Baug", 4, 0.28))
        # graph[42].append(Short.Edge("Trikon Baug", 4, 0.55))
        # graph[28].append(Short.Edge("Malaviya Chowk", 4, 0.75))
        # graph[27].append(Short.Edge("Ramkrushna Aashram", 4, 0.60))
        # graph[26].append(Short.Edge("Hemu Gadhvi Hall", 4, 0.85))
        # graph[25].append(Short.Edge("Astron Chowk", 4, 0.35))
        # graph[24].append(Short.Edge(
        #     "Swaminarayan Mandir / Mahila College Chowk", 4, 0.90))
        # graph[151].append(Short.Edge("Indubai Mahasatiji Chowk", 4, 1.70))
        # graph[22].append(Short.Edge("K.K.V. Hall", 4, 1.00))
        # graph[152].append(Short.Edge("Atmiya College/Central School", 4, 0.75))
        # graph[153].append(Short.Edge("Crystal Mall", 4, 0.35))
        # graph[154].append(Short.Edge("Vrundavan Society", 4, 8.80))
        # graph[155].append(Short.Edge("A.G. Society", 4, 9.90))
        # graph[156].append(Short.Edge("Everest Park", 4, 0.80))
        # graph[157].append(Short.Edge("Mota Mava", 4, 2.60))
        # graph[158].append(Short.Edge("Cosmoplex Cinema", 4, 3.30))
        # graph[159].append(Short.Edge("Kankot Kalwad Road", 4, 0.70))
        # graph[160].append(Short.Edge("Vruksh Mandir", 4, 0.70))
        # graph[161].append(Short.Edge("Uma P.T.C. College", 4, 0.90))
        # graph[162].append(Short.Edge(
        #     "Mukhyamantri Aavas Yogna Quater", 4, 1.40))
        # graph[99].append(Short.Edge("Haripar Gam", 4, 3.30))
        # graph[163].append(Short.Edge("W.P. Engineering College", 4, 1.70))
        # graph[164].append(Short.Edge("Virda Vajdi Gam", 4, 1.10))
        # graph[165].append(Short.Edge("Vagudad VadVajdi Gam", 4, 6.00))
        # graph[166].append(Short.Edge("G.I.D.C. Gate 1", 4, 5.50))
        # graph[167].append(Short.Edge("G.I.D.C. Gate 2", 4, 0.15))
        # graph[168].append(Short.Edge("G.I.D.C. Gate 3", 4, 0.70))
        # graph[169].append(Short.Edge("G.I.D.C. Gate 2", 4, 0.70))

        # # Route - 5

        # graph[134].append(Short.Edge("Aalap Green City", 5, 4.20))
        # graph[133].append(Short.Edge("Bapa Sitaram Chowk", 5, 0.75))
        # graph[170].append(Short.Edge("Raiya Chokdi", 5, 5.50))
        # graph[171].append(Short.Edge("Hanuman Madhi", 5, 3.80))
        # graph[172].append(Short.Edge("Alkapuri", 5, 0.50))
        # graph[173].append(Short.Edge("Aazad Chowk", 5, 0.50))
        # graph[174].append(Short.Edge("Aamrapali Fatak", 5, 0.28))
        # graph[175].append(Short.Edge("Kishanpara Chowk", 5, 0.90))
        # graph[129].append(Short.Edge("Jilla Panchayat Chowk", 5, 0.55))
        # graph[128].append(Short.Edge("Pulchhab Chowk", 5, 0.30))
        # graph[176].append(Short.Edge("Chitralekha Chowk", 5, 0.40))
        # graph[177].append(Short.Edge("Limda Chowk", 5, 0.27))
        # graph[178].append(Short.Edge("Trikon Baug", 5, 0.17))
        # graph[28].append(Short.Edge("S.T. Bus Stand", 5, 0.85))
        # graph[148].append(Short.Edge("Kanta Stri Vikash Gruh", 5, 0.85))
        # graph[147].append(Short.Edge("Bhaktinagar Circle", 5, 0.60))
        # graph[146].append(Short.Edge("Sheth High school", 5, 0.40))
        # graph[112].append(Short.Edge("Kothariya Coloni", 5, 0.35))
        # graph[113].append(Short.Edge("Sorthiya Vadi Circle", 5, 0.28))
        # graph[114].append(Short.Edge(
        #     "Jangleshwer Crossing/ Bapunagar", 5, 0.65))
        # graph[70].append(Short.Edge("Aaji G.I.D.C.", 5, 1.50))
        # graph[71].append(Short.Edge("Field Marshal Chowk", 5, 0.85))
        # graph[50].append(Short.Edge("Government Polytechnic", 5, 1.50))
        # graph[49].append(Short.Edge("AajiDam", 5, 0.50))
        # graph[48].append(Short.Edge("Mahika Patiyu", 5, 5.10))
        # graph[75].append(Short.Edge("kalipat", 5, 5.40))
        # graph[62].append(Short.Edge("R.K. University", 5, 2.60))
        # graph[63].append(Short.Edge("Tramba Gam", 5, 2.80))

        # graph[133].append(Short.Edge("Raiya Gam", 5, 4.20))
        # graph[170].append(Short.Edge("Aalap Green City", 5, 0.75))
        # graph[171].append(Short.Edge("Bapa Sitaram Chowk", 5, 5.50))
        # graph[172].append(Short.Edge("Raiya Chokdi", 5, 3.80))
        # graph[173].append(Short.Edge("Hanuman Madhi", 5, 0.50))
        # graph[174].append(Short.Edge("Alkapuri", 5, 0.50))
        # graph[175].append(Short.Edge("Aazad Chowk", 5, 0.28))
        # graph[129].append(Short.Edge("Aamrapali Fatak", 5, 0.90))
        # graph[128].append(Short.Edge("Kishanpara Chowk", 5, 0.55))
        # graph[176].append(Short.Edge("Jilla Panchayat Chowk", 5, 0.30))
        # graph[177].append(Short.Edge("Pulchhab Chowk", 5, 0.40))
        # graph[178].append(Short.Edge("Chitralekha Chowk", 5, 0.27))
        # graph[28].append(Short.Edge("Limda Chowk", 5, 0.17))
        # graph[148].append(Short.Edge("Trikon Baug", 5, 0.85))
        # graph[147].append(Short.Edge("S.T. Bus Stand", 5, 0.85))
        # graph[146].append(Short.Edge("Kanta Stri Vikash Gruh", 5, 0.60))
        # graph[112].append(Short.Edge("Bhaktinagar Circle", 5, 0.40))
        # graph[113].append(Short.Edge("Sheth High school", 5, 0.35))
        # graph[114].append(Short.Edge("Kothariya Coloni", 5, 0.28))
        # graph[70].append(Short.Edge("Sorthiya Vadi Circle", 5, 0.65))
        # graph[71].append(Short.Edge(
        #     "Jangleshwer Crossing/ Bapunagar", 5, 1.50))
        # graph[50].append(Short.Edge("Aaji G.I.D.C.", 5, 0.85))
        # graph[49].append(Short.Edge("Field Marshal Chowk", 5, 1.50))
        # graph[48].append(Short.Edge("Government Polytechnic", 5, 0.50))
        # graph[75].append(Short.Edge("AajiDam", 5, 5.10))
        # graph[62].append(Short.Edge("Mahika Patiyu", 5, 5.40))
        # graph[63].append(Short.Edge("kalipat", 5, 2.60))
        # graph[64].append(Short.Edge("R.K. University", 5, 2.80))

    @staticmethod
    def print_all_path(graph, vis, curr, path, tar, path_map, length, source):
        curr_index = Short.location_to_index[curr]
        vis[curr_index] = True

        routes = [
            "BRTS",
            "R-1",
            "R-2",
            "R-3",
            "R-4",
            "R-5"
        ]

        if curr == tar:
            for edge in graph[curr_index]:
                if edge.destination == tar:
                    route_no = routes[edge.route]
                    path_map[length] = path + f"\n{route_no} : {tar}"
        else:
            for edge in graph[curr_index]:
                if edge.route == 0:
                    route_no = "BRTS"
                else:
                    route_no = f"R-{edge.route}"

                des_index = Short.location_to_index[edge.destination]
                if not vis[des_index]:
                    if curr == source:
                        new_length = length + edge.distance
                        Short.print_all_path(
                            graph, vis, edge.destination, f"{route_no} : {curr}", tar, path_map, new_length, source)
                    else:
                        new_length = length + edge.distance
                        Short.print_all_path(
                            graph, vis, edge.destination, f"{path}\n{route_no} : {curr}", tar, path_map, new_length, source)

        vis[curr_index] = False

    @staticmethod
    def main():
        no_of_stations = 187
        graph = [[] for _ in range(no_of_stations)]
        path_map = {}
        Short.create_graph(graph)
        src = Short.get_src()
        tar = Short.get_tar()
        visit = [False] * no_of_stations
        Short.print_all_path(graph, visit, src, "", tar, path_map, 0.0, src)

        pq = [(length, path) for length, path in path_map.items()]
        heapq.heapify(pq)

        print("Shortest Path:")
        if pq:
            shortest_path = heapq.heappop(pq)
            print(f"{shortest_path[0]}\nLength: {shortest_path[0]} km")
        else:
            print("No paths available")


if __name__ == "__main__":
    Short.main()
