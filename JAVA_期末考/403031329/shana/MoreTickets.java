

import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int[] mylist = new int[5];

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入門票代碼 ");

			int number = input.nextInt();
			switch (number) {
			case 1: {
				System.out.println("請輸入數量: ");
				int number1 = input.nextInt();
				mylist[0] += number1 * 3000;
				System.out.println(mylist[0]);
				break;
			}
			case 2: {
				System.out.println("請輸入數量: ");
				int number2 = input.nextInt();
				mylist[1] += number2 * 2500;
				System.out.println(mylist[1]);
				break;
			}
			case 3: {
				System.out.println("請輸入數量: ");
				int number3 = input.nextInt();
				mylist[2] += number3 * 2000;
				System.out.println(mylist[2]);
				break;
			}
			case 4: {
				System.out.println("請輸入數量: ");
				int number4 = input.nextInt();
				mylist[3] += number4 * 1000;
				System.out.println(mylist[3]);
				break;
			}
			case 5: {
				System.out.println("請輸入數量: ");
				int number5 = input.nextInt();
				mylist[4] += number5 * 500;
				System.out.println(mylist[4]);
				break;
			}

			

			case 0: {
				System.out.println("總額是: " );
					System.out.println(mylist[0]+mylist[1]+mylist[2]+mylist[3]+mylist[4]);

				
			}
			break;
		}

	}
}
}