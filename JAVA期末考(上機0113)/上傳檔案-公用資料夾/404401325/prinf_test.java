

import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("輸入八位整數:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		int f=input.nextInt();
		int g=input.nextInt();
		int h=input.nextInt();
		
		System.out.printf("%6d%12d%12d%12d\n",a,b,c,d);
		System.out.printf("%6d%12d%12d%12d",e,f,g,h);

	}

}
