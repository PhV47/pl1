package e3;
import java.util.Scanner;
public class App {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    System.out.println("Is it a weekend (type true/false): ");
    boolean weekend = scanner.nextBoolean();
    boolean under18 = (age <18);
    boolean over65 = (age>65);
    if (!weekend || under18 ||over65){
        System.out.println("You are eligible for a discounted movie ticket.");
    }else {
        System.out.println("You are not eligible for a discounted movie ticket.");}
        scanner.close();
    }    
}    

    
    

