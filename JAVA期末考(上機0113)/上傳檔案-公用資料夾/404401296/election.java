

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		
		int c1=0,c2=0,c3=0,c4=0;
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�벼�ﶵ:(�@)�B������ (�G)�B�����^ (�T)������(�|)�o���A�� 10 �i�ﲼ �A�i�H���Ƨ� ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("�п�J�벼�ﶵ");
			int a=input.nextInt();
			switch(a){
				
			case 1:c1++;
				break;
				case 2:c2++;
				break;
				case 3:c3++;
				break;
				case 4:c4++;
				break;

						}


			
			System.out.println("�A�٦�:"+(10-i)+"��");
		}
		
		System.out.println("\n�벼���G");
		System.out.println("(�@)�B������:"+c1);
		System.out.println("(�G)�B�����^"+c2);
		System.out.println("(�T)������:"+c3);
		System.out.println("(�|)�o��:"+c4);

	}

}
