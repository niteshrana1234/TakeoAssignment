import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade:");
        double grade = scanner.nextDouble();
        if(grade<60 && grade >=0){
            System.out.println("your grade is 'F'");
        }
        else if(grade>59 && grade<70){
            System.out.println("your grade is 'D'");

        }
        else if(grade>69 && grade <80){
            System.out.println("your grade is 'C'");

        }
        else if(grade>79 && grade<90){
            System.out.println("your grade is 'B'");
        }
        else if(grade>89 && grade<=100){
            System.out.println("your grade is 'A'");
        }
        else if(grade<0 || grade>100){
            System.out.println("Enter valid marks");
        }
        scanner.close();
    }
}
