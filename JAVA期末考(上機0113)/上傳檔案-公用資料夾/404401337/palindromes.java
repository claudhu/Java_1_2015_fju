

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞，檢測其是否為回文?");
		String a = input.nextLine();
		
		int low = 0;
		int high = a.length()-1;
		
		for(int i = 0;i<a.length();i++){
			if(a.charAt(low) == a.charAt(high)){
				low--;
			    high++;
			}
			else{
				System.out.print("該單詞不為回文");
				break;
			}
				
			System.out.println("該單詞為回文");
			
		}
		input.close();

	}

	
	}


