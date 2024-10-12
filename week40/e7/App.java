package e7;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while(true){
        System.out.println("Enter your password:");
        String password = userInput.nextLine();
        if (password.length() < 8) {
            System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter, one lowercase letter and one digit.");
            continue;
        }
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        
        if (hasUppercase && hasLowercase && hasDigit) {
            System.out.println("Password is valid!");
            break;
        } else {
            System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter, one lowercase letter and one digit.");
        }
        }

     userInput.close();   
    }    
}
