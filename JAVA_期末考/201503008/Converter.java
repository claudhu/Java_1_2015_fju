
import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pound = input.nextDouble();
		double kg = pound*2.20462;
		System.out.printf("Kilogram:%.0f\n",pound);
		System.out.printf("Pound:%.2f",kg);
		
		

	}

}
