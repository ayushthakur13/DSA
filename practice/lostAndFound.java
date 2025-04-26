import java.util.HashMap;
import java.util.Map;

public class lostAndFound {

    static void printDuplicates(String[] names) {

        if (names.length == 0) {
            System.out.println("No guests provided");
            return;
        }

        Map<String, Integer> map = new HashMap<>();

        for (String name : names) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        boolean hasDuplicates = false;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                result.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
                hasDuplicates = true;
            }
        }

        System.out.print(hasDuplicates ? result : "No duplicates found");
    }

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Bob"};

        printDuplicates(names);
    }
}
