

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("�����N�X1     VIP     $3000\n"
				+ "�����N�X2     �]�[                    $2500\n "
				+ "�����N�X3     �e����              $2000\n "
				+ "�����N�X4     ���k��              $1000\n "
				+ "�����N�X5     �̰��Ϯy��      $500\n ");

		System.out.print("�п�J�����N�X: ");
		int ticket = input.nextInt();
		System.out.print("�п�J�ƶq: ");
		int number = input.nextInt();

		int money = 0;
		int total;
		System.out.print("���ʪ����`���B��: ");

		if (ticket == 1) {
			money = 3000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 2) {
			money = 2500;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 3) {
			money = 2000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 4) {
			money = 1000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 5) {
			money = 500;
			 total = money * number;
			System.out.print(total);
		} 
		else
			System.out.print("��J���~ ! ");

	}
}
