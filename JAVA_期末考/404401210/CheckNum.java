

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ; 
		
		System.out.println("Please enter 9 digits :");
		String num = input.nextLine() ;
		
		char d1 = num.charAt(0);
		char d2 = num.charAt(1);
		char d3 = num.charAt(2);
		char d4 = num.charAt(3);
		char d5 = num.charAt(4);
		char d6 = num.charAt(5);
		char d7 = num.charAt(6);
		char d8 = num.charAt(7);
		char d9 = num.charAt(8);
		int d10 = ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9)) % 11 ;
		
		System.out.println("The check number is : "+d10+"\nThe ISBN is : "+num+d10);
		


	}

}
