package e4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number (0 to quit):");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("0");
                break;
            }
        
            if (number < 0) {
                System.out.println("Please enter a positive number.");
            } else {
              
                if (number % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            }

        } while (number != 0);

        scanner.close();
    }
}
    

