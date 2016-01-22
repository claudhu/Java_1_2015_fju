import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		
		
		
		
		
		
		int sum=0;
	    int i=1;
		int []a={1,2,3,4,5};
	    while(i!=0){
	    	
	    System.out.println("請輸入門票代碼(1)VIP(2)包廂(3)前中場(4)左右場(5)最高區座位:");	
	    
		int n=input.nextInt();
		
		System.out.println("請輸入數量:");	
		int num =input.nextInt();
		
		a[n-1]=n*num;
		
		if(n==0){
			for(int b=0;b<5;b++){
			sum+=a[b];
			}
			System.out.println("總金額: "+sum);
		
		}
	    }}}
		
		
		

