
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseTwo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,3,3, 7, 7, 5, 9, 5, 7);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.size();i++){
            map.put(numbers.get(i), map.getOrDefault(numbers.get(i),0)+1);
        }
       int maxNum = 0;
        for(Map.Entry<Integer,Integer> maps: map.entrySet()){
            int value = maps.getValue();
            if(maxNum < value){
                maxNum = value;
            }
        }
        int largestNumber = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> maps: map.entrySet()){
            if(maps.getValue()==maxNum){
                largestNumber = Math.max(largestNumber, maps.getKey());
            }

        }
        System.out.println(largestNumber);


    }
}
