

import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("請輸入八個整數");
    long a=input.nextLong();
    long b=input.nextLong();
    long c=input.nextLong();
    long d=input.nextLong();
    long e=input.nextLong();
    long f=input.nextLong();
    long g=input.nextLong();
    long h=input.nextLong();
    System.out.printf("%10d%10d%10d%10d\n",a,b,c,d);
    System.out.printf("%10d%10d%10d%10d",e,f,g,h);
	
	
	
	}

}
