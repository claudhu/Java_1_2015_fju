import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        
        // Select kinds of tickets
        int sum = 0 ;
        while ( true ){
        	System.out.println("Which ticket you want?: (1~5) ");
        	int ticket = input.nextInt();
        	if ( ticket == 0)
        		break;
        	
        	System.out.println("How many?: ");
        	int count = input.nextInt();
        	
        	switch( ticket ){
    		case 1 : sum = sum + 3000 * count;break;
    		case 2 : sum = sum + 2500 * count;break;
    		case 3 : sum = sum + 2000 * count;break;
    		case 4 : sum = sum + 1000 * count;break;
    		case 5 : sum = sum +  500 * count;break;
    		}	
        }
        System.out.println("Prize : $"+sum);
        
		
	}

}
