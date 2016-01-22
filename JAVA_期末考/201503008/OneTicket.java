
import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Please input the code and number of the ticket\n");
		int code = input.nextInt();
		int num = input.nextInt();
		int price = 0;
		switch(code)
		{
		case 1:
			price = num*3000;
			break;
		case 2:
			price = num*2500;
			break;
		case 3:
			price = num*2000;
			break;
		case 4:
			price = num*1000;
			break;
		case 5:
			price = num*500;
			break;
		}
		System.out.printf("price is:%d",price);
		
		

	}

}
