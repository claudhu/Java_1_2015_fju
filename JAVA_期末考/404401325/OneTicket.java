

import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��J�����N��:");
		int ticket=input.nextInt();
		System.out.println("��J�����ƶq:");
		int count=input.nextInt();
		
		int total;
		if(ticket==1)
			total=3000*count;
		else if(ticket==2)
			total=2500*count;
		else if(ticket==3)
			total=2000*count;
		else if(ticket==4)
			total=1000*count;
		else
			total=500*count;
		
		System.out.println("�`���B�O:"+total);
		 input.close();
		

	}

}
