import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int ticket1, ticket2, ticket3, ticket4, ticket5;
		
		
		System.out.println("�����N�X  1��:VIP    ���3000��");
		System.out.println("�����N�X  2��:�]�[                 ���2500��");
		System.out.println("�����N�X  3��:�e����             ���2000��");
		System.out.println("�����N�X  4��:���k��             ���1000��");
		System.out.println("�����N�X  5��:�̰��Ϯy��    ���500��");
		
		System.out.println("�п�J�����N�X (1��5��): ");
		int ticketcode = sc.nextInt();
		
		while (ticketcode == 1){
			ticket1 = 3000;
			System.out.println("�A��ܤFVIP! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket1 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			break;
		}
		while(ticketcode == 2){
			ticket2 = 2500;
			System.out.println("�A��ܤF�]�[! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket2 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			break;
			
		}
		while(ticketcode == 3){
			ticket3 = 2000;
			System.out.println("�A��ܤF�e����! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket3 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			break;
		}
		while(ticketcode == 4){
			ticket4 = 1000;
			System.out.println("�A��ܤF���k��! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket4 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			break;
		}
		while(ticketcode == 5){
			ticket5 = 500;
			System.out.println("�A��ܤF�̰��Ϯy�� ! ");
			System.out.println("�п�J�����ƶq: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket5 * ticket ;
			System.out.println("�A�ʶR�F "+ticket + "�i�����A�@�@" + ticketprice + "��");
			break;
		}
		

	

}
}