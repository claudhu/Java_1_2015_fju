import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˵���O�_���^��:");
		String s = input.nextLine();
		
		for(int i = 0, j = s.length()-1; i <= s.length()/2; i++, j--){
			if(s.charAt(i) == s.charAt(j))
				System.out.println("�ӵ��J���^��");
			else
				System.out.println("�ӵ��J���O�^��");
			break;
		}
	}

}
