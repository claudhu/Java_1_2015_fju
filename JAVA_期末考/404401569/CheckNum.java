
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter 9 digits : ");
		String digit = input.nextLine();
		char d1 = digit.charAt(0);
		char d2 = digit.charAt(1);
		char d3 = digit.charAt(2);
		char d4 = digit.charAt(3);
		char d5 = digit.charAt(4);
		char d6 = digit.charAt(5);
		char d7 = digit.charAt(6);
		char d8 = digit.charAt(7);
		char d9 = digit.charAt(8);
		
		int check = 0 ;
		check = ((d1 - 48) * 1 +(d2 - 48) * 2 +(d3 - 48) * 3 +(d4 - 48) * 4 +(d5 - 48) * 5 +(d6 - 48) * 6 +(d7 - 48) * 7 +(d8 - 48) * 8 +(d9 - 48) * 9) % 11;
		
		if (check == 10)
		{
			System.out.println("The checksum is: X");
			System.out.println("The checksum is: " + digit + "X");
		}
		else
		{
			System.out.println("The checksum is: " + check);
			System.out.println("The ISBN is: " + digit + check) ;	
		}

	}

}
