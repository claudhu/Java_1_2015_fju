

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		int code;
		int count=0;
		int total=0;
		int[] ticket_info = {3000,2500,2000,1000,500};
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a ticket code and count:");
		code = input.nextInt();
		count = input.nextInt();
		total = ticket_info[code-1]*count;
		System.out.printf("total price is %d\n",total);
		
	}

}
