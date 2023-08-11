import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What digit multiplication do you want ?");
        int number = scanner.nextInt();
        System.out.println("\033[4mMultiplication of \"" + number + "\"\033[0m");
        for(int i =1;i<=10;i++){
            int total = number*i;
            System.out.println(number+" * "+i+" = "+total);
        }
    }
}
