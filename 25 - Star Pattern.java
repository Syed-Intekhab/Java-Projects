public class Main{
    public static void main(String[] args){
        int n = 5;
        
        // Outer loop (Row)
        for(int i = 1; i <= n; i++){
            // Inner loop (Column)
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
	*
	* *
	* * *
	* * * *
*/
