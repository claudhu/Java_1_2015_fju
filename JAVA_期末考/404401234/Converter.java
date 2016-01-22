
import java.text.NumberFormat;
import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Kilogram:");
		double kg =  input.nextDouble();
		double a = 2.20462;
		double pound =kg*a;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		
		System.out.printf("Pound:"+nf.format(pound));
		
	
	}

}
