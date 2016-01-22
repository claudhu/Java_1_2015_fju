import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("請輸入一個單字，檢測其是否為回文? ");
        String voc = input.next();
        
        boolean yes = true;
        for ( int i = 0 ; i < voc.length() ; i ++){
        	if ( voc.charAt(i) == voc.charAt( voc.length()- 1 - i )){
        		yes = true;
        	}
        	else 
        		yes = false;
        }
        if ( yes )
        	System.out.println("該詞彙為回文");	
	    else
	    	System.out.println("該詞彙不是回文");
	}

}
