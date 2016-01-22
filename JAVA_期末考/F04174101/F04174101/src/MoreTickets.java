import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The number 1 for VIP and number 2 for baoxiang and number3 for qianzhongchang and number 4 for zuoyouchang  and number 5 for zuigaoquzuowei: ");
		System.out.println("Pleases choice  your Ticket: ");
		int typ=in.nextInt();
		int num;
		int total=0;
		//int t1,t2,t3,t4,t5;
		while (typ!=0)
		{
			if (typ == 1) {
				System.out.println("Plase enter your number:" );
				num=in.nextInt();
				 int t1=3000*num;
			} else if (typ == 2) {
				System.out.println("Plase enter your number:" );
				num=in.nextInt();
				int t2=2500*num;
			} else if (typ == 3) {
				System.out.println("Plase enter your number:" );
				num=in.nextInt();
				int t3=2000*num;
			} else if (typ == 4) {
				System.out.println("Plase enter your number:" );
				num=in.nextInt();
				int t4=1000*num;
			} else if (typ == 5) {
				System.out.println("Plase enter your number:" );
				num=in.nextInt();
				int t5=500*num;
			} else {
				System.out.println("Plase enter your Ticket number for 1~5 again!");
			}
			
		}
		System.out.println("Total money is :"+total);
	}

}
