//Program to check whether the entered year is leap or not.
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isLeapYear = false;
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        if(year % 4 == 0 && year % 400 == 0){
            isLeapYear = true;
        }
        
        if(isLeapYear){
            System.out.println("Leap Year!");
        } else {
            System.out.println("Non Leap Year!");
        }
    }
}
