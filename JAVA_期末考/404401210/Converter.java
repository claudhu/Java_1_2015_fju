

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("�п�J�z�����q(�S)") ;
		double kw = input.nextDouble() ;
		double pw = kw * (2.20462) ;
		
		System.out.printf("Kilogram�G  %6.2f\n" , kw) ;
		System.out.printf("Pound�G  %6.2f\n" , pw) ;
		

	}

}
