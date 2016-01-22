

import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("½Ð¿é¤J100.1000.100000.10.200000.2.2000.200000");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
	
		System.out.printf("%9d",a);
		System.out.printf("%9d",b);
		System.out.printf("%9d",c);
		System.out.printf("%9d",d);
		System.out.println();
		System.out.printf("%9d",e);
		System.out.printf("%9d",f);
		System.out.printf("%9d",g);
		System.out.printf("%9d",h);
		
	}

}
