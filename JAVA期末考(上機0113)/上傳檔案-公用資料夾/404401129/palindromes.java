import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢測其是否為回文 ? ");
		String w = input.nextLine();
		boolean a = false ;
		int j = w.length();
		for (int i = 0; i < w.length(); i++ ) {
			j--;
			if (w.charAt(i) == w.charAt(j)) {
				a = true ;
			} else {
				System.out.println("該詞彙不為回文");
				break;
			}
		}
		if(a){
			System.out.println("該詞彙為回文");
		}
		input.close();
	}

}
