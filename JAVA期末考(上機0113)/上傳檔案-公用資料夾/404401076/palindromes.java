
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("請輸入一個字串");
		String s=input.nextLine();
		int low=0,high=s.length()-1;
		while(low<high)
		{
			boolean isPal=true;
			if(s.charAt(low)==s.charAt(high))
				{low++;high--;}
			else
				isPal=false;
			if(isPal)
				{System.out.println("該詞彙為迴文");break;}
			else
				{System.out.println("該詞彙不是迴文");break;}
		}
	
	}

}
