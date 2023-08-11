import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is/was date of book returned ?");
        String returnDate = scanner.nextLine();
        System.out.println("When is/was due date ?");
        String dueDate = scanner.nextLine();

        String[] returnArr = returnDate.trim().split(" ");
        int monthR= Integer.parseInt(returnArr[0]);
        int dayR = Integer.parseInt(returnArr[1]);
        int yearR = Integer.parseInt(returnArr[2]);

        String[] dueArr = dueDate.trim().split(" ");
        int monthD =Integer.parseInt(dueArr[0]);
        int dayD =Integer.parseInt(dueArr[1]);
        int yearD = Integer.parseInt(dueArr[2]);


        if(yearR>yearD){
            System.out.println("fine = $1000");
        }
        else if(yearR == yearD && monthR <= monthD && dayR<=dayD){
            System.out.println("Thank you for returning on time");
        }
        else if(yearR==yearD && monthR==monthD && dayR>dayD){
            int difference = dayR - dayD;

             int fine = difference * 15;

           System.out.println("Fine = $"+ fine);
        }
        else if(yearR == yearD && monthR>monthD ) {
            System.out.println("Fine = $" + (monthR-monthD)*500);
        }

        else{
            System.out.println("Invalid input");
        }






    }
}
