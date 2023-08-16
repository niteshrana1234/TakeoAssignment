import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
