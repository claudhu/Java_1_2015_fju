

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		 System.out.println("kilogram:");
	     
		 double kilogram = input.nextDouble();
		
	     double Pound = 2.20462 * kilogram;
	     System.out.println("Pound"+Pound);
	
	}

}
