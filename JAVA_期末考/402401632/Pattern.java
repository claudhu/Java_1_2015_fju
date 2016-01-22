
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ptn = input.nextInt();
		System.out.println("Please enter a numbers¡G " + ptn);

		System.out.println("Your square looks like¡G ");
		for (int i = 1; i <= ptn; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int l = ptn; l > i; l--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
