import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String:");
        String a = scanner.nextLine();
        System.out.print("Enter a character:");
        char b = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b == a.charAt(i)) {
                count++;
            }
        }
        System.out.println("Numbers of '"+b+"' in '"+a+"' is "+ count);

    }
}
