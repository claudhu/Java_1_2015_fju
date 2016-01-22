
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		double k,m;
		System.out.print("Kilogram: ");
		k=input.nextDouble();
		m= k * 2.204;
		System.out.printf("Pound: %.2f",m);
	}

}
