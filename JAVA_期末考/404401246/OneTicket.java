import java.util.Scanner;
public class OneTicket {

	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int sum =0;
		
		System.out.print("請輸入門票代碼: ");
		int kind = input.nextInt();
		
		System.out.print("幾張? : ");
		int num = input.nextInt();
		
		if(kind == 1){
			sum = num*3000;
			System.out.print("總金額為: "+sum);
		}
		else if(kind == 2){
			sum = num*2500;
			System.out.print("總金額為: "+sum);
		}
		else if(kind == 3){
			sum = num*2000;
			System.out.print("總金額為: "+sum);
		}
		else if(kind == 4){
			sum = num*1000;
			System.out.print("總金額為: "+sum);
		}
		else if(kind == 5){
			sum = num*500;
			System.out.print("總金額為: "+sum);
		}
		
		
	}
}
