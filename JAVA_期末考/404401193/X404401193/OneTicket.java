import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入門票代碼及數量");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a==1)
			System.out.print("總金額是"+(3000*b));
		    
	    if(a==2)
	    	System.out.print("總金額是"+(2500*b));
		    
		if(a==3)
			System.out.print("總金額是"+(2000*b));
		    
		if(a==4)
			System.out.print("總金額是"+(1000*b));
		    
		if(a==5)
		   	System.out.print("總金額是"+(500*b));
		    
		}
		
	}


