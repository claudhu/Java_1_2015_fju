
import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] isbn = new int[10];

		System.out.println("Please enter 9 digits¡G ");
		for (int i = 1; i <= 9; i++) {
			isbn[i] = input.nextInt();
		}

		int result = ((isbn[0] * 1 + isbn[1] * 2 + isbn[2] * 3 + isbn[3] * 4
				+ isbn[4] * 5 + isbn[5] * 6 + isbn[6] * 7 + isbn[7] * 8 + isbn[8] * 9) % 11);
		System.out.println("The checksum is ¡G " + result);
		System.out.print("The ISBN is ¡G");
		for (int j = 1; j <= 9; j++) {
			System.out.print(isbn[j]);
		}
		System.out.println(result);
	}

}
