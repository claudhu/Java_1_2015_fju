
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("請輸入一個單詞，檢測其是否為回文");
    String a=input.nextLine();
    boolean z;
    for(int i=0;i<a.length();i++){
    	if(a.charAt(i)==a.charAt(a.length()-i-1)){
    		z=true;
    	}	
    	else{
    		z=false;
    	}
    }
    if(z=true)
    	System.out.print("該詞彙為回文");
    if(z=false)
    	System.out.print("不是回文");
    }
	}