package e05;

public class App {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 9, 10};
        System.out.println("number| number > 0| number < 10| number > 0 && number < 10| !(number > 0 && number < 10)| number > 0 || number < 10");
        for (int number : numbers) {
            
            boolean greaterThan0 = number > 0;
            boolean lessThan10 = number < 10;
            boolean between0And10 = greaterThan0 && lessThan10;
            boolean notBetween0And10 = !between0And10;
            boolean greaterThan0OrLessThan10 = greaterThan0 || lessThan10;

            
            System.out.println(number + " |" + greaterThan0 + "   | " + lessThan10 + " | " + between0And10 + " | " + notBetween0And10 + "  | " + greaterThan0OrLessThan10);
        }
    }
}
