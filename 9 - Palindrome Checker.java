// Program to check if given string is palindrome or not!
import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rstr = "", str = sc.nextLine();
        char ch;
        
        for(int i = str.length() - 1; i >= 0; i--){
            ch = str.charAt(i);
            rstr += ch;
        }
        
        if(str.equals(rstr)){
            System.out.println("The given string is Palindrome!");
        } else {
            System.out.println("The given string isn't Palindrome!");
        }
    }
}
