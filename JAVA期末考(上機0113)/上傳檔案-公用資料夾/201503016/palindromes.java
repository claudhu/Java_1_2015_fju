
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢測其是否為回文？ ");
		String word = input.next();
		char array[] = word.toCharArray();
		int k=0;
				for(int i=0; i<array.length;i++)
				{
					if(array[i]!=array.length-1-i)
					{
				     k=1;
					}
				}
		if (k == 1)
			System.out.println("是迴文 ");
			
		else
		    System.out.println("不是迴文 ");
			

	}

}
