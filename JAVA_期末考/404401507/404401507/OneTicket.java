import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

		System.out.print("Choose ticket number: ");
		int number = input.nextInt();
		System.out.print("How many ticket you buy: ");
		int buy = input.nextInt();

		switch (number) {
		case 1:
			System.out.print("$" + 3000 * buy);
			break;
		case 2:
			System.out.print("$" + 2500 * buy);
			break;
		case 3:
			System.out.print("$" + 2000 * buy);
			break;
		case 4:
			System.out.print("$" + 1000 * buy);
			break;
		case 5:
			System.out.print("$" + 500 * buy);
			break;
		}
	
		
		

	}

}
