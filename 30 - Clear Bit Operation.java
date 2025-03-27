import java.util.*;

public class Main{
    public static void main(String args[]){
        int n = 5;
        int pos = 0;
        int bitMask = 1 << pos;
        
        int newNumber = ~bitMask & n;
        
        System.out.println(newNumber);
    }
}
