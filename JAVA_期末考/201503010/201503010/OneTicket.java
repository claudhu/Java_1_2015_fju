import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Please enter the code of ticket and the quantity: ") ;
		int a = input.nextInt() ;
		int b = input.nextInt() ; 
		
		int price=0 ;
		
		switch(a) {
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
		
		int total ;
		total = price*b ;
		
		System.out.print("The total amout of money is : " + total) ;
	}

}
