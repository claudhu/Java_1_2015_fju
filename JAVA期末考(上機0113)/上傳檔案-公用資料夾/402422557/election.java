import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a=0,b=0,c=0,d=0,count=10;
		int election[]=new int[10];
		for(i=1;i<=10;i++){
		System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�"+count+"�i�ﲼ(�@)�B������(�G)�B�����^(�T)�B������ (�|)�B�o��");
		election[i-1]=sc.nextInt();
		count--;
		if(election[i-1]==1)
			a++;
		else if(election[i-1]==2)
			b++;
		else if(election[i-1]==3)
			c++;
		else
			d++;
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)������:"+a+"�i��");
		System.out.println("(�G)�����^:"+b+"�i��");
		System.out.println("(�T)������:"+c+"�i��");
		System.out.println("(�|)�o��:"+d+"�i��");
		
	}

}
