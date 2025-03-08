import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter any number: ");
            int num = sc.nextInt();
            
            if(num % 2 == 0){
                System.out.println("Even!");
            } else {
                System.out.println("Odd!");
            }
        }
    }
}
