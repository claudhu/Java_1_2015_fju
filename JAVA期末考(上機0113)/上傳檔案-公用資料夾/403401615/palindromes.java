
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int input = 0;
		
		System.out.println("�п�J����@�Ӧr���A�˴��O���O�j��? : ");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		if(word3 == word1 && word1 == word3)
			System.out.println("Yes , �O�j��");
		else
			System.out.println("no , ���O�j��");
			
		

	}

}
