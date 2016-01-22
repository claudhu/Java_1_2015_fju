import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入門票代碼及數量:");
		int a=input.nextInt();
		int b=input.nextInt();
		
		if(a==1){
			int Price=b*3000;
			System.out.println("購買的是VIP門票"+b+"張共"+Price+"元");}
		else if(a==2){
			int Price=b*2500;
			System.out.println("購買的是包廂門票"+b+"張共"+Price+"元");}
		else if(a==3){
			int Price=b*2000;
			System.out.println("購買的是前中場門票"+b+"張共"+Price+"元");}
		else if(a==4){
			int Price=b*1000;
			System.out.println("購買的是左右場門票"+b+"張共"+Price+"元");}
		else{
			int Price=b*500;
			System.out.println("購買的是最高區座位門票"+b+"張共"+Price+"元");}
		

	}

}
