import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Kilogram: ");
		
		double Kg = input.nextDouble();
		double pound = Kg * 2.204;
		
		System.out.printf("Pound: %.2f" , pound);
	}

}
