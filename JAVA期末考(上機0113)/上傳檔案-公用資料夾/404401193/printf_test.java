

import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("請輸入100");
		int a = input.nextInt();
		System.out.println("請輸入1000");
		int b = input.nextInt();
		System.out.println("請輸入100000");
		int c = input.nextInt();
		System.out.println("請輸入10");
		int d = input.nextInt();
		System.out.println("請輸入200000");
		int e = input.nextInt();
		System.out.println("請輸入2");
		int f = input.nextInt();
		System.out.println("請輸入2000");
		int g = input.nextInt();
		System.out.println("請輸入200000");
		int h = input.nextInt();
		System.out.printf("%8d%8d%8d%8d",a,b,c,d);
		System.out.println("");
		System.out.printf("%8d%8d%8d%8d",e,f,g,h);
	}

}
