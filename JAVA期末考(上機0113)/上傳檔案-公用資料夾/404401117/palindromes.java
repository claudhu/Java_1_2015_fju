
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ��,�ˬd�O�_���^��:");
		String i = input.nextLine();
		int k = 0 ;
		int j = i.length()-1 ;
		while(true){
		if(i.charAt(k) == i.charAt(j)){
				
			k++;
			j--;
			if(k==j){
			System.out.println("�ӵ��J�O�^��");}
				}
				else 
					System.out.println("�ӵ��J���O�^��");break;}
	}
	}

