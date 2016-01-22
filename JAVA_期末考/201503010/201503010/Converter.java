import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Kilogram : ") ;
		double kilogram = input.nextDouble();
		
		double result = 2.20462 * kilogram ;
		
		System.out.print("Pound : " ) ;
		System.out.printf("%-10.2f", result );
		
		
	}

}
