import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the ticket code:");
    int codenum = input.nextInt();
    System.out.println("Please enter your ticket(s):");
    int ticketnum = input.nextInt();
    int totalprice = 0;
    
    if (codenum == 1)
    	totalprice = 3000*ticketnum;
    else if (codenum == 2)
        totalprice = 2500*ticketnum;
    else if (codenum == 3)
        totalprice = 2000*ticketnum;
    else if (codenum == 4)
        totalprice = 1000*ticketnum;
    else if (codenum == 5)
        totalprice = 500*ticketnum;
	
    System.out.println("The total price of your ticket:" + totalprice);
	}	
		
			
	}
	


