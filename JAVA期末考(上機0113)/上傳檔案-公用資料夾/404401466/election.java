
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		
		System.out.println("���إ����`�Τj��,�п�J�z���벼���,�ثe�z�٦�"+"10"+"�i�ﲼ");
		System.out.println("(�@)������");
		System.out.println("(�G)�����^");
		System.out.println("(�T)������");
		System.out.println("(�|)�o��");
		int count = 0;
		
		while(count<=10){
			count++;
			for(int j=10;j>=1;j--){
				System.out.println("���إ����`�Τj��,�п�J�z���벼���,�ثe�z�٦�"+j+"�i�ﲼ");
				int a = input.nextInt();
				if(a==1){
					n1++;
				}
				else if(a==2){
					n2++;
				}
				else if(a==3){
					n3++;
				}
				else{
					n4++;
				}
				
			}
			System.out.println("�j�ﵲ�G�έp:");
			System.out.println("(�@) ������"+n1+"��");
			System.out.println("(�G) �����^"+n2+"��");
			System.out.println("(�T) ������"+n3+"��");
			System.out.println("(�|) �o��"+n4+"��");break;
	    }
		

	 }

}
