

import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);
	
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		System.out.printf("%10d%10d%10d%10d\n%10d%10d%10d%10d",a,b,c,d,e,f,g,h);
		
		input.close();
		
		
	}

}
