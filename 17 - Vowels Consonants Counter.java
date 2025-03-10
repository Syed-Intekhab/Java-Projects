import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        char consonants[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        int vowel = 0, consonant = 0;
        
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        String newStr = str.toLowerCase();
        
        for(int i = 0; i < newStr.length(); i++){
            char temp = newStr.charAt(i);
            
            for(int j = 0; j < vowels.length; j++){
                if(temp == vowels[j]){
                    vowel++;
                }
            }
            
            for(int k = 0; k < consonants.length; k++){
                if(temp == consonants[k]){
                    consonant++;
                }
            }
        }
        
        System.out.println("In the entered string there are: ");
        System.out.println(vowel + " Vowel/s and " + consonant + " Consonants.");
    }
}
