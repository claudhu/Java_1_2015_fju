import java.util.Scanner;
public class MoreTickets {

	private static final int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1"+"VIP"+"3000"+"2"+"�]�["+"2500"+"3"+"�e����"+"2000"+"4"+"���k��"+"1000"+"5"+"�̰��Ϯy��"+"500");

		System.out.println("�п�ܤ@�ز��ÿ�J�n�ʶR�X�i");

		Scanner input = new Scanner(System.in);
      
		int num = input.nextInt();
	    
		int ticket = input.nextInt();
		
		int price1 = 3000*ticket;

		int price2 = 2500*ticket;

		int price3 = 2000*ticket;

		int price4 = 1000*ticket;

		int price5 = 500*ticket;
		while(num!=0)
		{
		num = input.nextInt();
		    
		ticket = input.nextInt();
			
	    if(num==1)
			System.out.println(price1);
        
	    else if(num==2)
			System.out.println(price2);

	    else if(num==3)
			System.out.println(price3);

	    else if(num==4)
			System.out.println(price4);

	    else if(num==5)
			System.out.println(price5);
		break;
		}
		
	    int totalprice = price1+price2+price3+price4+price5;
		System.out.println("total price is:"+totalprice);

		
		
		
		
		
		
		
		

		
	}

}
