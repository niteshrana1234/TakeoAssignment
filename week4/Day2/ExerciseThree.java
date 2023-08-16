import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExerciseThree {
    static Map<String, Long> map = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1.Add contact \n2.Search contact \n3.delete contact \n4.Exit");

            switch (scanner.nextInt()) {

                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    System.exit(0);

            }
        }

    }

    public static void addContact() {
        System.out.println("How many contact are you adding ?");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println("Enter name(" + i + ") : ");
            String name = scanner.next().toLowerCase();
            System.out.println("Enter number(" + i + ") : ");
            long phoneNum = scanner.nextLong();
            map.put(name, phoneNum);
        }
    }

    public static void searchContact() {
        System.out.println("Enter name to lookup phone number:");
        String name = scanner.next().toLowerCase();
        boolean found = false;
        for (Map.Entry<String, Long> maps : map.entrySet()) {
            if (name.equals(maps.getKey())) {
                System.out.println("Name : " + maps.getKey() + "\nPhone number : " + maps.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found!!");
        }
    }

    public static void deleteContact() {
        System.out.println("Enter name to delete entries:");
        String name = scanner.next().toLowerCase();
        boolean found = false;
        for (Map.Entry<String, Long> maps : map.entrySet()) {
            if (name.equals(maps.getKey())) {
                map.remove(maps.getKey(), maps.getValue());
                System.out.println("Deleted successfully");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found!!");
        }
    }

}
