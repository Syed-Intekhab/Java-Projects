//User Login System
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean userLoggedIn = false;
        
        while(!userLoggedIn){
            System.out.print("Enter your User Name: ");
            String userName = sc.next();
            System.out.print("Enter your Password: ");
            int password = sc.nextInt();
            
            if(password == 1925 && userName.equals("Shaan")){
                System.out.println("You've Logged In!");
                userLoggedIn = true;
            } else {
                System.out.println("Invalid Credentials Please try again later!");
            }
        }
    }
}
