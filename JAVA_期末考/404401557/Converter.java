

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J���q");
        double a = input.nextInt();
        double b = a*2.20462;
        System.out.println("Kilogram:"+a);
        System.out.print("Pound:");
        System.out.printf("%5.2f",b);
	}

}
