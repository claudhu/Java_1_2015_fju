
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilogram¡G");
		double kilogram = input.nextDouble();
		
		
		double pound = kilogram * 2.20462;
		
		System.out.printf("pound¡G%1.2f",pound);
		input.close();

	}

}
