import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("(�@)�B������ :1");
		System.out.println("(�G)�B�����^ :2");
		System.out.println("(�T)�B������ :3");
		System.out.println("(�|)�B�o�� :4");
		System.out.println("�ثe�z��10�i�ﲼ");
		System.out.println("�п�J�Կ�H�N��:");
		
		
		int D=0,C=0,S=0,O=0;
		for(int i=1;i<=10;i++){
			
		
		int t = input.nextInt();
		switch(t){
			case 1:D++;
				System.out.println("�z�٦�"+(10-i)+"�ﲼ");
				break;
			case 2:C++;
				System.out.println("�z�٦�"+(10-i)+"�ﲼ");
				break;
			case 3:S++;
				System.out.println("�z�٦�"+(10-i)+"�ﲼ");
				break;
			case 4: O++;
				System.out.println("�z�٦�"+(10-i)+"�ﲼ");
				break;
		}
		}
		System.out.println();
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)�B������"+D+"��");
		System.out.println("(�G)�B�����^"+C+"��");
		System.out.println("(�T)�B������ "+S+"��");
		System.out.println("(�|)�B�o�� "+O+"��");
		

	}

}
