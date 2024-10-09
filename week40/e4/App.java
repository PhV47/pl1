package e4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("You entered: "+ name);

        for(int i= name.length()-1; i>=0; i-=2){
            System.out.println(name.charAt(i));
        }
        userInput.close();
    
}
}
