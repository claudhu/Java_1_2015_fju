import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total=0;
		int array[] = {3000, 2500, 2000, 1000, 500};
		while (true) {
			System.out.printf("Please enter the code of ticket: ");
			int code = input.nextInt();
			if (code==0) break;
			System.out.printf("Please enter the amount needed: ");
			int amount = input.nextInt();
			total+=array[code-1]*amount;			
		}
		System.out.printf("Your total costs: %d", total);
	}
}
