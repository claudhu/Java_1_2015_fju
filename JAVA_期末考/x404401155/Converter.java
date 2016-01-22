

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("kilogram: ");
		double kg = input.nextDouble();
		double pound = 2.20462 * kg ;
		System.out.printf("pound: %2.2f",pound);
		

	}

}
