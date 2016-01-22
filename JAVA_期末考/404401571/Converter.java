
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double kilogram  = 2.20462;
		
		System.out.println("Please enter your weight in kilogram ");
		double weight = input.nextDouble();
		double pound = weight*kilogram;
		
		System.out.println("Kilogram:"+weight);
		System.out.printf("Pound:%-5.2f",pound);
		
		
		

	}

}
