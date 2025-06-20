// Program to find minimum and maximum of a given number.
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {20, 50, 30, 10, 40, 5, 123, 52, 454, 23, 5, 6, 23, 1};
        int fElem = arr[0];
        int max = 0, min = fElem;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < fElem){
                min = arr[i];
            }
        }
        
        System.out.println("Max: " + max + " Min: " + min);
    }
}
