
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�п�J�@�ت����N�X:");
		int num1 = input.nextInt();
		System.out.print("�п�J�i��:");
		int num2 = input.nextInt();
		
		switch (num1)
		{
		case (1) : System.out.println("�`�@�O" + num2 * 3000 + "��");break;
		case (2) : System.out.println("�`�@�O" + num2 * 2500 + "��");break;
		case (3) : System.out.println("�`�@�O" + num2 * 2000 + "��");break;
		case (4) : System.out.println("�`�@�O" + num2 * 1000 + "��");break;
		case (5) : System.out.println("�`�@�O" + num2 * 500 + "��");break;
		}

	}

}
