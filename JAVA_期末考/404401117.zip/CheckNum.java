
import java.util.Scanner; 
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter 9 digits :");
		int digits1 = input.nextInt();
		int digits2 = input.nextInt();
		int digits3 = input.nextInt();
		int digits4 = input.nextInt();
		int digits5 = input.nextInt();
		int digits6 = input.nextInt();
		int digits7 = input.nextInt();
		int digits8 = input.nextInt();
		int digits9 = input.nextInt();
		int checksum =( digits1 * 1 + digits2 * 2  
					+  digits3 * 3 + digits4 * 4
					+  digits5 * 5 + digits6 * 6
					+  digits7 * 7 + digits8 * 8
					+  digits9 * 9) %11 ;
		System.out.println(checksum);
			
		if(checksum == 10){
				checksum = 'X';
				System.out.println( digits1 + "" + digits2 + ""
								   +digits3 + "" + digits4 + ""
								   +digits5 + "" + digits6 + ""
								   +digits7 + "" + digits8 + ""
								   +digits9 + "" + checksum );}
				else 
					System.out.println( digits1 + "" + digits2 + ""
							   +digits3 + "" + digits4 + ""
							   +digits5 + "" + digits6 + ""
							   +digits7 + "" + digits8 + ""
							   +digits9 + "" + checksum );
								   
							        
	}
}
