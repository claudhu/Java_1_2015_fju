import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = 3000;
		int num2 = 2500;
		int num3 = 2000;
		int num4 = 1000;
		int num5 = 500;
		System.out.print("�п�J�������N�X:");
		int n = input.nextInt();
		System.out.print("�п�J�������ƶq:");
		int i = input.nextInt();
		
		if(n == 1)
			System.out.println("�����`���B�O " + num1*i);
		else if(n == 2)
			System.out.println("�����`���B�O " + num2*i);
		else if(n == 3)
			System.out.println("�����`���B�O " + num3*i);
		else if(n == 4)
			System.out.println("�����`���B�O " + num4*i);
		else if(n == 5)
			System.out.println("�����`���B�O " + num5*i);
	}

}
