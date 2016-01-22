
import java.util.*;
public class Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Kilogram :");
		double kilogram = input.nextDouble();
	    double pound = 2.20462*kilogram;
		System.out.printf("Pound : %.2f",pound);

	}

}
