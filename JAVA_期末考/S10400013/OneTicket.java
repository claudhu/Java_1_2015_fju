import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		
		int code,num,a1=3000,a2=2500,a3=2000,a4=1000,a5=500;
		
         Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the ticket code:");
		
		code = input.nextInt();
		
		System.out.println("Please enter the ticket number:");
		
		num = input.nextInt();
		
		if (code==1)
			System.out.printf("The price is:%d",(num*a1));
		else if (code==2)
			System.out.printf("The price is:%d",(num*a2));
		else if (code==3)
			System.out.printf("The price is:%d",(num*a3));
		else if (code==4)
			System.out.printf("The price is:%d",(num*a4));
		else 
			System.out.printf("The price is:%d",(num*a5));
	}

}
