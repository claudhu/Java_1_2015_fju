import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^�� ? ");
		String w = input.nextLine();
		boolean a = false ;
		int j = w.length();
		for (int i = 0; i < w.length(); i++ ) {
			j--;
			if (w.charAt(i) == w.charAt(j)) {
				a = true ;
			} else {
				System.out.println("�ӵ��J�����^��");
				break;
			}
		}
		if(a){
			System.out.println("�ӵ��J���^��");
		}
		input.close();
	}

}
