import java.util.Scanner;


public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入8個整數");
		int a,b,c,d,e,f,g,h;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		f=input.nextInt();
		g=input.nextInt();
		h=input.nextInt();
		System.out.printf("%6d%10d%10d%10d \n" ,a,b,c,d);
		System.out.printf("%-6d%10d%10d%10d" ,e,f,g,h);
	}

}
