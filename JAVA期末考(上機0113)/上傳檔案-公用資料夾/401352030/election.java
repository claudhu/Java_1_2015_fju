import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		for(int i=10;i>0;i--){
		System.out.print("��������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�"+i+"�i�ﲼ");
		int z=input.nextInt();
		
		if(z>3||z<1){
			d++;
		}
		else if(z<=3&&z%3==1){
			a++	;		
		}
		else if(z<=3&&z%3==2){
			b++;		
		}
		else if(z<=3&&z%3==0) {
			c++;
		}
				
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)�B������"+a+"��");
		System.out.println("(�G)�B�����^"+b+"��");
		System.out.println("(�T)�B������"+c+"��");
		System.out.println("(�|)�B�o��"+d+"��");
	}
	

}
