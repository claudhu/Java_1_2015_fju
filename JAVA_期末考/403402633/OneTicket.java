import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�����N�X\t�W��\t����");
		System.out.println("1\tVIP\t3000");
		System.out.println("2\t�]�[\t2500");
		System.out.println("3\t�e����\t2000");
		System.out.println("4\t���k��\t1000");
		System.out.println("5\t�̰��Ϯy��\t500");
		System.out.print("�п�J�����N�X�G(1)VIP (2)�]�[ (3)�e���� (4)���k�� (5)�̰��Ϯy��G");
		int a = input.nextInt();
		System.out.print("�п�J�ƶq�G");
		int num = input.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("�z����ʶR�������O�G" + a);
			System.out.println("�`���B���G" + num * 3000);
			break;
		case 2:
			System.out.println("�z����ʶR�������O�G" + a);
			System.out.println("�`���B���G" + num * 2500);
			break;
		case 3:
			System.out.println("�z����ʶR�������O�G" + a);
			System.out.println("�`���B���G" + num * 2000);
			break;
		case 4:
			System.out.println("�z����ʶR�������O�G" + a);
			System.out.println("�`���B���G" + num * 1000);
			break;
		case 5:
			System.out.println("�z����ʶR�������O�G" + a);
			System.out.println("�`���B���G" + num * 500);
			break;
		}
	}

}
