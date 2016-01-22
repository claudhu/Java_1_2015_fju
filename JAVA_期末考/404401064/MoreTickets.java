
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入門票代碼: ");
		int number = input.nextInt();
		int [] array = new int[0];
		switch(number){
		case 1:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			array[0] += i*3000;
			System.out.println("總金額:" + array[0]);break;
		
		}
		case 2:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			array[1] += i*2500;
			System.out.println("總金額:" + array[1]);break;
		}
		case 3:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			array[2] += i*2000;
			System.out.println("總金額:" + array[2]);break;
		}
		case 4:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			array[3] += i*1000;
			System.out.println("總金額:" + array[3]);break;
		}
		case 5:{
			System.out.print("請輸入數量:");
			int i = input.nextInt();
			array[4] += i*500;
			System.out.println("總金額:" + array[4]);break;
		}
		default:System.out.print("請重新輸入:");
		}
		if(number == 0){
			System.out.println(array[0] + array[1] + array[2] + array[3] + array[4]
					+ array[5]);
		}
			
				
				

	}
}	


	


