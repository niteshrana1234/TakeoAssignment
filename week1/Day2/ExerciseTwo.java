public class ExerciseTwo {
    public static void main(String[] args) {
        int usd = 10;
        final double EXCHANGE_RATE = 131.41;
        Double conversion=usd * EXCHANGE_RATE; // To convert Usd into Nepali currency
        System.out.println("$"+usd+" is equal to Rs " + conversion);
    }
}
