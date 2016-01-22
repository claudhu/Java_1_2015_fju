
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0 ;
		int all = 0 ;
		while (true){
			System.out.print("請輸入一種門票代碼:");
			int num1 = input.nextInt();
			if (num1 == 0)
			{
				System.out.println("總共為 :" + all + "元");
				break ;
			}
			System.out.print("請輸入張數:");
			int num2 = input.nextInt();
			
			switch (num1)
			{
			case (1) : total = num2 * 3000;break;
			case (2) : total = num2 * 2500;break;
			case (3) : total = num2 * 2000;break;
			case (4) : total = num2 * 1000;break;
			case (5) : total = num2 * 500;break;
			}
			all += total;
			System.out.println("目前:"+all+"元");
		}
			
		

	}

}
