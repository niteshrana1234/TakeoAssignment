import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of number separated by space:");
        String input = scanner.nextLine();
        String[] numberString = input.trim().split(" ");
        int[] numbers = new int[numberString.length];

        for(int i = 0; i<numbers.length;i++){
            numbers[i]= Integer.parseInt(numberString[i]);
        }

        for(int i = 0;i<1;i++) {
            int max =i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            System.out.println("Max input is "+numbers[max]);
        }

        }

        }






