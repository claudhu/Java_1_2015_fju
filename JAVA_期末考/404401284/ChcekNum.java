

import java.util.Scanner;

public class ChcekNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter 9 digits: ");
		int number = input.nextInt();

		int d1 = (number / 100000000);
		int d2 = (number / 10000000) - (d1 * 10);
		int d3 = (number / 1000000) - (d1 * 100) - (d2 * 10);
		int d4 = (number / 100000) - (d1 * 1000) - (d2 * 100) - (d3 * 10);
		int d5 = (number / 10000) - (d1 * 10000) - (d2 * 1000) - (d3 * 100)
				- (d4 * 10);
		int d6 = ((number % 10000) - (d1 % 1000)) / 1000;
		int d7 = ((number % 1000) - (number % 100)) / 100;
		int d8 = ((number % 100) - (number % 10)) / 10;
		int d9 = number % 10;

		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6
				+ d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (checksum < 10) {
			System.out.println("The checksum is: " + checksum);
			System.out.printf("The ISBN is: %d%d", number, checksum);
		}
		else if (checksum == 10) {
			System.out.println("The checksum is: X");
			System.out.printf("The ISBN is: %9dX", number);
		}
		
	}
}
