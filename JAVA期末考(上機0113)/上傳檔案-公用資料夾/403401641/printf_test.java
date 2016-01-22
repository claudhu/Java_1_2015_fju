

import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入八個整數");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int num7 = input.nextInt();
		int num8 = input.nextInt();

		int count = 0;
		if (count % 4 == 0) {
			count++;

			System.out.printf("%8d%8d%8d%8d\n%8d%8d%8d%8d", num1, num2, num3,
					num4, num5, num6, num7, num8);
		}

	}

}
