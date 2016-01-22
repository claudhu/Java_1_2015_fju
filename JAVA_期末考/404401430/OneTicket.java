

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which kind of ticket do you want to buy?(number 1 to 5):");
		int ticketKind = input.nextInt();
		
		System.out.print("How many do you want?:");
		int ticketNum = input.nextInt();
		
		if(ticketKind == 1)
			System.out.print("You have to pay "+3000*ticketNum+" dollars, thank you.");
		else if(ticketKind ==2)
			System.out.print("You have to pay "+2500*ticketNum+" dollars, thank you.");
		else if(ticketKind ==3)
			System.out.print("You have to pay "+2000*ticketNum+" dollars, thank you.");
		else if(ticketKind ==4)
			System.out.print("You have to pay "+1000*ticketNum+" dollars, thank you.");
		else if(ticketKind ==5)
			System.out.print("You have to pay "+500*ticketNum+" dollars, thank you.");
		else
			System.out.print("Sorry, you enter the wrong number of ticket's kind.");
		
		input.close();

	}

}
