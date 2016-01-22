
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the three numbers :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("The sorting result is as follows:");
		
		if (a > b && a > c && b > c)
			System.out.print(c + " " + b + " " + a);
		else if (a > b && a > c && c > b)
			System.out.print(b + " " + c + " " + a);
		else if (b > a && b > c && a > c)
			System.out.print(c + " " + a + " " + b);
		else if (b > a && b > c && c > a)
			System.out.print(a + " " + c + " " + b);
		else if (c > a && c > b && a > b)
			System.out.print(b + " " + a + " " + c);
		else if (c > a && c > b && b > a)
			System.out.print(a + " " + b + " " + c);

	}

}
