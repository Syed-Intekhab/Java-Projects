import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String email = sc.nextLine();
        String userName = "";
        
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        
        System.out.println("Your User Name is: " + userName);
    }
}
