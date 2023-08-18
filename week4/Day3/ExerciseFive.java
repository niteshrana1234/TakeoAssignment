public class ExerciseFive {
    public static void main(String[] args) {
        int[] arr = {0, 8, 1, 3, 4, 5,6, 7};
        int arrSum = 0;
        int highValue = 0;

        //Find sum of array
        for (int num : arr) {
            arrSum += num;
            if (num > highValue) {
                highValue = num;
            }
        }

        /* Formula to calculate expected sum
        n*(n+1)/2
        n = highest value in array.
         */
        int expectedSum = highValue * (highValue + 1) / 2;
        int missingNum = expectedSum - arrSum;
        System.out.println(missingNum);

    }
}
