

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = (int)(100+Math.random()*999);
		System.out.println("亂數為"+a);
		System.out.println("輸入3位數整數");
		int b = input.nextInt();
		
		
		if(a==b){
			System.out.println("中了10000");
		}
		 if(a/10==b/10&&a/10%10==b%10&&a%10==b/10%10)
			{System.out.println("中了8000");}
		 if(a/10==b%10&&a/10%10==b/10%10&&a%10==b/10){
		System.out.println("中了8000");
		}
		 if(a/10==b/10%10&&a/10%10==b/10&&a%10==b%10){
		System.out.println("中了8000");}
		 if(a/10==b/10%10&&a/10%10==b%10&&a%10==b/10){
		System.out.println("中了8000");
	}
		 if(a/10==b%10&&a/10%10==b/10&&a%10==b/10%10){
		System.out.println("中了8000");}
		 if(a/10%10==b/10%10&&a%10==b%10){
			System.out.println("中了6000");
		}
		else
			System.out.println("no");
		

	}

}
