import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight : ");
		int w  = input.nextInt();
		double p = w * 2.20462 ;
		System.out.println("Kilogram : " + w);
		System.out.printf("Pound : %.2f" , p);
		input.close();
	}

}
