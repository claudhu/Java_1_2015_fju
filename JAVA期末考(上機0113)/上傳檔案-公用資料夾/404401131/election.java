

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int list[]=new int[10];
		int count=10;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("���إ����`�Τj��п�J�A���벼���");
		System.out.println("1.������");
		System.out.println("2.�����^");
		System.out.println("3.������");
		System.out.println("4.�o��");

		for(int i =0;i<list.length;i++){
			
			list[i]=input.nextInt();
			if(list[i]==1){
				a++;
			}
			else if(list[i]==2){
				b++;}
			else if(list[i]==3){
				c++;
			}
			else if(list[i]==4){
				d++;
			}
		int x=0;
		x=count-(i+1);
			System.out.println("�ثe�A�٦�"+x+"��");
			
		}
		System.out.println("1.������"+a+"��");
		System.out.println("2.�����^"+b+"��");
		System.out.println("3.������"+c+"��");
		System.out.println("4.�o��"+a+"��");




	}

}
