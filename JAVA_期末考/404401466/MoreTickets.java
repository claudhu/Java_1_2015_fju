
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("門票代碼輸入0時將為您計算總金額");
		System.out.println("請輸入門票代碼");
		int a = input.nextInt();
		System.out.println("請輸入該種門票數量");
		int b = input.nextInt();
		
		
		while(a!=0){
			System.out.println("請繼續輸入門票代碼");
			a = input.nextInt();
			System.out.println("請繼續輸入該種門票數量");
			b = input.nextInt();
		}
		

		if(a==1){
			System.out.println("門票總金額為:"+b*3000);
		}
		else if(a==2){
			System.out.println("門票總金額為:"+b*2500);
		}
		else if(a==3){
			System.out.println("門票總金額為:"+b*2000);
		}
		else if(a==4){
			System.out.println("門票總金額為:"+b*1000);
		}
		else{
			System.out.println("門票總金額為:"+b*500);
		}
		
	}

}
