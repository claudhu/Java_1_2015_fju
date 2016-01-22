
import java.util.*;
public class MoreTickets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0,num=0;
		do{
			System.out.printf("門票代碼:");
			num = input.nextInt();
			if(num==0)
				break;
			System.out.printf("數量:");
			int num2 = input.nextInt();
		switch(num){
		case 0: break;
		case 1: sum+=num2*3000;break;
		case 2: sum+=num2*2500;break;
		case 3: sum+=num2*2000;break;
		case 4: sum+=num2*1000;break;
		case 5: sum+=num2*500;break;
		}
		}while(num!=0);
		System.out.printf("總金額:%d",sum);

	}

}
