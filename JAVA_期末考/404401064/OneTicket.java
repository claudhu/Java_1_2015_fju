
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入門票代碼: ");
		int number = input.nextInt();
		
		switch(number){
		case 1:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			int total = i*3000;
			System.out.print("總金額:" + total);break;
		
		}
		case 2:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			int total = i*2500;
			System.out.print("總金額:" + total);break;
		}
		case 3:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			int total = i*2000;
			System.out.print("總金額:" + total);break;
		}
		case 4:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			int total = i*1000;
			System.out.print("總金額:" + total);break;
		}
		case 5:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			int total = i*500;
			System.out.print("總金額:" + total);break;
		}
		default:System.out.print("請重新輸入:");
		}
			
				
				
			}
		
		
}
		
		
		

	



