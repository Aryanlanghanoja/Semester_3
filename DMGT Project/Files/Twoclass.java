import Data.Busdata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twoclass {
    public static void main(String[] args) {
        Busdata m = new Busdata();
        int noOfStations = 379;
        ArrayList<Busdata.Edge>[] graph = new ArrayList[noOfStations];
        Map<Float, String> Map = new HashMap<>();
        m.createGraph(graph);
        String src = m.getSrc(); 
        String tar = m.getTar(); 
        boolean visit[] = new boolean[noOfStations];
        m.printAllPath(graph, visit, src, "", tar, Map, 0.0f, src);

        List<Map.Entry<Float, String>> entryList = new ArrayList<>(Map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Float, String>>() {
            @Override
            public int compare(Map.Entry<Float, String> entry1, Map.Entry<Float, String> entry2) {
                return Float.compare(entry1.getKey(), entry2.getKey());
            }
        });

        System.out.println("Shortest Path :");
        if (!entryList.isEmpty()) {
            Map.Entry<Float, String> firstEntry = entryList.get(0);
            System.out.println(firstEntry.getValue() + "\nLength: " + (String) (Math.abs((float) firstEntry.getKey()) + " km"));
        } else {
            System.out.println("No paths available.");
        }
    }
}
