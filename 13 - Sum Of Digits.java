//Program to calculate sum of digits.
import java.util.*;

public class Main{
    public static void main(String args[]){
        // Make a Scanner object for user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int sum = 0;

        //Calculate the sum of digits
        while(num > 0){
            int digit = num % 10; // Extracts the last digit.
            sum += digit;   //Add it to the sum.
            num = num / 10; //Removes the last digit.
        }

        // Print the total.
        System.out.println("The total of given number is: " + sum);
    }
}