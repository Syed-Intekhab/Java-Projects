import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation: ");
        int oper = sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        
        if(oper == 1){
            int setNumber = bitMask | n;
            System.out.println("Set bit operation: " + setNumber);
        } else if(oper == 0) {
            int notBitMask = ~bitMask;
            int clearNumber = notBitMask & n;
            System.out.println("Clear bit operation: " + clearNumber);
        } else {
            System.out.println("Valid operations are 0 : 1");
        }
    }
}
