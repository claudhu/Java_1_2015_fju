import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("�п�J�����N�X : ");
    int code = input.nextInt();
    System.out.println("�п�J���ʶR�������ƶq : ");
    int sum = input.nextInt();
    do{
    	System.out.println("�п�J�����N�X : "); 
    	code = input.nextInt();
    	System.out.println("�п�J���ʶR�������ƶq : ");
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


