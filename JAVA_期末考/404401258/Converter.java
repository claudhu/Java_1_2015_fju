

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Kilogram : ");
		
		double kg = input.nextDouble();
		
		double pound = ((int)((kg*2.20462)*100))/100.0;
		
		System.out.printf("Pound : "+pound);

	}

}
