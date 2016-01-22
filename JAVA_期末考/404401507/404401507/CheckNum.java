import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter 9 digits :");
		int num = input.nextInt();

		int d1 = num / 100000000;
		int d2 = (num / 10000000) % 10;
		int d3 = (num / 1000000) % 10;
		int d4 = (num / 100000) % 10;
		int d5 = (num / 10000) % 10;
		int d6 = (num / 1000) % 10;
		int d7 = (num / 100) % 10;
		int d8 = (num / 10) % 10;
		int d9 = num % 10;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
				+ d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.println("The checksum is: " + "X");
			System.out.println(num + "x");
		}

		else {
			System.out.println("The checksum is: " + d10);
			System.out.print(num);
			System.out.print(d10);

		}

	}
}
