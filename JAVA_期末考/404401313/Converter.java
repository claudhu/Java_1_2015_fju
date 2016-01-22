import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Kilogram : ");
		double K = input.nextDouble();
		final double i = 0.4535929094356397;
		double P = 0 ;
		P = K/i;
		
		System.out.print("Pound : ");
		System.out.printf("%10.2f",P);
		

	}

}
