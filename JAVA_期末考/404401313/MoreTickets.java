import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int keep=-1;
		int all=0;
		while(keep==-1){
			int Ticket;
			System.out.println("請輸入門票代碼 : ");
			Ticket=input.nextInt();
			switch(Ticket){
				case 1 : System.out.println("您購買的門票名稱為VIP");
				break;
				case 2 : System.out.println("您購買的門票名稱為包廂");
				break;
				case 3 : System.out.println("您購買的門票名稱為前中場");
				break;
				case 4 : System.out.println("您購買的門票名稱為左右場");
				break;
				case 5 : System.out.println("您購買的門票名稱為最高區座位");
				break;
			
			}
			System.out.println("請輸入購買數量 : ");
		
			int count = input.nextInt();
			int M=0;
			
			if(Ticket==1){
				M = 3000*count;
				all=all+M;
			}
			if(Ticket==2){
				M =2500*count;
				all=all+M;
			}
			if(Ticket==3){
				M =2000*count;
				all=all+M;
			}
			if(Ticket==4){
				M =1000*count;
				all=all+M;
			}
			if(Ticket==5){
				M =500*count;
				all=all+M;
			}
			System.out.println("如要具續購買請按"+"-1"+"否請按"+"0" );
			keep = input.nextInt();
			if(keep==0){
				System.out.println("總金額為 : " + all);
			break;
			}
			if(keep==-1){
			continue;
			}
		}
		
		

	}

}
