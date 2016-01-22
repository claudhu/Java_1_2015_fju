import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("請輸入一個單詞，檢測其是否為回文？");
String huiwen = input.nextLine();
int length = huiwen.length();
if(isPalindroms(length , huiwen)){
	System.out.println("該詞彙為回文");
}
else{
	System.out.println("該詞彙bu為回文");
}
	
	}
	public static boolean isPalindroms(int length , String hui){
		for(int i = 0 ; i < (int)length / 2 ; i++){
			if(hui.charAt(i) != hui.charAt(length - i - 1)){
				return false ;
			}
		}
		return true ;
			
	}

}
