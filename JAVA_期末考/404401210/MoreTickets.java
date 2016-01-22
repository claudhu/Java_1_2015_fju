

import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("門票代碼\n"
				+ "1  VIP    價格:3000(單個)\n"
				+ "2   包廂           價格:2500(單個)\n"
				+ "3   前中場        價格:2000(單個)\n"
				+ "4   左右場        價格:1000(單個)\n"
				+ "5   最高區座位  價格:500(單個)\n") ;
		
		System.out.println("請選擇您所要購買的門票代碼!(輸入0可結算金額)");
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
			System.out.println("您所輸入的代碼有誤 !");
	
		System.out.println("請選擇您所要購買的門票張數!");
		int tq = input.nextInt();
		sum += tp*tq ;
		}
		
		System.out.println("您購買門票的總金額為："+sum);

	}

}
