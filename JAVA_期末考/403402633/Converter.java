import java.util.Scanner;
public class Converter {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Kilogram¡G");
		double kilogram = input.nextDouble();
		double pound = 2.20462;
		double result = kilogram * pound;
		System.out.printf("Pound¡G%.2f",result);
	}

}
