import java.util.*;
public class election {

	public static void main(String[] args) {
		
		int t=0,t1=0,t2=0,t3=0,t4=0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i =10 ;i>0;i--){
		
		System.out.printf("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ:\n(�@)�B������\n(�G)�B�����^\n(�T)�B������ \n(�|)�B�o��\n",i);
		
		 t=input.nextInt();
		 
		 if(t==1)
			 t1++;
		 else if(t==2)
			 t2++;
		 else if(t==3)
			 t3++;
		 else if(t==4)
			 t4++;
		 
		
		}
		
		System.out.printf("�j�ﵲ�G�έp�G \n(�@)�B������ %d��\n(�G)�B�����^ %d��\n(�T)�B������ %d��\n(�|)�B�o�� %d��",t1,t2,t3,t4);
	}

}
