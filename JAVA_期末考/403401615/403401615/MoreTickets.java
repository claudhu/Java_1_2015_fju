import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int ticket1, ticket2, ticket3, ticket4, ticket5;
		
		
		System.out.println("�����N�X  1��:VIP    ���3000��");
		System.out.println("�����N�X  2��:�]�[                 ���2500��");
		System.out.println("�����N�X  3��:�e����             ���2000��");
		System.out.println("�����N�X  4��:���k��             ���1000��");
		System.out.println("�����N�X  5��:�̰��Ϯy��    ���500��");
		
		System.out.println("�п�J�����N�X (1��5��)(��J0������): ");
		int ticketcode = sc.nextInt();
		
		while (ticketcode != 0){
			ticket1 = 3000;
			ticket2 = 2500;
			ticket3 = 2000;
			ticket4 = 1000;
			ticket5 = 500;
			
			
			if(ticketcode == 1)
			System.out.println("�A��ܤFVIP! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket1 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			
			
		
			    if(ticketcode == 2)
				System.out.println("�A��ܤF�]�[! ");
				System.out.println("�п�J�����ƶq: ");
				ticket = sc.nextInt();
			    ticketprice = ticket2 * ticket ;
				System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
		
		
			    if(ticketcode == 3)
				System.out.println("�A��ܤF�e����! ");
				System.out.println("�п�J�����ƶq: ");
				ticket = sc.nextInt();
				ticketprice = ticket3 * ticket ;
				System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
	
			    if(ticketcode == 4)
				System.out.println("�A��ܤF���k��! ");
				System.out.println("�п�J�����ƶq: ");
				 ticket = sc.nextInt();
				 ticketprice = ticket4 * ticket ;
				System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
				


			    if(ticketcode == 5)
				System.out.println("�A��ܤF�̰��Ϯy��! ");
				System.out.println("�п�J�����ƶq: ");
				 ticket = sc.nextInt();
				 ticketprice = ticket5 * ticket ;
				System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			
				if(ticketcode == 0)
					System.out.println("�A��ܤF���b! ");
					System.out.println("�A��ܤF "+ ticketcode + " ������" + "�@�@" + ticket + "�i" + "�`�@" + ticketprice + "��" );
					break;
}
		
sc.close();
}
}