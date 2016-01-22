

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("門票代碼1     VIP     $3000\n"
				+ "門票代碼2     包廂                    $2500\n "
				+ "門票代碼3     前中場              $2000\n "
				+ "門票代碼4     左右場              $1000\n "
				+ "門票代碼5     最高區座位      $500\n ");

		System.out.print("請輸入門票代碼: ");
		int ticket = input.nextInt();
		System.out.print("請輸入數量: ");
		int number = input.nextInt();

		int money = 0;
		int total;
		System.out.print("所購門票總金額為: ");

		if (ticket == 1) {
			money = 3000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 2) {
			money = 2500;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 3) {
			money = 2000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 4) {
			money = 1000;
			 total = money * number;
			System.out.print(total);
		} 
		else if (ticket == 5) {
			money = 500;
			 total = money * number;
			System.out.print(total);
		} 
		else
			System.out.print("輸入錯誤 ! ");

	}
}
