

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.print("������`�Τj��A�п�J�A����\n����ܥثe�A�٦�10�i��"
		+"\n(�@)�B������\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��\n");
		int a=0,b =0,c=0,d=0;
		for(int i = 9;i>=0;i--){
			int ticket=input.nextInt();
			if(ticket==1)
				a++;
			if(ticket==2)
				b++;
			if(ticket==3)
				c++;
			if(ticket==4)
				d++;
			System.out.println("�ثe�A�٦�"+i+"�i��");
		}
		System.out.println("�j�ﵲ�G�έp");
		System.out.println("(�@)�B������"+a+"��");
		System.out.println("(�G)�B�����^"+b+"��");
		System.out.println("(�T)�B������"+c+"��");
		System.out.println("(�|)�B�o��"+d+"��");
		
	 
		input.close();
		
		}
	}


