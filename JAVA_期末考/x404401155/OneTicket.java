

import java.util.Scanner;

public class OneTicket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�@�ت����N�X:");
		int x = input.nextInt();
		System.out.print("�п�J�����ƶq:");
		int n = input.nextInt();
		
		if(x == 1)
			System.out.println("�`���B��: "+ 3000*n +" ��");
		else if(x == 2)
			System.out.println("�`���B��: "+ 2500*n +" ��");
		else if(x == 3)
			System.out.println("�`���B��: "+ 2000*n +" ��");
		else if(x == 4)
			System.out.println("�`���B��: "+ 1000*n +" ��");
		else if(x == 5)
			System.out.println("�`���B��: "+  500*n +" ��");
		
		
	}

}
