import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilogram : ");
		double kg = input.nextDouble();
				
		double pound = kg * 2.20462;
		System.out.printf("%s %1.2f" , "Pound :" , pound);

		

	}

}
