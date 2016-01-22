import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.printf("Please enter a number: ");
		int n=input.nextInt();
		System.out.println("Your square looks like: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++)
				System.out.printf("*");
			for (int k=Math.abs(i-(n-1)); k>0; k--)
				System.out.printf("#");
			System.out.println();
		}
	}
}
