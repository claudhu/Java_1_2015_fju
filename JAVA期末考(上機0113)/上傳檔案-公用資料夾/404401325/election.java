

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a = 0,b = 0,c = 0,d = 0;
		for(int i=10;i>0;i--){
			System.out.println("����������j��,�п�J�A���ò����,�ثe�A�٦�"+i+"�i��");
			System.out.println("(�@)�B������");
			System.out.println("(�G)�B�����^");
			System.out.println("(�T)�B������");
			System.out.println("(�|)�B�o��");
			System.out.println("��J���X:");
			int k=input.nextInt();
			
			if(k==1)
				a++;
			else if(k==2)
				b++;
			else if(k==3)
				c++;
			else
				d++;
			}
		System.out.println("�j��έp���G:");
		System.out.println("(�@)�B������"+a+" ��");
		System.out.println("(�G)�B�����^"+b+" ��");
		System.out.println("(�T)�B������"+c+" ��");
		System.out.println("(�|)�B    �o��"+d+" ��");

	}

}
