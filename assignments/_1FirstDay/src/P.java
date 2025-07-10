import java.util.HashMap;
import java.util.Map;

public class P {
    public static String findword(String input) {

        String[] words = input.split(" ");

        int maxCount = 0;

        String res = "";

        for (String word : words) {

            Map<Character, Integer> counts = new HashMap<>();

            for (char ch : word.toLowerCase().toCharArray()) {

                counts.put(ch, counts.getOrDefault(ch, 0) + 1);

            }

            int timesRepeated = 0;

            for (int count : counts.values()) {

                if (count > 1) {

                    timesRepeated += count - 1;

                }

            }

            if (timesRepeated > maxCount) {
                maxCount = timesRepeated;

                res = word;

            }

        }

        if (maxCount > 0) {

            return res;

        }

        return "-1";

    }
}
