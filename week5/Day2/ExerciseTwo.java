import java.util.HashMap;
import java.util.Map;

public class ExerciseTwo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 40);
        map.put("C", 30);
        int max = 0;
        String maxKey = null;

        for (Map.Entry<String, Integer> maps : map.entrySet()) {
            if (maps.getValue() > max) {
                max = maps.getValue();
                maxKey = maps.getKey();
            }
        }
        System.out.println(maxKey);

    }
}
