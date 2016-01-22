

import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		int code;
		int count=0;
		int total=0;
		int[] ticket_info = {3000,2500,2000,1000,500};
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter more ticket codes and counts:");
		
		
		do{
			code = input.nextInt();
			if(code==0)
				break;
			count = input.nextInt();
			total = total+ticket_info[code-1]*count;
		}while(true);	
		System.out.printf("total price is %d\n",total);

	}

}
