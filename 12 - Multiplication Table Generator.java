// Multiplication Table Generator.
import java.util.*;

public class Main{
    public static void main(String args[]){
        // Object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int i, num = sc.nextInt();
        
        for(i = 1; i < 11; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}