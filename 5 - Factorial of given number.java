import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        long factorial = 1;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        for(int i = num; i >= 1; i--){
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
