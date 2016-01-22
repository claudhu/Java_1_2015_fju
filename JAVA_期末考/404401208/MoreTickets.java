import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("請輸入門票代碼 : ");
    int code = input.nextInt();
    System.out.println("請輸入欲購買的門票數量 : ");
    int sum = input.nextInt();
    do{
    	System.out.println("請輸入門票代碼 : "); 
    	code = input.nextInt();
    	System.out.println("請輸入欲購買的門票數量 : ");
    	sum = input.nextInt();}while(code!=0);
    int total = 0 ; 	
    int sum1 = 0,sum2 =0,sum3=0,sum4=0,sum5=0;
	if(code == 1)
    	 sum1 =sum*3000;
    	
    else if (code ==2)
    	 sum2 =sum*2500;
    
    else if (code ==3)
    	 sum3 =sum*2000;
    
    else if (code ==4)
    	 sum4 =sum*1000;
    
    else if (code ==5)
    	 sum5 =sum*500;
    total = sum1 + sum2 +sum3+sum4+sum5;
    
    }
    
    }


