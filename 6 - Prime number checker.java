import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(isPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " isn't a prime number.");
        }
    }
    
    public static boolean isPrime(int num){
        if (num <= 1) return false;//number <= 1 are not prime.
        if (num == 2) return true;//number 2 is prime.
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;//divisor found not prime.
        }
        
        return true;//no divisors found, its a prime!
    }
}
