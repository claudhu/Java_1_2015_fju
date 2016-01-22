import java.util.Scanner;


public class moretickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		;
		int array []=new int[5];
		for(int n=1;n<=5;n++){
			System.out.println("請輸入門票代碼");
			int m = input.nextInt();
			System.out.println("請輸入數量");
			int k = input.nextInt();
			int total=0;
			for(int n2=1;n2<=k;n2++)
				if(n==1)
				total=n2*3000;
				else if(n==2)
				total=n2*2500;
				
				else if(n==3)
				total=n2*2000;
				
				else if(n==4)
				total=n2*1000;
				
				else if(n==5)
				total=n2*500;
			System.out.println("total"+toatal);
	}
		}
		

}
