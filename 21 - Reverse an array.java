
// Program to reverse an array elements.

import java.util.*;

public class Main{
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println("Original: " + Arrays.toString(arr));
        
        for(int i = 0;  i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
