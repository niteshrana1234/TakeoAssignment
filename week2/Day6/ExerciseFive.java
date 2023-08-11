import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array:");
        int [] arr = new int[scanner.nextInt()];
        int sum =0;
        for(int i =0; i<arr.length;i++){
            System.out.print("Enter value for index["+i+"]:");
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("---------------------------------------");
        System.out.println("The sum of given integer is " + sum);
        double avg = (double)sum/arr.length;
        System.out.println("The average of given elements is "+avg);
    }
}
