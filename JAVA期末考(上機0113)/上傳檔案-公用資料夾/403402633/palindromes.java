
import java.util.Scanner;
import java.util.Arrays;
public class palindromes {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�@�ӳ���A�˴���O�_���^��G");
		String b  = input.nextLine();
		System.out.println(word(b));
	}
	public static String word(String a)
	{
		if(a.charAt(0) == a.charAt(a.length() - 1))
			System.out.println("�����^��");
		else
			System.out.println("���O�^��");
		return a;
	}

}
