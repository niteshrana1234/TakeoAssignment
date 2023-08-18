import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        System.out.println("List of integers : "+ list);

        int listSize = list.size();

        List<Integer> newList = new ArrayList<>();

        for (int i = listSize - 1; i > 0; i--) {
            newList.add(list.get(i));
        }
        System.out.println("------------------------");
        System.out.println("Reverse list : "+newList);

    }
}
