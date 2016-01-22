
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Kilogram : ");
		double kg =input.nextDouble();
		System.out.println();
		double pound = kg*2.20462;
		System.out.print("Pound : ");
		System.out.printf("%-2d",pound);
	}

}
