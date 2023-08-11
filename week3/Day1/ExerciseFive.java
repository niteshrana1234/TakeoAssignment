public class ExerciseFive {
    public static void main(String[] args) {
        int[] array = {10, 3, 33, 40, 55, 1, 100};
        boolean check = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("sorted");
        } else {
            System.out.println("Unsorted");
        }

    }
}
