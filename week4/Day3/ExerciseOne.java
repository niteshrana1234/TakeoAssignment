import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
            list.add(6);
            list.add(5);
            list.add(4);
            list.add(3);
            list.add(2);
            list.add(1);
            list.add(0);

            Iterator<Integer> iterator = list.iterator();

            while(iterator.hasNext()){
                int a  = iterator.next();
                if(a%2==0){
                    iterator.remove();
                }
            }
            System.out.println("Uneven number : " + list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
