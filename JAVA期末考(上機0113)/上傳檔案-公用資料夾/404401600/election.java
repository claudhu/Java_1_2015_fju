
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("���إ����`�Τj��A�п�J�z���벼���");
		System.out.println("(�@)������");
		System.out.println("(�G)�����^");
		System.out.println("(�T)������");
		System.out.println("(�|)�o��");
		int count=10;
		int a=0,b=0,c=0,d=0;
		while(count>0){
			
			System.out.println("�z�٦�"+count+"��");
			int  t =input.nextInt();
			if(t==1){
				a++;
				count--;}
			else if(t==2){
				b++;
				count--;}
			else if(t==3){
				c++;
				count--;}
			else if(t==4){
				d++;
				count--;}
			else
				System.out.println("�I�D�z�r��F�A���Q��ܤ֧�ӥ��T���o���a");
				
		}
		System.out.println("�j�ﵲ�G�έp");
		System.out.println("(�@)������  "+a+"��");
		System.out.println("(�G)�����^  "+b+"��");
		System.out.println("(�T)������  "+c+"��");
		System.out.println("(�|)�o��      "+d+"��");
		

	}

}
