import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilogram:");
		double kg = input.nextDouble();
		
		double pound = (int)((kg * 2.20462) * 100) ;
		
		
		
		System.out.print("Pound:" + (pound / 100));
		
		
	}

}
