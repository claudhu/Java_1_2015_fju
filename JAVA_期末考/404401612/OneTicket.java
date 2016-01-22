import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Select one kind of ticket
		
        System.out.println("Which ticket you want?: (1~5) ");
		int ticket = input.nextInt();
		System.out.println("How many?: ");
		int count = input.nextInt();
		
		switch( ticket ){
		case 1 : System.out.println("Prize: $" + 3000 * count );break;
		case 2 : System.out.println("Prize: $" + 2500 * count );break;
		case 3 : System.out.println("Prize: $" + 2000 * count );break;
		case 4 : System.out.println("Prize: $" + 1000 * count );break;
		case 5 : System.out.println("Prize: $" +  500 * count );break;
		}
		
	}

}
