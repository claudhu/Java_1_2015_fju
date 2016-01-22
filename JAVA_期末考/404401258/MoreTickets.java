

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int number[] = new int[6];
		int x=0;
		int y=0;
		while(true){
			System.out.println("請輸入門票代碼(1~5)");
			
			x = input.nextInt();
			if(x==0)
				break;
			
			System.out.println("請輸入門票張數");
			
			y = input.nextInt();
			
		    number[x] += y;
		}
		
		long total = number[1]*3000+number[2]*2500+number[3]*2000
				+number[4]*1000+number[5]*500;
		
		System.out.println("總金額為"+total+"元");
		
		
		

	}

}
