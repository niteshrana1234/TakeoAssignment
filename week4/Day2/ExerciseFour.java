import java.util.ArrayList;
import java.util.List;

public class ExerciseFour {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(18);
        list.add(12);
        list.add(19);


        int sum = 20;

        for (int i = 0; i < list.size()-1; i++) {  //4,1,8,4
            int target = sum - list.get(i);

            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).equals(target)) {
                    System.out.println(list.get(i) + "," + list.get(j));

                }
            }
        }
    }
}
