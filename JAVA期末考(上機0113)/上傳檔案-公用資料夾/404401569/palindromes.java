
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢測其是否為回文 ? ");
		
		String a = input.nextLine();
		
		if (a.charAt(0) == a.charAt(2))
		{
			System.out.println("是迴文");
		}
		else
			System.out.println("不是迴文");

	}

}
