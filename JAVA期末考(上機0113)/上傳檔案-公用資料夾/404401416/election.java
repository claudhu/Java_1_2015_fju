

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
	System.out.println("���إ���j��A�п�J�A����");
	System.out.println("����ܡA�ثe�z�٦�10�i�ﲼ");
	System.out.println("(�@)�B������");
	System.out.println("(�G)�B�����^");
	System.out.println("(�T)�B������");
	System.out.println("(�|)�B�o��");
	int num1=0 , num2=0 , num3=0 , num4=0 ;
	for (int i = 10 ; i>=1 ; i--){
		int ticket = input.nextInt();
		if(ticket==1)
			num1++;
		if(ticket==2)
			num2++;
		if(ticket==3)
			num3++;
		if(ticket==4)
			num4++;
		if(ticket<1||ticket>4)
			num4++;
		System.out.println("�A�٦�"+(i-1)+"�i��");
			
	}
	    System.out.println("�j�ﵲ�G�έp:");
	    System.out.println("(�@)�B������"+num1+"��");
	    System.out.println("(�@)�B�����^"+num2+"��");
	    System.out.println("(�@)�B������"+num3+"��");
	    System.out.println("(�@)�B�o��"+num4+"��");
	
	
	}

}
