import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String strs[] = new String[4];
        int length = 0;
        
        for(int i = 0; i < strs.length; i++){
            System.out.print("Enter a string: ");
            strs[i] = sc.nextLine();
            
            length += strs[i].length();
        }
        
        System.out.println("Total Length: " + length);
    }
}