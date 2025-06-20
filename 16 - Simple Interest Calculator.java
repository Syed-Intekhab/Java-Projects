//Simple Interest Calculator
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p, r, t, si;
        System.out.print("Enter the Principal Amount: ");
        p = sc.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        r = sc.nextInt();
        System.out.print("Enter the Time (In years): ");
        t = sc.nextInt();
        
        si = p * r * t / 100;
        
        System.out.println("The Simple Interest of Given Value is: " + si);
    }
}
