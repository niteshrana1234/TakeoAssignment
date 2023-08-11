import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number separated by space:");
        String input = scanner.nextLine();
        String[] inputArr = input.trim().split(" ");
        int[] intArr = new int[inputArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(inputArr[i]);
        }

        if (intArr[1] % intArr[0] == 0) {
            System.out.println("divisible!!");
        } else {
            System.out.println("Not divisible");
        }

        scanner.close();


    }
}
