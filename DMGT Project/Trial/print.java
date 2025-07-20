public class print {
    public static void main(String[] args) {
        String[] locations = {
            "Arpit Eng. College (Hadala Gam)",
            "Darshan Eng. College",
            "Ratanpar (Ramji Mandir)",
            "Ratanpar gam",
            "Ratanpar Telephone Exchange",
            "Gauridal",
            "I.O.C.",
            "Marwadi College",
            "Bedi Marketing Yard",
            "Bedi",
            "150 Feet Jamnagar Road Crossing",
            "Mukhyamantri Aavas Yogna Quarter",
            "Aastha Sangrila",
            "Krishna Banglowz-3 (Sadhuvasvani Kunj Road Crossing)",
            "Manhar Pura (150 ft. Ring Road)",
            "Madhapar Chowk",
            "Vora Society",
            "Gaytridham",
            "Vankaner Society",
            "Bajrangvadi",
            "Railway Colony",
            "Bhomeshvar",
            "Special School For Boys",
            "Ruda Office",
            "Hospital Chowk",
            "Jubilee Baug",
            "Trikon Baug",
            "Malaviya Chowk",
            "Ramkrushna Aashram",
            "Jilla Panchayat Chowk",
            "Kishanpara Chowk",
            "Indubai Mahasatiji Chowk",
            "K.K.V. Hall",
            "Crystal Mall",
            "A.G. Society",
            "Sarita Vihar",
            "Saurastra University"
        };
        
        
        
        float[] numbers = {
            1.5f,
            2.8f,
            0.17f,
            1f,
            1.9f,
            1.1f,
            3.6f,
            3.8f,
            0.9f,
            0.65f,
            5.2f,
            3.2f,
            4f,
            5.3f,
            6.3f,
            0.55f,
            4.2f,
            3.6f,
            0.5f,
            1.2f,
            1.6f,
            0.35f,
            0.45f,
            1.6f,
            0.5f,
            0.55f,
            0.65f,
            0.5f,
            1.2f,
            0.65f,
            2.1f,
            1.5f,
            1.1f,
            0.6f,
            1.7f,
            2.7f
        };
        
        
        
        // System.out.println(numbers.length + " " + locations.length);
        String[] distance = new String[numbers.length];

        for(int i=0;i<numbers.length;i++) {
            distance[i] = String.format("%.2ff", numbers[i]);
        }
        

        for (int i = 0; i < locations.length - 1; i++) {
            System.out.println("graph[341].add(new Edge(" + locations[i] +  ", " + locations[i + 1] + ", 9, " + distance[i] + "));");
        }
        
    }
}