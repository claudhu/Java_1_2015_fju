import java.util.Scanner;
public class OneTicket  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�N�X : ");
		int a = input.nextInt();
		System.out.print("�п�J�ƶq : ");
		int b = input.nextInt();
		int sum = 0;
		if(a == 1)
			sum = 3000 * b;
		else if(a == 2)
			sum = 2500 * b;
		else if(a == 3)
			sum = 2000 * b;
		else if(a == 4)
			sum = 1000 * b;
		else if(a == 5)
			sum = 500 * b;
	System.out.print("�ʲ����`���B�O : " + sum);
		}
	

}
