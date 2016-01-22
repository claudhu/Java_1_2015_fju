
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個詞彙,檢查是否為迴文:");
		String i = input.nextLine();
		for(int j = 0 , k =i.length()-1; j <= i.length()/2  ; j++,k--){
			if(i.charAt(j) == i.charAt(k)){
				System.out.println("該詞彙是迴文");
				break;
				}
				else 
					System.out.println("該詞彙不是回文");
				break;
			}
		
	}

}
