package e5;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String concatenatedNames = "";
        String breakName = "Quit";
        boolean i= true;
        while(i){
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        
        if(name.equalsIgnoreCase(breakName)){
             i = false;
            System.out.println("Quit");
            break;}
            else{
                concatenatedNames += name;
                System.out.println(concatenatedNames);
            }              

        }
        userInput.close(); 
        }
   
}

