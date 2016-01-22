import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢視其是否為回文:");
		String s = input.nextLine();
		
		for(int i = 0, j = s.length()-1; i <= s.length()/2; i++, j--){
			if(s.charAt(i) == s.charAt(j))
				System.out.println("該詞彙為回文");
			else
				System.out.println("該詞彙不是回文");
			break;
		}
	}

}
