import java.util.Scanner ;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		System.out.println("Please enter a word to test if it is a palindrome: ") ;
		
		String word = input.next() ;
		char arr[] = word.toCharArray();
		
		int flag = 0 ;
		for(int i=0; i<=arr.length; i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				flag = 1 ;
		}
		
	}
		if(flag == 1)
		    System.out.println("This word is not a palindrome.") ;
		
		else
			System.out.println("This word is a palindrome.") ;
	

	}

}
