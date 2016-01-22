
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilogram : ");
		double kg = input.nextDouble();
		
		double pound ;
		pound = kg * 2.20462 ;
		
		System.out.printf("Pound : %4.2f" , pound) ;

	}

}
