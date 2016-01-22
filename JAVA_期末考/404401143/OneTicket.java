import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int [] a={1,2,3,4,5};
		System.out.println("請輸入門票代碼(1)VIP(2)包廂(3)前中場(4)左右場(5)最高區座位:");	
		int n=input.nextInt();
		System.out.println("請輸入數量:");	
		int num =input.nextInt();
		int sum=0;
		if(a[0]==n){
			sum+=3000*num;
		}
		if(a[1]==n){
			sum+=2500*num;
		}
		if(a[2]==n){
			sum+=2000*num;
		}
		if(a[3]==n){
			sum+=1000*num;
		}
		if(a[4]==n){
			sum+=500*num;
		}
		
		System.out.println("總金額: "+sum);	
	}

}
