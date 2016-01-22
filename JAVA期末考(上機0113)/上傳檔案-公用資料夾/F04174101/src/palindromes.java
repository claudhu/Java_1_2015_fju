import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Plase enter a string:");
		String chars = input.nextLine();
		char low = chars.charAt(0);
		char high = chars.charAt(chars.length() - 1);

		while (low != high) {
			low++;
			high--;
			if (low == high) {

				System.out.println("The string is palindromes!");
			} else {

				System.out.println("The string is not palindromes!");
			}
		}

	}

}
