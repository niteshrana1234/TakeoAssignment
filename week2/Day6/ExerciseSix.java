import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array:");
        int[] arr = new int[scanner.nextInt()];
        int sum = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index[" + i + "]:");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to check if it is in array:");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                System.out.println("Number " + number + " is at index '" + i + "'");
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println(number+" is not in array");
        }
    }
}
