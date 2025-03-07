import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        long a = 0,fibonacci = 0,b = 1,num = sc.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        
        for(int i = 3; i <= num; i++){
            fibonacci = (a + b);
            a = b;
            b = fibonacci;
            System.out.println(fibonacci);
        }
        
    }
}
