import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Kilogram : ");
		double num = scn.nextDouble();
		num = 2.20462*num;
		
		System.out.printf("Pound : " + "%.2f" , num);
		
	}

}
