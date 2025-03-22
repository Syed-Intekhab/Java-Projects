import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        boolean isAscending = true;
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter any number: ");
            numbers[i] = sc.nextInt();
        }
        
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                isAscending = false;
            }
        }
        
        if(isAscending){
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array isn't sorted!");
        }
    }
}
