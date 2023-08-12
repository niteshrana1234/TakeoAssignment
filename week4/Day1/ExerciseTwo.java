import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);


        List<Integer> mergeList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            mergeList.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            mergeList.add(list1.get(i));
        }
        System.out.println(mergeList);

    }
}
