import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�10�i�ﲼ");
		System.out.println("(�@)�B������");
		System.out.println("(�G)�B�����^");
		System.out.println("(�T)�B������");
		System.out.println("(�|)�B�o��");
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		for(int i=10;i>0;i--){
			int j=input.nextInt();
			System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�"+(i-1)+"�i�ﲼ");
			System.out.println("(�@)�B������");
			System.out.println("(�G)�B�����^");
			System.out.println("(�T)�B������");
			System.out.println("(�|)�B�o��");
			if(j==1)
				n1++;
			
			else if(j==2)
				n2++;
			
			else if(j==3)
				n3++;
			
			else
				n4++;
	
			
			
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)�B������  "+n1+"��");
		System.out.println("(�G)�B�����^  "+n2+"��");
		System.out.println("(�T)�B������  "+n3+"��");
		System.out.println("(�|)�B�o��  "+n4+"��");
		

	}

}
