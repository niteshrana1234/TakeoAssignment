import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
       int number;

        do{

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number:");
            number=scanner.nextInt();
            if(number!=1 && number!=2) {
                System.out.println("Please enter correct value!!");
            }


        }
        while(number!=1 && number!=2);
    }
}
