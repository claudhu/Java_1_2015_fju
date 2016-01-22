
import java.util.*;
public class OneTicket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("門票代碼:");
		int num = input.nextInt();
		System.out.printf("數量:");
		int num2 = input.nextInt();
		switch(num){
		case 0: break;
		case 1: System.out.printf("總金額:%d",num2*3000);break;
		case 2: System.out.printf("總金額:%d",num2*2500);break;
		case 3: System.out.printf("總金額:%d",num2*2000);break;
		case 4: System.out.printf("總金額:%d",num2*1000);break;
		case 5: System.out.printf("總金額:%d",num2*500);break;

	}
	}
}
