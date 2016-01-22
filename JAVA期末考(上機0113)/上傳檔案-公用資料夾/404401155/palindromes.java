import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入一個單詞，檢測其是否為回文?");
		String word = input.nextLine();
		for (int i = 1; i <= word.length() / 2; i++) {
			for (int j = i; j >= word.length() / 2; j--) {
				if (word.charAt(i) != word.charAt(j))
					System.out.println("該單詞不是回文");

				else
					System.out.println("該單詞是回文");
			}
		}

	}

}
