import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("門票代碼\t名稱\t價格");
		System.out.println("1\tVIP\t3000");
		System.out.println("2\t包廂\t2500");
		System.out.println("3\t前中場\t2000");
		System.out.println("4\t左右場\t1000");
		System.out.println("5\t最高區座位\t500");
		System.out.print("請輸入門票代碼：(1)VIP (2)包廂 (3)前中場 (4)左右場 (5)最高區座位：");
		int a = input.nextInt();
		System.out.print("請輸入數量：");
		int num = input.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("您選擇購買的門票是：" + a);
			System.out.println("總金額為：" + num * 3000);
			break;
		case 2:
			System.out.println("您選擇購買的門票是：" + a);
			System.out.println("總金額為：" + num * 2500);
			break;
		case 3:
			System.out.println("您選擇購買的門票是：" + a);
			System.out.println("總金額為：" + num * 2000);
			break;
		case 4:
			System.out.println("您選擇購買的門票是：" + a);
			System.out.println("總金額為：" + num * 1000);
			break;
		case 5:
			System.out.println("您選擇購買的門票是：" + a);
			System.out.println("總金額為：" + num * 500);
			break;
		}
	}

}
