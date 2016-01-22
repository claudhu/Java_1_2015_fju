import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Kilogram: ");
		int kilogram = sc.nextInt();
		double pound = kilogram * 2.20462 ; 
		System.out.printf("Pound : %.2f  ", pound);

	}

}
