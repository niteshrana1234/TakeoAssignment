import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x = scanner.nextInt();
        System.out.print("Enter second number:");
        int y = scanner.nextInt();

        int z;
        z = x;
        x = y;
        y=z;
        System.out.println("******swapped number********");
        System.out.println("First number: "+x);
        System.out.println("Second number: "+y);
    }
}
