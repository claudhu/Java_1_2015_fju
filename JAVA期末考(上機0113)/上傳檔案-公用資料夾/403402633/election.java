
import java.util.Scanner;
public class election {

	public static void main(String[] args) 
	{
		System.out.println("(�@)������ (�G)�����^ (�T)������ (�|)�o��");
		Scanner input = new Scanner(System.in);
		for(int i = 10; i >= 1; i--)
		{
			System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦�" + i + "�i��");
			int v = input.nextInt();
			election(v);
		}
	}
	public static void election(int a)
	{
		switch(a)
		{
		case 1:
			System.out.println("(�@)������");
			break;
		case 2:
			System.out.println("(�G)�����^");
			break;
		case 3:
			System.out.println("(�T)������");
			break;
		case 4:
			System.out.println("(�|)�o��");
			break;
		}
	}

}
