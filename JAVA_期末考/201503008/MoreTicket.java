
import java.util.Scanner;


public class MoreTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please input the code and number of the ticket\n");
		int data[][] = new int[100][2];
		int account =0;
		int code = input.nextInt();

		while(code!=0)
		{	
			data[account][0] = code;
			int num = input.nextInt();
			data[account][1] = num;
			account++;
			code = input.nextInt();
		}

		int Price[] = new int[100];
		for(int i =0;i<account;i++)
		{	
			switch(data[i][0])
			{
			case 1:
				Price[i] = data[i][1]*3000;
				break;
			case 2:
				Price[i] = data[i][1]*2500;
				break;
			case 3:
				Price[i] = data[i][1]*2000;
				break;
			case 4:
				Price[i] = data[i][1]*1000;
				break;
			case 5:
				Price[i] = data[i][1]*500;
				break;
			}
		}


		
		for(int i =0;i<account;i++)
		System.out.printf("price is:%d\n",Price[i]);		

	}

}
