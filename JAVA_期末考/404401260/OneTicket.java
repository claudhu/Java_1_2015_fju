
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��J�����N�X�μƶq");
		Scanner input = new Scanner(System.in);
	
		int i = input.nextInt();
	    int j = input.nextInt();
		
	    if (i == 1)
		System.out.print("VIP "+3000*j+"��");
		else if(i == 2)
		System.out.print("�]�[    "+2500*j+"��");	
		else if(i == 3)
		System.out.print("�e����  "+2000*j+"��");
		else if(i == 4)
		System.out.print("���k��   "+1000*j+"��");
		else if(i == 5)
		System.out.print("�̰��Ϯy��  "+500*j+"��");
		
		
	}

}
