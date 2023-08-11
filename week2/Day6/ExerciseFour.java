import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char chr = input.charAt(i);
            {
                if(chr == 'a' || chr == 'e' ||chr == 'i' ||chr == 'o' ||chr == 'u'  ){
                    count++;
                }
            }

        }
        System.out.println("Vowel count is " + count);
    }
}