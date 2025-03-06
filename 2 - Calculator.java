import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1, num2, total, choice;
		
		System.out.println("\t\t\t\t\t\t\tCalculator");
		System.out.println("1 for addition.");
		System.out.println("2 for substraction.");
		System.out.println("3 for multiplication.");
		System.out.println("4 for division.");
		System.out.println("5 to exit.");
			
		while(true){
				System.out.print("\n\nEnter num1: ");
				num1 = sc.nextInt();
				
				System.out.print("Enter num2: ");
				num2 = sc.nextInt();
				
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				
				if(choice == 1){
						total = num1 + num2;
						System.out.println("Addition: " + total);
				} else if(choice == 2){
						total = num1 - num2;
						System.out.println("Substraction: " + total);
				} else if(choice == 3){
						total = num1 * num2;
						System.out.println("Multiplication: " + total);
				} else if(choice == 4){
						if(num2 == 0){
								System.out.println("Cant devide by 0");
						} else {
								total = num1 / num2;
								System.out.println("Division: " + total);
						}
				} else if(choice == 5){
						break;
				} else {
						System.out.println("Enter a valid Choice!");
				}
		}
			
	}
}
