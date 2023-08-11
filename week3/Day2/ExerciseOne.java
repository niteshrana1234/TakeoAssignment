public class ExerciseOne {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int[] arr = {2, 5, 4, -5, -7, 0, -6, 80, 0};
        for (int num : arr) {
            if (num < 0) {
                negative++;
            } else if (num > 0) {
                positive++;
            } else if (num == 0) {
                zero++;
            }

        }
        System.out.println("positive num:" + positive);
        System.out.println("negative num:" + negative);
        System.out.println("zero:" + zero);


    }
}
