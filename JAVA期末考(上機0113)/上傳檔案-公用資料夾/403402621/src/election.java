import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=10;
		System.out.println("���إ����`�Τj��A�п�J�A����\n����ܡA�ثe�z�٦�"+n+"�i�ﲼ\n(�@)�B������\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��");
		int a = 0;
		int b=0;
		int c=0;
		int d=0;
		int i;
		for(int k=1;k<=10;k++){
			switch(i=input.nextInt()){
			case 1:
				a=a+1;
			case 2:
				b=b+1;
			case 3:
				c=c+1;
			case 4:
				d=d+1;
			}
		}
		System.out.print("�j�ﵲ�G�έp:\n(�@)�B������"+a+"��\n(�G)�B�����^"+b+"��\n(�T)�B������"+c+"��\n(�|)�B�o��"+d+"��");

	}

}
