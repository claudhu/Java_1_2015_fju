import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入門票代碼及數量: ");
		int num[] = new int[5];
		int code = 0;
		
		for(;;){
			int x = 0;
			code = input.nextInt();
			x = input.nextInt();			
			
			if(code == 0)
				break;
			
			else if(code == 1){
				num[0] = num[0] + x;				
			}
			else if(code == 2){
				num[1] = num[1] + x;				
			}
			else if(code == 3){
				num[2] = num[2] + x;				
			}
			else if(code == 4){
				num[3] = num[3] + x;				
			}
			else if(code == 5){
				num[4] = num[4] + x;				
			}	
					
			
		}
		
		int total = num[0] * 3000 + num[1] * 2500 + num[2] * 2000 + num[3] * 1000 + num[4] * 500 ;
		
		System.out.print("總金額:" + total);
		
		
		
	}

}
