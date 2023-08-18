import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

public class ExerciseFive {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String string = "aabbc";
        char[] charArr = string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            map.put(charArr[i], map.getOrDefault(charArr[i], 0) + 1);
        }

        for (Character a : map.keySet()) {
            System.out.println(a + " : " + map.get(a));
        }
    }
}
