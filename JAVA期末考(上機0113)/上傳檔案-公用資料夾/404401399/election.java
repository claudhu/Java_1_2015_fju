
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("������`�Τj��п�J�A���벼��ܡA�ثe�z�٦�10�i�ﲼ");
		System.out.println("(�@)�B������");
		System.out.println("(�G)�B�����^");
		System.out.println("(�T)�B������");
		System.out.println("(�|)�B�o��");
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0;i<10;i++){
			
			
			System.out.println("�п�J�A���벼��ܡA�ثe�z�٦�"+ (10-count) +"�i�ﲼ");
			int j = input.nextInt();
			
			if(j==1)
				a = a+1;
			else if(j==2)  
			    b = b+1;
			else if(j==3) 
				c = c+1; 
			else if(j==4) 
				d = d+1;  
			count++;  
			
			}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)�B������" + a +"��");
		System.out.println("(�G)�B�����^" + b +"��");
		System.out.println("(�T)�B������" + c +"��");
		System.out.println("(�|)�B�o��"  + d +"��");
			
			
		}
			 
			            
                           

	}


