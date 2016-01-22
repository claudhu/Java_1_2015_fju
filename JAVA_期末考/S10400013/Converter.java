import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		
		double a = 0 , b = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert Kilogram:");
		
		a = input.nextDouble();
		
		b = a * 2.20462;
		
		System.out.printf("Kilogram : %.0f\nPound : %.2f",a,b);
	}

}
