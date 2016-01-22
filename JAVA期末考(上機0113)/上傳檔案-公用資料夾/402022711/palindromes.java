import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入一個單詞:");
		String word = input.next();
		
			
	
		int lon = word.length() -1;
		int count = 0;
		
		for(int i = 0 ; i < (word.length()/2) ; i++){
	
			if(word.charAt(i) == word.charAt(lon-i)  ){
				count++;
				
			}
			
			else{
				System.out.println("該詞彙非回文。");
				break;
			}
			
			if(count == (word.length()/2)){
				System.out.println("該詞彙為回文。");
			}
			
		}
		
		
	}

}
