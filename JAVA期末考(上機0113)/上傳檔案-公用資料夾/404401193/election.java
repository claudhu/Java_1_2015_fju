
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("(�@)��������");
		System.out.println("(�G)�������^");
		System.out.println("(�T)��������");
		System.out.println("(�|)���o��");
		System.out.println("�A���Q�i��,�A�n�뵹��");
		int i = 10;
		int e ;
		int finall;
		int a=0,b=0,c=0,d=0;
		for(e=1;e<=10;e++){
			int who = input.nextInt();
			finall= i - e;
			System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦�"+finall+"�i�ﲼ");
			if(who==1){
				a+=1;}
				
			if(who==2){
				b+=1;}
				
			if(who==3){
				c+=1;}
				
			if(who==4){
				d+=1;}
			
			
			if (i == 0)
				break;
			
		
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)��������"+a+"��");
		System.out.println("(�@)�������^"+b+"��");
		System.out.println("(�@)��������"+c+"��");
		System.out.println("(�@)���o��"+d+"��");
		
		
		
	}
}


