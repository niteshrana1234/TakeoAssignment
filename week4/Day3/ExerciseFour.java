import java.util.HashMap;
import java.util.Map;

public class ExerciseFour {
    public static void main(String[] args) {

        int[] intArr = {2, 7, 11, 15, 12, 8, 13};
        int target = 27;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArr.length; i++) {
            int findNum = target - intArr[i];
            if (map.containsKey(findNum)) {
                int secIndex = map.get(findNum);
                System.out.println("[" + secIndex + "," + i + "]");
            }
            map.put(intArr[i], i);
        }


    }
}
