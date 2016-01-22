
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Kilogram :");
		double Kilogram = input.nextDouble();
		double Pound =  Kilogram* 2.20462 ;
		System.out.println("Kilogram");
		System.out.println(Kilogram);
		System.out.println("Pound");
		System.out.printf("%3f" , Pound);
	}

}
