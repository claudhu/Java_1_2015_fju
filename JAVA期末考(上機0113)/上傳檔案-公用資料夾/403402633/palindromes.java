
import java.util.Scanner;
import java.util.Arrays;
public class palindromes {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入一個單詞，檢測其是否為回文：");
		String b  = input.nextLine();
		System.out.println(word(b));
	}
	public static String word(String a)
	{
		if(a.charAt(0) == a.charAt(a.length() - 1))
			System.out.println("此為回文");
		else
			System.out.println("不是回文");
		return a;
	}

}
