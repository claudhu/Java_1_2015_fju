import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("門票代碼\t名稱\t價格");
		System.out.println("1\tVIP\t3000");
		System.out.println("2\t包廂\t2500");
		System.out.println("3\t前中場\t2000");
		System.out.println("4\t左右場\t1000");
		System.out.println("5\t最高區座位\t500");
		for(int i = 0; i < 5; i++)
		{
			System.out.print("請輸入多種門票代碼，直到您輸入0結束：");
		    int user = input.nextInt();
			if(user == 0)
			{
				System.out.println("請輸入數量：");
				int num = input.nextInt();
				System.out.println("總金額為：" + (user * num));
				break;
			}
			else
			{
				System.out.println("請輸入數量：");
				int num = input.nextInt();
				System.out.println("總金額為：" + (user * num));
				break;
			}
		}
	}
}
