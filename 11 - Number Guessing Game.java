import java.util.*;

public class Main{
    public static void main(String[] args){
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        int num, i, rnum;
        
        System.out.println("Welcome to the Game!\n\n");
        System.out.println("Guess the number between 1 to 100");
        
        rnum = generate();
        
        for(i = 1; i < 11; i++){
            System.out.print("Guess the number: ");
            num = sc.nextInt();
            
            if(num == rnum){
                System.out.println("Congrats! You Won. The number is: " + num);
                System.out.println("You've guessed the right number in: " + i + " Moves.");
                break;
            } else if(num > rnum){
                System.out.println("Enter Smaller Number.");
            } else if(num < rnum){
                System.out.println("Enter Greater Number.");
            }
        }
        
        if(i == 11){
            System.out.println("You've lost the game!");
        }
    }
    
    public static int generate(){
        return (int) (Math.random() * 101);
    }
}
