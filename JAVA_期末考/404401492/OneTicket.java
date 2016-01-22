import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.print("請輸入要購買的門票代碼");
     int a = input.nextInt();
     System.out.print("請輸入要購買的數量");
     int b =input.nextInt();
     if (a==1)
    	 a=3000;
     else if (a==2)
    	 a=2500;
    	 else if(a==3)
    		 a=2000;
    	 else if (a==4)
    		 a=1000;
    	 else if (a==5)
    		 a=500;
     System.out.println("所購門票總金額為"+a*b);
     
	}

}
