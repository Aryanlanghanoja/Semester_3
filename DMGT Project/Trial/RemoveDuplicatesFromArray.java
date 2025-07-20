import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        String[] inputArray = {
            "apple", "banana", "cherry", "apple", "date", "banana"
        };

        // Create a HashSet to store unique elements
        Set<String> uniqueSet = new HashSet<>();

        // Create a list to store the result (unique elements)
        List<String> uniqueList = new ArrayList<>();

        // Loop through the inputArray and add unique elements to the set and list
        for (String element : inputArray) {
            if (uniqueSet.add(element)) {
                uniqueList.add(element);
            }
        }

        // Convert the uniqueList back to an array if needed
        String[] resultArray = uniqueList.toArray(new String[0]);

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(resultArray));
    }
}
