

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =3000;
		int num2 =2500;
		int num3 =2000;
		int num4 =1000;
		int num5 =500;
		Scanner input = new Scanner(System.in) ;
		System.out.println("請輸入門票代碼(num1,num2.....)");
		
		int x = input.nextInt();
		System.out.println("請輸入張數");
		int y = input.nextInt();
		if(x==num1){
			int total=num1*y;
			System.out.println(total);
		}else if(x==num2){
			int total1=num2*y;
			System.out.println(total1);
		
		}else if(x==num3){
			int total2=num3*y;
			System.out.println(total2);
		}else if(x==num4){
			int total3=num4*y;
			System.out.println(total3);
		}else
			{int total4=num5*y;
		System.out.println(total4);
		}
		
		
		
		
		

	}

}
