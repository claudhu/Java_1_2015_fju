

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦�10�i��");
		System.out.println("(�@).������\n"+"(�G).�����^\n"+"(�T).������\n"+"(�|).�o��\n");
		
		
		int a = input.nextInt();
		int aa= 10 - a;
		System.out.println("�ثe�A�٦�"+aa+"�i��");
		int b = input.nextInt();
		int bb= 10 - a - b;
		System.out.println("�ثe�A�٦�"+bb+"�i��");
		int c = input.nextInt();
		int cc = 10 - a -b- c;
		System.out.println("�ثe�A�٦�"+cc+"�i��");
		int d = input.nextInt();
		
		System.out.println("�j�ﵲ�G�έp:\n"+"(�@).������"+a+"��\n"+"(�G).�����^"+b+"��\n"+
				"(�T).������"+c+"��\n"+"(�|).�o��"+d+"��");
		
		
		

	}

}
