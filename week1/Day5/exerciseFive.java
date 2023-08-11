import java.util.Scanner;

public class exerciseFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms:");
        int weight = scanner.nextInt(); // Kilograms
        System.out.print("Enter height in meters:");
        double height = scanner.nextDouble(); // meters
        bmiCalculator(weight, height);
        scanner.close();

    }

    public static void bmiCalculator(int kiloGram, double meters) {
        double bmi = kiloGram / (meters * meters);
        System.out.println("Your BMI: " + bmi);
    }

}
