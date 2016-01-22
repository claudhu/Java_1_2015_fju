import java.util.Scanner;


public class Moretickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("門票代碼\t門票名稱\t價格");
		System.out.println("1\tVip\t3000");
		System.out.println("2\t包廂\t2500");
		System.out.println("3\t前中場\t2000");
		System.out.println("4\t左右場\t1000");
		System.out.println("5\t最高區座位\t500");
		int num , a , b ,c ,d ,e ,totalprice,totalpricea,totalpriceb,totalpricec,totalpriced,totalpricee ;
		
		System.out.println("請選擇門票代碼");
		num = input.nextInt();
		System.out.println("請選擇張數");
		int i = input.nextInt();
		if(num==1){
			 a=3000*i;
			}
		else if(num==2){
			 b=2500*i;
			
		}
		else if(num==3){
			c=2000*i;
			
		}
		else if(num==4){
			 d=1000*i;
			
		}
		else if(num==5){
			e=500*i;
			
		}
	
	}


}
