package e5;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
       Scanner scoreInput = new Scanner(System.in);
       double totalScores=0;
       int numberOfScores=0;
       double average=0.0;
    while(true){

           System.out.println("Give a test score (-1 to quit):");
           double score = scoreInput.nextInt();
           if (score == -1){
            break;
           }
           totalScores += score;
           numberOfScores++;
           average = totalScores/numberOfScores;
           System.out.println("Average: "+average);
        }
    System.out.println("Summary");
    System.out.println("-------");
    System.out.println("Tests: "+ numberOfScores);
    System.out.println("Average: "+ average);
      
scoreInput.close();
     }  
}
       

       
    
      

    
    

