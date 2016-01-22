

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("請輸入所需要的門票代碼:");
		int x = input.nextInt();
		System.out.print("請輸入張數:");
		int number = input.nextInt();
		switch(x){
		case 1: System.out.print("總共為"+number*3000+"元");break;
		case 2: System.out.print("總共為"+number*2500+"元");break;
		case 3: System.out.print("總共為"+number*2000+"元");break;
		case 4: System.out.print("總共為"+number*1000+"元");break;
		case 5: System.out.print("總共為"+number*500+"元");break;
		}
	    
	}

}
