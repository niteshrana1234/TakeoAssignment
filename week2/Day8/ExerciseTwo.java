import java.util.Scanner;

public class ExerciseTwo {
    static final int chickenLeg = 2;
    static final int cowLeg = 4;
    static final int pigLeg =4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chickens:");
        int chicks = scanner.nextInt();
        System.out.print("Enter number of cows:");
        int gai = scanner.nextInt();
        System.out.print("Enter number of pigs");
        int pork = scanner.nextInt();
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        exerciseTwo.animals(2,3,5);
    }
    public void animals(int a, int b, int c){
        a = a*chickenLeg;
        b = b * cowLeg;
        c = c * pigLeg;
        int total = a+b+c;
        System.out.println("The number of legs is "+ total);
    }
}
