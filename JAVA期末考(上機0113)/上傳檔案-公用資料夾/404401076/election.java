
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int ticket=10;
		int a=0,b=0,c=0,d=0;
		for(int i=1;i<=10;i++)
		{
		System.out.println("������`�Τj��A�п�J�A���벼���,�ثe�A�٦�"+ticket+"�i�ﲼ,(�@)��������,"
				+ "(�G)�������^,(�T)��������,(�|)���o��");
		int k=input.nextInt();
		switch(k)
		{
		case 1:a++;break;
		case 2:b++;break;
		case 3:c++;break;
		default:d++;break;
		}
		ticket--;
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)�����ۣ�"+a+"��");
		System.out.println("(�G)�����^��"+b+"��");
		System.out.println("(�T)��������"+c+"��");
		System.out.println("(�|)�o����"+d+"��");
	}

}
