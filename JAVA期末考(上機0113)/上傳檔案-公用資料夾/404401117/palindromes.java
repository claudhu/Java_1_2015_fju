
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞,檢查是否為回文:");
		String i = input.nextLine();
		int k = 0 ;
		int j = i.length()-1 ;
		while(true){
		if(i.charAt(k) == i.charAt(j)){
				
			k++;
			j--;
			if(k==j){
			System.out.println("該詞彙是回文");}
				}
				else 
					System.out.println("該詞彙不是回文");break;}
	}
	}

