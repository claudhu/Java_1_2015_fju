

import java.util.Scanner;

public class OneTicket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入一種門票代碼:");
		int x = input.nextInt();
		System.out.print("請輸入門票數量:");
		int n = input.nextInt();
		
		if(x == 1)
			System.out.println("總金額為: "+ 3000*n +" 元");
		else if(x == 2)
			System.out.println("總金額為: "+ 2500*n +" 元");
		else if(x == 3)
			System.out.println("總金額為: "+ 2000*n +" 元");
		else if(x == 4)
			System.out.println("總金額為: "+ 1000*n +" 元");
		else if(x == 5)
			System.out.println("總金額為: "+  500*n +" 元");
		
		
	}

}
