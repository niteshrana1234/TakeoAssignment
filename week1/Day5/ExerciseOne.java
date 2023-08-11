import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle amount:");
        int principle = scanner.nextInt();
        System.out.print("Enter rateOfInterest:");
        double interest = scanner.nextDouble();
        System.out.print("Enter timePeriod:");
        int time = scanner.nextInt();
        double simpleInterest= (principle*interest*time)/100;
        System.out.println("Simple Interest is " + simpleInterest);
        scanner.close();
    }
}
