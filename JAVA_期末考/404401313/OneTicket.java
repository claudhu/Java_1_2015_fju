import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入門票代碼 : ");
		int Ticket=input.nextInt();
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
		if(Ticket==1){
			System.out.println("總金額為 : "+ 3000*count);
		}
		if(Ticket==2){
			System.out.println("總金額為 : "+ 2500*count);
		}
		if(Ticket==3){
			System.out.println("總金額為 : "+ 2000*count);
		}
		if(Ticket==4){
			System.out.println("總金額為 : "+ 1000*count);
		}
		if(Ticket==5){
			System.out.println("總金額為 : "+ 500*count);
		}

	}

}
