import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for scissor
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 0 for Rock ,1 for paper, 2 for scissor\n");
        int userInput=sc.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt(3);
        if (userInput==computerInput) {
            System.out.println("Draw");
            
        }
        else if (userInput==0 && computerInput==2||userInput==1&&computerInput==0||userInput==2&&computerInput==1) {
            System.out.println("Yow Win!");
            
        }
    }
    
}
