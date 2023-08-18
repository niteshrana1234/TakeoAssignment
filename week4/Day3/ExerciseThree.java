import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseThree {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(3);

        Map<Integer, Integer> map = new HashMap<>();
        for (int key : list) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int a : map.keySet()) {
            int value = map.get(a);
            if (value == 1) {
                System.out.println(a);
            }
        }
    }
}
