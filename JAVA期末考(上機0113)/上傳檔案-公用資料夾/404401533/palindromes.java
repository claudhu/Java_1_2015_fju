
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӵ��J,�ˬd�O�_���j��:");
		String i = input.nextLine();
		for(int j = 0 , k =i.length()-1; j <= i.length()/2  ; j++,k--){
			if(i.charAt(j) == i.charAt(k)){
				System.out.println("�ӵ��J�O�j��");
				break;
				}
				else 
					System.out.println("�ӵ��J���O�^��");
				break;
			}
		
	}

}
