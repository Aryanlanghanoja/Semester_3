public class convert {
    public static void main(String[] args) {
        float[] values = {
            0f,
            0.19f,
            1.2f,
            0.95f,
            2.8f,
            3.6f,
            0.5f,
            5.1f,
            5.8f,
            8.5f,
            9.1f,
            1.2f,
            1.3f,
            0.28f,
            0.55f,
            0.75f,
            0.6f,
            0.85f,
            0.35f,
            0.9f,
            1.2f,
            1.7f,
            1f,
            0.75f,
            0.35f,
            8.8f,
            9.9f,
            0.8f,
            2.6f,
            3.3f,
            0.7f,
            0.7f,
            0.9f,
            1.4f,
            1.5f,
            4.5f,
            1.7f,
            1.1f,
            6f,
            5.5f,
            0.15f,
            0.7f
        };

        String[] distance = new String[values.length];

        for(int i=0;i<distance.length;i++) {
            distance[i] = String.format("%.2ff", values[i]);
        }


    }
    
}
