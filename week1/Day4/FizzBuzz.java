import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit:");
        int limit = scanner.nextInt();
        for(int i = 0;i<=limit;i++){

            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {

                System.out.println(i);
            }
        }

    }
}
