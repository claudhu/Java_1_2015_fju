import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�N�X : ");
		int a = input.nextInt();
		System.out.print("�п�J�ƶq : ");
		int b = input.nextInt();
		int sum = 0;
		for(a = 1 ; a <= 5; a++){
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
		else if(a == 0 || b ==0)
		break;
		}
	System.out.print("�ʲ����`���B�O : " + sum);
	}

}
