import java.util.Scanner;
public class Converter {

	public static void main(String args[]){
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("kilogram: ");
		 double kilogram = input.nextDouble();
		 double pound = kilogram*2.20462; 
		 
		 System.out.printf("pound: %2.2f",pound);
		 
		
		
	}
}
