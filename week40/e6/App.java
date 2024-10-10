package e6;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while(true){
        System.out.println("Palindrome test, please enter some text:");
        String text = userInput.nextLine();
        String changedText = text.toLowerCase().replaceAll("[^a-z]", "");
        String reversedText = new StringBuilder(changedText).reverse().toString();

        if(text.equalsIgnoreCase("Exit")){
            System.out.println("Exit program!");
           break;
        }
        if(changedText.equals(reversedText)){
            System.out.println(text +" is a palindrome");
        }
        else{
            System.out.println(text+ " is not a palindrome");
        }
    } 
        userInput.close();
}
}

