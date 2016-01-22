import java.util.Scanner;


public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter 9 digits : ");
		String digits = input.nextLine();
	    int d10 = (digits.charAt(0)*1 + digits.charAt(1)*2+digits.charAt(2)*3+digits.charAt(3)*4+digits.charAt(4)*5
	    		  +digits.charAt(5)*6+digits.charAt(6)*7+digits.charAt(7)*8+digits.charAt(8)*9)%11;
	    if(d10 == 10)
	    	System.out.println("The checksum is : " + 'X');
	    else
	    	System.out.println("The checksum is : " + d10);
	    System.out.println("The ISBN is : " + digits+d10);
	}
	    }


