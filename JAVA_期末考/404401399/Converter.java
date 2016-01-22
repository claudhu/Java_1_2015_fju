
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight(kg)");
		double weight = input.nextDouble();
		
		double pound = weight*2.20462;
		
		System.out.println("Kilogram : " + weight);
		System.out.printf("Pound : %5.2f" ,pound);

	}

}
