
import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j =n-1;j>i;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		

	}

}
