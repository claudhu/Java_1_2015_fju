import java.util.Scanner;


public class Converter {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("請輸入你的體重");
		double kg = input.nextDouble();
		double pound = 2.20462 * kg;
		System.out.println("pound:"+pound);

	}


}
