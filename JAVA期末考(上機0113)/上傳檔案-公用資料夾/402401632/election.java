

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 10;
		int pt;
		int people1 = 0, people2 = 0, people3 = 0, people4 = 0;

		System.out
				.printf("%s%s%s%s", "�@�B������\n", "�G�B�����^\n", "�T�B������\n", "�|�B�o��\n");
		for (int i = -8; i <= count; i++) {
			System.out.println("������`�Τj��A�п�J�A���벼�A�ثe�z�٦� " + count + " �i�ﲼ");
			pt = input.nextInt();
			switch (pt) {
			case 1:
				people1 +=1;
				break;
			case 2:
				people2 +=1;			
				break;
			case 3:
				people3 +=1;
				break;
			case 4:
				people4 +=1;
				break;

			default:
				break;
			}
			count -= 1;
		}
		System.out.println("�@�B������" + people1 +"��\n"+ "�G�B�����^" + people2
				+"��\n"+ "�T�B������" + people3 +"��\n"+ "�|�B�o��" + people4+"��");
	}
}
