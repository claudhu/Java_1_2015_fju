

import java.util.Scanner;

public class OneSticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入門票代碼");
		Scanner input = new Scanner(System.in);
		int ticket = input.nextInt();
		switch (ticket) {
		case 1 :{
			System.out.println("請輸入數量");
			int d = input.nextInt();
			int e = d*3000;
			System.out.println(e);
			break;
		}
		case 2 :{
			System.out.println("請輸入數量");
			int d = input.nextInt();
			int e = d*2500;System.out.println(e);break;
		
		}
		case 3 :{
			System.out.println("請輸入數量");
			int d = input.nextInt();
			int e = d*2000;
			System.out.println(e);
			break;
	}
		case 4 :{
			System.out.println("請輸入數量");
			int d = input.nextInt();
			int e = d*1000;System.out.println(e);break;
	}
		case 5 :{
			System.out.println("請輸入數量");
			int d = input.nextInt();
			int e = d*500;System.out.println(e);
	}

}}}
