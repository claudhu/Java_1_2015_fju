import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("�п�J�@�ӳ��:");
		String word = input.next();
		
			
	
		int lon = word.length() -1;
		int count = 0;
		
		for(int i = 0 ; i < (word.length()/2) ; i++){
	
			if(word.charAt(i) == word.charAt(lon-i)  ){
				count++;
				
			}
			
			else{
				System.out.println("�ӵ��J�D�^��C");
				break;
			}
			
			if(count == (word.length()/2)){
				System.out.println("�ӵ��J���^��C");
			}
			
		}
		
		
	}

}
