

import java.util.Scanner;

public class Prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in) ;
    System.out.println("Enter");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    int e = input.nextInt();
    int f = input.nextInt();
    int g = input.nextInt();
    int h = input.nextInt();
    System.out.printf("%8d%8d%8d%8d\n",a,b,c,d);
    System.out.printf("%8d%8d%8d%8d",e,f,g,h);
   
    
	}

}
