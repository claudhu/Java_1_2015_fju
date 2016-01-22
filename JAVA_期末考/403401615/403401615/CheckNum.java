import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Please enter 9 digits(first one) : ");
		int digits1 = sc.nextInt();
		System.out.println("Please enter 9 digits(second one) : ");
		int digits2 = sc.nextInt();
		System.out.println("Please enter 9 digits(third one) : ");
		int digits3 = sc.nextInt();
		System.out.println("Please enter 9 digits(forth one) : ");
		int digits4 = sc.nextInt();
		System.out.println("Please enter 9 digits(fifth one) : ");
		int digits5 = sc.nextInt();
		System.out.println("Please enter 9 digits(sixth one) : ");
		int digits6 = sc.nextInt();
		System.out.println("Please enter 9 digits(seventh one) : ");
		int digits7 = sc.nextInt();
		System.out.println("Please enter 9 digits(eighth one) : ");
		int digits8 = sc.nextInt();
		System.out.println("Please enter 9 digits(ninth one) : ");
		int digits9 = sc.nextInt();
		
		System.out.println("The 9 digits are : " + digits1 + digits2 + digits3 + digits4 
				+ digits5 + digits6 + digits7 + digits8 + digits9);
		
		
		
		int checksum = ((digits1 *1) + (digits2 *2) + (digits3 *3) + (digits4 *4) + (digits5 *5) + (digits6 *6) + (digits7 *7) 
				+ (digits8 *8) + (digits9 *9)) % 11 ;
		if (checksum == 10){
			System.out.println("The checksum is : X ");
		    System.out.println("The ISBN is : " + digits1 + digits2 + digits3 + digits4 
					+ digits5 + digits6 + digits7 + digits8 + digits9 + "X");
		}
		else {
			System.out.println("The checksum is : "+ checksum);
			System.out.println("The ISBN is : "+ digits1 + digits2 + digits3 + digits4 
					+ digits5 + digits6 + digits7 + digits8 + digits9 + checksum);
		
		}
		
		

	

}
}