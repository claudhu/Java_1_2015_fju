
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double p , k;
		System.out.print("Kilogram : ");
		k = input.nextDouble();
		
		p = k * 2.02462;
		
		System.out.print("Pound : " + p);
		
		
		

	}

}
