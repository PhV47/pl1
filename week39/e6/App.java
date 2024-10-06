package e6;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        int number;
        int correctNumber = 8;

        do{
            System.out.print("Guess a number(0-10): ");
            number = numberInput.nextInt();
            if (number>8){
                System.out.println("Guess was to high");}
                else if(number<8){
                    System.out.println("Guess was too low");
                }
                else{
                    System.out.println("SUCCESS!");
                }

            }while(number != correctNumber);
numberInput.close();
        }
    }    
        
        
    
    

