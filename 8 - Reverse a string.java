// Program to reverse a given string

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = "", str = sc.nextLine();
        char c;
        
        for(int i = str.length() - 1; i >= 0; i--){
            c = str.charAt(i);
            r += c;
        }
        
        System.out.println(r);
    }
}
