import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the three numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.printf("The three numbers:\n%d %d %d", a, b , c);
		System.out.println("\nThe sorting result is as followers¡G ");
		if(a > b && a > c && b > c)
			System.out.printf("%d %d %d", a, b, c);
		else if(a > c && a > b && b < c)	
			System.out.printf("%d %d %d", a, c, b);
		else if(b > c && b > a && a > c)	
			System.out.printf("%d %d %d", b, a, c);
		else if(b > c && b > a && a < c)	
			System.out.printf("%d %d %d", b, c, a);
		else if(c > b && c > a && a > b)
			System.out.printf("%d %d %d", c, a, b);
		else
			System.out.printf("%d %d %d", c, b, a);
		
	}

}
