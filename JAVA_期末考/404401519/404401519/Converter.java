
import java.util.Scanner;
public class Converter {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your weight in kilogram");
	double kilogram=input.nextDouble();
	double pound = kilogram * 2.0462 ;
	System.out.println("Kilogram : "+kilogram);
	System.out.println("Pound : "+pound);
	}

}
