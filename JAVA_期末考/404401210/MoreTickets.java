

import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("�����N�X\n"
				+ "1  VIP    ����:3000(���)\n"
				+ "2   �]�[           ����:2500(���)\n"
				+ "3   �e����        ����:2000(���)\n"
				+ "4   ���k��        ����:1000(���)\n"
				+ "5   �̰��Ϯy��  ����:500(���)\n") ;
		
		System.out.println("�п�ܱz�ҭn�ʶR�������N�X!(��J0�i������B)");
		int tk = input.nextInt();
		int sum = 0 ;
		while(tk != 0){
		  int tp = 0 ;
		  if(tk == 1)
			  tp = 3000;
		  else if(tk == 2)
			  tp = 2500;
		  else if(tk == 3)
			  tp = 2000;
		  else if(tk == 4)
			  tp = 1000;
		  else if(tk == 5)
			  tp = 500;
		  else
			System.out.println("�z�ҿ�J���N�X���~ !");
	
		System.out.println("�п�ܱz�ҭn�ʶR�������i��!");
		int tq = input.nextInt();
		sum += tp*tq ;
		}
		
		System.out.println("�z�ʶR�������`���B���G"+sum);

	}

}
