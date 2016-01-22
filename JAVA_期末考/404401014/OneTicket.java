import java.util.Scanner;
public class OneTicket {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the code of ticket: ");
		int code = input.nextInt();
		System.out.printf("Please enter the amount needed: ");
		int amount = input.nextInt();
		switch (code) {
		case 1: System.out.printf("Your total costs: %d", 3000*amount); break;
		case 2: System.out.printf("Your total costs: %d", 2500*amount); break;
		case 3: System.out.printf("Your total costs: %d", 2000*amount); break;
		case 4: System.out.printf("Your total costs: %d", 1000*amount); break;
		case 5: System.out.printf("Your total costs: %d", 500*amount); break;
		}
		
	}
}
