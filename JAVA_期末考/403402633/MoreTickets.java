import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�����N�X\t�W��\t����");
		System.out.println("1\tVIP\t3000");
		System.out.println("2\t�]�[\t2500");
		System.out.println("3\t�e����\t2000");
		System.out.println("4\t���k��\t1000");
		System.out.println("5\t�̰��Ϯy��\t500");
		for(int i = 0; i < 5; i++)
		{
			System.out.print("�п�J�h�ت����N�X�A����z��J0�����G");
		    int user = input.nextInt();
			if(user == 0)
			{
				System.out.println("�п�J�ƶq�G");
				int num = input.nextInt();
				System.out.println("�`���B���G" + (user * num));
				break;
			}
			else
			{
				System.out.println("�п�J�ƶq�G");
				int num = input.nextInt();
				System.out.println("�`���B���G" + (user * num));
				break;
			}
		}
	}
}
