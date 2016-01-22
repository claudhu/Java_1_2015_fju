

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("請輸入您的重量(磅)") ;
		double kw = input.nextDouble() ;
		double pw = kw * (2.20462) ;
		
		System.out.printf("Kilogram：  %6.2f\n" , kw) ;
		System.out.printf("Pound：  %6.2f\n" , pw) ;
		

	}

}
