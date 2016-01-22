import java.util.Scanner;


public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("請輸入一個單詞，檢測其是否為回文 ？");
    String letter = input.nextLine();
    for(int i = 0 ; i < letter.length();i++){
    	char l1 = letter.charAt(i);
    	char l2 = letter.charAt(letter.length()-i-1);
    	if(l1 == l2){
    	System.out.println("該詞彙為回文");
    	break;
    	}
    	else 
    		System.out.println("該詞彙不是回文");
    	    break;
    	}
        
    }
	}


