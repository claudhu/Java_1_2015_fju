import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("請輸入門票代碼");
		int n=input.nextInt();
		switch(n){
		case 1:
			System.out.println("VIP,一張3000");break;
		case 2:
			System.out.println("包廂,一張2500");break;
		case 3:
			System.out.println("前中場,一張2000");break;
		case 4:
			System.out.println("左右場,一張1000");break;
		case 5:
			System.out.println("最高區座位,一張500");break;
			}
		System.out.println("請輸入門票數量");
		int k=input.nextInt();
	    int array[]=new int[6];
	    array[1]=3000;
	    array[2]=2500;
	    array[3]=2000;
	    array[4]=1000;
	    array[5]=500;
	    int total=array[n]*k;
	    System.out.println("您所消費的金額是"+total);
	}

}
