
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入門票代碼");
		int number = input.nextInt();
	
		switch(number){
		case 1 : {
			System.out.println("請輸入數量");
			int number2 = input.nextInt();
			int total = number2 * 3000 ;
			System.out.println("總共金額為:" + total);}break ;
		case 2 : {
			System.out.println("請輸入數量");
			int number2 = input.nextInt();
			int total = number2 * 2500 ;
			System.out.println("總共金額為:" + total);}break ;
		case 3 : {
			System.out.println("請輸入數量");
			int number2 = input.nextInt();
			int total = number2 * 2000 ;
			System.out.println("總共金額為:" + total);}break ;
		case 4 : {
			System.out.println("請輸入數量");
			int number2 = input.nextInt();
			int total = number2 * 1000 ;
			System.out.println("總共金額為:" + total);}break ;
		case 5 : {
			System.out.println("請輸入數量");
			int number2 = input.nextInt();
			int total = number2 * 500 ;
			System.out.println("總共金額為:" + total);}break ;
		}
		
	}

}
