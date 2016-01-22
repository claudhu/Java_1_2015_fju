
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Kilogram:");
		int k=input.nextInt();
		double p=k*2.20462;
		System.out.printf("Pound:%2.2f",p);

	}

}
