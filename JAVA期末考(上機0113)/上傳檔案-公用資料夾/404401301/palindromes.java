import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢測其是否為回文 ? ");
		String guess = input.nextLine();
		
		char guess1 = guess.charAt(0);
		char guess2 = guess.charAt(1);
		char guess3 = guess.charAt(2);
		
		if(guess1==guess3)
			System.out.println("該詞彙為回文");
		
		
	}

}
