import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int m =10 ; m>0 ;m--){
		System.out.println("���إ����`�Τj��A�п�J�A���벼��ܥثe�z�٦�"+m+"�i�ﲼ");
		System.out.println("(�@)�B������");
		System.out.println("(�G)�B�����^");
		System.out.println("(�T)�B������");
		System.out.println("(�|)�B�o��");		
			
			int j = input.nextInt();
		
			if(j == 1)
				a += 1;
			
			else if(j==2)
				b += 1;
			else if(j==3)
				c += 1;
			else 
				d += 1;
			
	 }
		System.out.println("���إ����`�Τj�ﵲ�G�έp");
		System.out.println("(�@)�B������"+a+"��");
		System.out.println("(�G)�B�����^"+b+"��");
		System.out.println("(�T)�B������"+c+"��");
		System.out.println("(�|)�B�o��"+d+"��");
		
		}
		
	}


