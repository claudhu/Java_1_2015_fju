import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Please enter the code of the tickets you want : ") ;
		
		int i = input.nextInt();
		int price = 0 ;
		int total = 0 ;
		
		while ( i!=0 ) {
			switch(i) {
			case 1 :  price = 3000 ;
		        break;
			case 2 :  price = 2500 ;
				break;
			case 3 :  price = 2000 ;
				break;
			case 4 :  price = 1000 ;
				break;
			case 5 :  price = 500 ;
			}
			
			total = total + price ;
			i = input.nextInt();
		}
		
		System.out.print("The total amout of money is : " + total) ;
	}
	

	
	

}
