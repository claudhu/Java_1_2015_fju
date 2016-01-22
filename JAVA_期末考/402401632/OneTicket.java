

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pay;
		int count;
		
		System.out.printf("%s\n %s\n %s\n %s\n %s\n", "代碼：1 - VIP",
				"代碼：2 - 包廂", "代碼：3 - 前中場", "代碼：4 - 左右場", "代碼：5 - 最高區座位");
		
		pay = input.nextInt();
		
		switch (pay) {
		case 1:
			pay = 3000;
			break;
		case 2:
			pay = 2500;
			break;
		case 3:
			pay = 2000;
			break;
		case 4:
			pay = 1000;
			break;
		case 5:
			pay = 500;
			break;
		default:
			break;
		}
		count = input.nextInt();
		System.out.println((pay * count) + " 元");
	}

}
