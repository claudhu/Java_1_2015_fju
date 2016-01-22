
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("輸入門票代碼及數量");
		Scanner input = new Scanner(System.in);
	
		int i = input.nextInt();
	    int j = input.nextInt();
		
	    if (i == 1)
		System.out.print("VIP "+3000*j+"元");
		else if(i == 2)
		System.out.print("包廂    "+2500*j+"元");	
		else if(i == 3)
		System.out.print("前中場  "+2000*j+"元");
		else if(i == 4)
		System.out.print("左右場   "+1000*j+"元");
		else if(i == 5)
		System.out.print("最高區座位  "+500*j+"元");
		
		
	}

}
