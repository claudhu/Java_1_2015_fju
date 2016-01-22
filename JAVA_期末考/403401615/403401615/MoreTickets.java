import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int ticket1, ticket2, ticket3, ticket4, ticket5;
		
		
		System.out.println("門票代碼  1號:VIP    單價3000元");
		System.out.println("門票代碼  2號:包廂                 單價2500元");
		System.out.println("門票代碼  3號:前中場             單價2000元");
		System.out.println("門票代碼  4號:左右場             單價1000元");
		System.out.println("門票代碼  5號:最高區座位    單價500元");
		
		System.out.println("請輸入門票代碼 (1至5號)(輸入0為停止): ");
		int ticketcode = sc.nextInt();
		
		while (ticketcode != 0){
			ticket1 = 3000;
			ticket2 = 2500;
			ticket3 = 2000;
			ticket4 = 1000;
			ticket5 = 500;
			
			
			if(ticketcode == 1)
			System.out.println("你選擇了VIP! ");
			System.out.println("請輸入門票數量: ");
			int ticket = sc.nextInt();
			int ticketprice = ticket1 * ticket ;
			System.out.println("你購買了 "+ticket + "張門票，一共" + ticketprice + "元");
			
			
		
			    if(ticketcode == 2)
				System.out.println("你選擇了包廂! ");
				System.out.println("請輸入門票數量: ");
				ticket = sc.nextInt();
			    ticketprice = ticket2 * ticket ;
				System.out.println("你購買了 "+ticket + "張門票，一共" + ticketprice + "元");
		
		
			    if(ticketcode == 3)
				System.out.println("你選擇了前中場! ");
				System.out.println("請輸入門票數量: ");
				ticket = sc.nextInt();
				ticketprice = ticket3 * ticket ;
				System.out.println("你購買了 "+ticket + "張門票，一共" + ticketprice + "元");
	
			    if(ticketcode == 4)
				System.out.println("你選擇了左右場! ");
				System.out.println("請輸入門票數量: ");
				 ticket = sc.nextInt();
				 ticketprice = ticket4 * ticket ;
				System.out.println("你購買了 "+ticket + "張門票，一共" + ticketprice + "元");
				


			    if(ticketcode == 5)
				System.out.println("你選擇了最高區座位! ");
				System.out.println("請輸入門票數量: ");
				 ticket = sc.nextInt();
				 ticketprice = ticket5 * ticket ;
				System.out.println("你購買了 "+ticket + "張門票，一共" + ticketprice + "元");
			
				if(ticketcode == 0)
					System.out.println("你選擇了結帳! ");
					System.out.println("你選擇了 "+ ticketcode + " 號門票" + "一共" + ticket + "張" + "總共" + ticketprice + "元" );
					break;
}
		
sc.close();
}
}