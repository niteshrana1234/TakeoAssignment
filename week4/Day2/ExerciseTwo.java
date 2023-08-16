
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExerciseTwo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Set<Integer> set = new HashSet<>();

        for (Integer a : list) {
            set.add(a);
        }

        System.out.println(set);

    }
}

