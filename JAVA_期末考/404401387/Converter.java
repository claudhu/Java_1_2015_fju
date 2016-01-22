import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Kilogram:");
		double user = input.nextDouble();
		double pound;
		
		pound=2.20462*user;
		System.out.print("Pound:"+pound);

	}

}
