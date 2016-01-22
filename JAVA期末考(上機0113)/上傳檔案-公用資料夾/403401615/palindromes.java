
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int input = 0;
		
		System.out.println("請輸入單詞一個字母，檢測是不是迴文? : ");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		if(word3 == word1 && word1 == word3)
			System.out.println("Yes , 是迴文");
		else
			System.out.println("no , 不是迴文");
			
		

	}

}
