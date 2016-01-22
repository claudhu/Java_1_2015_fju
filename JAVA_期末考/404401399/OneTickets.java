
import java.util.Scanner;
public class OneTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Plesae choose a kind of ticket :");
		int kind = input.nextInt();
		
		System.out.println("How many tickets you want ? ");
		int ticket = input.nextInt();
		
		    if(kind==1)
			System.out.println("your ticket cost " + 3000*ticket );
			else if(kind==2)
				System.out.println("your ticket cost " + 2500*ticket );
			else if(kind==3)
				System.out.println("your ticket cost " + 2000*ticket );
			else if(kind==4)
					System.out.println("your ticket cost " + 1000*ticket );
			else if(kind==5)
					System.out.println("your ticket cost " + 500*ticket );
		}

	}


