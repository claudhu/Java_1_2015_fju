
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入一種門票代碼:");
		int num1 = input.nextInt();
		System.out.print("請輸入張數:");
		int num2 = input.nextInt();
		
		switch (num1)
		{
		case (1) : System.out.println("總共是" + num2 * 3000 + "元");break;
		case (2) : System.out.println("總共是" + num2 * 2500 + "元");break;
		case (3) : System.out.println("總共是" + num2 * 2000 + "元");break;
		case (4) : System.out.println("總共是" + num2 * 1000 + "元");break;
		case (5) : System.out.println("總共是" + num2 * 500 + "元");break;
		}

	}

}
