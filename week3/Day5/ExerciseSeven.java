import java.util.Locale;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week,0 means sunday and 6 means saturday?");
        int days = scanner.nextInt();
        System.out.println("Are you in vacation? Y/yes or N/no ?");
        scanner.nextLine();
        String input = scanner.nextLine();
        String input1 = input.toLowerCase(Locale.ROOT);
        boolean input2 = false;

        if (input1.equals("yes")) {
            input2 = true;
        } else if (input1.equals("no")) {
            input2 = false;
        }

        switch (days) {

            case 0:
                System.out.println("alarm is off");
                break;

            case 1:
                if (input2 == false) {
                    System.out.print("Alaram rings at 7:00 am");
                } else if (input2) {
                    System.out.println("Alaram rings at 10:00 am");
                }
                break;
            case 2:
                if (input2 == false) {
                    System.out.print("Alarm rings at 7:00 am");
                } else if (input2) {
                    System.out.println("Alarm rings at 10:00 am");
                }
                break;
            case 3:
                if (input2 == false) {
                    System.out.print("Alarm rings at 7:00 am");
                }
                else if (input2) {
                    System.out.println("Alarm rings at 10:00 am");
                }
                break;
            case 4:
                if (input2 == false) {
                    System.out.print("Alarm rings at 7:00 am");
                } else if (input2) {
                    System.out.println("Alarm rings at 10:00 am");
                }
                break;
            case 5:
                if (input2 == false) {
                    System.out.print("Alarm rings at 7:00 am");
                } else if (input2) {
                    System.out.println("Alarm rings at 10:00 am");
                }
                break;

            case 6:
                System.out.println("alarm is off");
                break;
            default:
                System.out.println("Please give valid input");

        }


    }
}
