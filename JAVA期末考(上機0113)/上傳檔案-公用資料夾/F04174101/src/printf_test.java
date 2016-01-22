import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Plases enter 8 number:");

		for (int i = 1; i <= 8; i++) {
			int num = input.nextInt();
			if (i % 4 == 0) {
				System.out.printf("%10d\n", num);
			} else {
				System.out.printf("%10d\t", num);
			}
		}
	}

}
