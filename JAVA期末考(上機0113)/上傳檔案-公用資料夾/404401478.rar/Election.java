

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("(�@)�B�����ۥN���O1");
	    System.out.println("(�G)�B�����^�N���O2");
		System.out.println("(�T)�B�������N���O3");
		System.out.println("(�|)�B�o���N���O4");
		System.out.println("�п�J�A�Ҥ���Կ�N��");
		int i = input.nextInt();
		int count = 10;
		int a= 0;
		int b= 0;
		int c= 0;
		int d= 0;
		
			if(i==1){
			count--;
			count=count--;
			a++;
			System.out.println("������"+ a+"��");
			System.out.println("�Ѿl"+count+"��");
			
			}else if(i==2){
				count--;
				count=count--;
				b++;
				System.out.println("�����^"+ b+"��");
				System.out.println("�Ѿl"+count+"��");
			}else if(i==3){
				count--;
				count=count--;
				c++;
				System.out.println("������"+ c+"��");
				System.out.println("�Ѿl"+count+"��");
		}else if(i==4){
			count--;
			count=count--;
			d++;
			System.out.println("�o��"+ d+"��");
			System.out.println("�Ѿl"+count+"��");
			
}

}
	}