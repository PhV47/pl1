package e1;
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Which multiplication table to show?: ");
        int number = userInput.nextInt();
        for (int i= 0; i<=10; i++){
            System.out.println(i + " x " +number + " = " + (i*number));
            
        }
      userInput.close();
    }
}