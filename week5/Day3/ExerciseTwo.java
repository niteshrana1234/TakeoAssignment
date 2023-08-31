import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 4, 6, 3, 7, 8);
        List<Integer> list1 = List.of(2, 5, 8, 2, 5, 6);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list1.contains(list.get(i))) {
                resultList.add(list.get(i));
            }
        }
        System.out.println(resultList);
    }
}
