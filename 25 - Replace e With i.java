import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String original = sc.nextLine();
        String result = "";
        
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += original.charAt(i);
            }
        }
        
        System.out.println("Result String: " + result);
    }
}