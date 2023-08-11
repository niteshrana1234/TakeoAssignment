import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        final String SUM = "+";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number:");
        int secNUm=scanner.nextInt();
        System.out.print("Enter operation you want to perform:");
        String a = scanner.next();
        int total=firstNum+secNUm;
        if(a.equals(SUM)){
            System.out.println("Sum of " +firstNum+"+"+secNUm+" = " + total);
        }
        else{
            System.out.println("try again!!");}
    }

}

