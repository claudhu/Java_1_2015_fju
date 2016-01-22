
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("請輸入門票代碼 (1~5) : ");
	int ticket = input.nextInt();
	System.out.println("請輸入數量: ");
	int amount = input.nextInt();
	
	int Prize = 0;
	switch(ticket){
	case 1 : System.out.println("Prize: "+amount*3000);
	break;
	case 2 : System.out.println("Prize: "+amount*2500);
	break;
	case 3 : System.out.println("Prize: "+amount*2000);
	break;
	case 4 : System.out.println("Prize: "+amount*1500);
	break;
	case 5 : System.out.println("Prize: "+amount*500);
	
	
	
	
	
	
	
	     
		
	}
	
	
	}
	
	}
	

	
	

