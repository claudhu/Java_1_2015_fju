import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�@�ӳ���A�˴���O�_���^��?");
		String word = input.nextLine();
		for (int i = 1; i <= word.length() / 2; i++) {
			for (int j = i; j >= word.length() / 2; j--) {
				if (word.charAt(i) != word.charAt(j))
					System.out.println("�ӳ�����O�^��");

				else
					System.out.println("�ӳ���O�^��");
			}
		}

	}

}
