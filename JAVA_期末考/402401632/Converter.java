

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double kg, pound, result;

		System.out.println("½Ð¿é¤J¤½¤ç¡G");
		kg = input.nextDouble();
		result = (kg * 2.20462);
		System.out.printf("Killogram: %5.0f\n", kg);
		System.out.printf("Pound: %5.2f", result);
	}

}
