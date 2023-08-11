public class ExerciseOne {
    public static void main(String[] args) {
        String[] arr = {"ABC", "XYZ", "LION"};
        boolean check = false;
        String toCheck = "XYZ";

        for (String name : arr) {
            if (name.equals(toCheck)) {
                check = true;
                break;
            }
        }
        if(check) {
            System.out.println("XYZ exist");
        }
        else {
            System.out.println("XYZ doesn't exist");
        }
    }
}
