package e2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score (0-100): ");
        int score = scanner.nextInt();
        if (score >=90 && score <=100) {
            System.out.println("Excellent!");}
        else if (score >=70 && score <= 89) {
            System.out.println("Good job!");}
        else if (score >=50 && score <= 69){
            System.out.println("Need Improvements.");
        }else if (score <50){
            System.out.println("Fail.");}
         else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
         } 
         scanner.close();  
        }    
        }    
          
        

    

