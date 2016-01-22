
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a [] = new int [8];
		a[0] = input.nextInt();
		a[1] = input.nextInt();
		a[2] = input.nextInt();
		a[3] = input.nextInt();
		a[4] = input.nextInt();
		a[5] = input.nextInt();
		a[6] = input.nextInt();
		a[7] = input.nextInt();
		System.out.printf("%d\t%d\t%d\t%d\n%d\t%d\t%d\t%d", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7]);
	}

}
