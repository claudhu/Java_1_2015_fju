import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        System.out.println("Kilogram: ");
        double kg = input.nextInt();
        
        double pound = kg * 2.20462;
        
        System.out.printf("Pound: %4.2f " , pound);
	}

}
