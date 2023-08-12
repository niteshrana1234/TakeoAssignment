public class ExerciseOne {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 50, 6, 22, 44};
        for (int i = 0; i < 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            System.out.println(arr[max]);
        }
    }
}
