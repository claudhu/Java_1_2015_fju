

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("please  enter 9 digits:");
		String d = input.nextLine();
		
		char d1 = d.charAt(0);
		char d2 = d.charAt(1);
		char d3 = d.charAt(2);
		char d4 = d.charAt(3);
		char d5 = d.charAt(4);
		char d6 = d.charAt(5);
		char d7 = d.charAt(6);
		char d8 = d.charAt(7);
		char d9 = d.charAt(8);
		
		int num = ((int)d1*1 + (int)d2*2 + (int)d3*3 + (int)d4*4 + (int)d5*5 
				 + (int)d6*6 + (int)d7*7 + (int)d8*8 + (int)d9*9) % 11;
		if (num == 10)
			System.out.println("the checksum is:X ");
		   
		else 
		    System.out.println("the checksum is: "+ num);
		
		    System.out.println("the ISBN is: "+ d + num);
		    System.out.println((int)d1*1);
	}

}
