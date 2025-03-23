// 0's 1's piramid
import java.util.*;

public class Main{
    public static void main(String args[]){
        int n = 5;
        // Outer Loop
        for(int i = 1; i <= n; i++){
            // Inner Loop
            for(int j = 1; j <= i; j++){
                if((j+i) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
  	1
  	0 1
  	1 0 1
  	0 1 0 1
  	1 0 1 0 1
*/
