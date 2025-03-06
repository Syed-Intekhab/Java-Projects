import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float c, f;
		int choice;
		
		System.out.println("\t\t\t\tTemperature Coverter");
		System.out.println("1 for C to F");
		System.out.println("2 for F to C");
		System.out.println("3 to exit");
		
		while(true){
				System.out.print("\n\n\nEnter choice: ");
				choice = sc.nextInt();
				
				if(choice == 1){
						System.out.print("Enter C: ");
						c = sc.nextFloat();
						
						f = (c * 9/5) + 32;
						System.out.println(f + "F");
				} else if(choice == 2){
						System.out.print("Enter F: ");
						f = sc.nextFloat();
						
						c = (f - 32) * 5/9;
						System.out.println(c + "C");
				} else if(choice == 3){
						break;
				} else {
						System.out.println("Invalid Choice!");
				}
		}
	}
}
