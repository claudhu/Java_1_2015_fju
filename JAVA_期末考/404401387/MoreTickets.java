import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t1=3000;
		int t2=2500;
		int t3=2000;
		int t4=1000;
		int t5=500;
		int num=0;
		for(int i=1;i>0;i++){
			System.out.print("請輸入所需門票代碼:");
			int x = input.nextInt();
			
			if(x==1){
				System.out.print("請輸入所需門票數量:");
			int y = input.nextInt();
				num+=y*t1;
				}
			else if(x==2){
				System.out.print("請輸入所需門票數量:");
			int y = input.nextInt();
				num+=y*t2;
				}
			else if(x==3){
				System.out.print("請輸入所需門票數量:");
			int y = input.nextInt();
				num+=y*t3;
				}
			else if(x==4){
				System.out.print("請輸入所需門票數量:");
			int y = input.nextInt();
				num+=y*t4;
				}
			else if(x==5){
				System.out.print("請輸入所需門票數量:");
			int y = input.nextInt();
				num+=y*t5;
				}
			else if(x==0){
				System.out.print("總金額:"+num);
				break;
				}
		}
			

	}

}
