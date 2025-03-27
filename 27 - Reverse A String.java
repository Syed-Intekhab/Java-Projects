import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        
        for(int i = 0; i < sb.length() / 2; i++){
            int backIndex = sb.length() - 1 - i;
            
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(backIndex);
            
            sb.setCharAt(i, backChar);
            sb.setCharAt(backIndex, frontChar);
        }
        
        System.out.println(sb);
    }
}
