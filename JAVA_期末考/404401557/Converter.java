

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入重量");
        double a = input.nextInt();
        double b = a*2.20462;
        System.out.println("Kilogram:"+a);
        System.out.print("Pound:");
        System.out.printf("%5.2f",b);
	}

}
