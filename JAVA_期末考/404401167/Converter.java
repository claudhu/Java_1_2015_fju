
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Kilogram:");
		double k=input.nextDouble();
		double pound=k*2.20462;
		System.out.printf("Pound:"+ " %5.2f ",pound);
		
	}

}
