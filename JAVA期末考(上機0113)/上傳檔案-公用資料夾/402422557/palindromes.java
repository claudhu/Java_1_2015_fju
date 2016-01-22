import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String word=sc.nextLine();
	    //System.out.print(word.charAt(0));
	  
	    for(int i = 0 ; i <= word.length()/2 ; i++)
	    	if(word.charAt(i)!=word.charAt(word.length()-1-i)){
	    		System.out.print("this is not palindromes");
	    		break;
	    	}

	

	}
	}
	
