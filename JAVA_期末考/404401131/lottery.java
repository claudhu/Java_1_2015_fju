

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = (int)(100+Math.random()*999);
		System.out.println("�üƬ�"+a);
		System.out.println("��J3��ƾ��");
		int b = input.nextInt();
		
		
		if(a==b){
			System.out.println("���F10000");
		}
		 if(a/10==b/10&&a/10%10==b%10&&a%10==b/10%10)
			{System.out.println("���F8000");}
		 if(a/10==b%10&&a/10%10==b/10%10&&a%10==b/10){
		System.out.println("���F8000");
		}
		 if(a/10==b/10%10&&a/10%10==b/10&&a%10==b%10){
		System.out.println("���F8000");}
		 if(a/10==b/10%10&&a/10%10==b%10&&a%10==b/10){
		System.out.println("���F8000");
	}
		 if(a/10==b%10&&a/10%10==b/10&&a%10==b/10%10){
		System.out.println("���F8000");}
		 if(a/10%10==b/10%10&&a%10==b%10){
			System.out.println("���F6000");
		}
		else
			System.out.println("no");
		

	}

}
