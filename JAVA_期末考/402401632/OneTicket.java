

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pay;
		int count;
		
		System.out.printf("%s\n %s\n %s\n %s\n %s\n", "�N�X�G1 - VIP",
				"�N�X�G2 - �]�[", "�N�X�G3 - �e����", "�N�X�G4 - ���k��", "�N�X�G5 - �̰��Ϯy��");
		
		pay = input.nextInt();
		
		switch (pay) {
		case 1:
			pay = 3000;
			break;
		case 2:
			pay = 2500;
			break;
		case 3:
			pay = 2000;
			break;
		case 4:
			pay = 1000;
			break;
		case 5:
			pay = 500;
			break;
		default:
			break;
		}
		count = input.nextInt();
		System.out.println((pay * count) + " ��");
	}

}
