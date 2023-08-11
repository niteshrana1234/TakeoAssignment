import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentences?");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); // My name is Nitesh.
        if(words.length>=2) {

            System.out.println(words[words.length - 2]);
        }
        else {
            System.out.println("The sentence doesn't have enough words!!");
        }


    }
}
