
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^�� ? ");
		
		String a = input.nextLine();
		
		if (a.charAt(0) == a.charAt(2))
		{
			System.out.println("�O�j��");
		}
		else
			System.out.println("���O�j��");

	}

}
