import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pleases enter weight: ");
		double Pound = in.nextDouble();
		double kg ;
		kg = 2.20462 * Pound;
		System.out.printf("\nKilogram:%6.0f",Pound );
		System.out.printf("\nPound: %6.2f",kg );

	}

}
