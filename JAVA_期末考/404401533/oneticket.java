import java.util.Scanner;


public class oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("門票代碼\t門票名稱\t價格");
		System.out.println("1\tVip\t3000");
		System.out.println("2\t包廂\t2500");
		System.out.println("3\t前中場\t2000");
		System.out.println("4\t左右場\t1000");
		System.out.println("5\t最高區座位\t500");
		System.out.println("請選擇一種門票代碼");
		int num = input.nextInt();
		System.out.println("請選擇張數");
		int i = input.nextInt();
		int totalprice;
		if(num==1){
			totalprice=3000*i;
			System.out.println("總金額為"+totalprice);
			}
		else if(num==2){
			 totalprice=2500*i;
			System.out.println("總金額為"+totalprice);
		}
		else if(num==3){
			 totalprice=2000*i;
			System.out.println("總金額為"+totalprice);
		}
		else if(num==4){
			 totalprice=1000*i;
			System.out.println("總金額為"+totalprice);
		}
		else if(num==5){
			 totalprice=500*i;
			System.out.println("總金額為"+totalprice);
		}
		
		
	}

}
