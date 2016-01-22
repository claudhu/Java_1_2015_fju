
import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter eight number: ");
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		int d =input.nextInt();
		int e =input.nextInt();
		int f =input.nextInt();
		int g =input.nextInt();
		int h =input.nextInt();
		System.out.printf("%12d",a);
		System.out.printf("%12d",b);
		System.out.printf("%12d",c);
		System.out.printf("%12d",d);
		System.out.println();
		System.out.printf("%12d",e);
		System.out.printf("%12d",f);
		System.out.printf("%12d",g);
		System.out.printf("%12d",h);
	}

}
