public class ExerciseThree {
    public static void main(String[] args) {
      String string = "How are you?";
      String[] arr = string.trim().split(" ");
        for(String a : arr){
            System.out.println(a);
        }
    }
}
