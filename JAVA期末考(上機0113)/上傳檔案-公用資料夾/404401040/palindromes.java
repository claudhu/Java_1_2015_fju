import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    String a = input.next();
    String b = input.next(a);
    System.out.println("請輸入一個單詞，檢測其是否為回文? "+a);
    
    for(int i = 0; i <= 26; i++){
    	if(a == b){
    		System.out.print("該詞為回文");
    	}
    	else
    		System.out.print("這不是回文");
    }
    
    
    
	}

}
