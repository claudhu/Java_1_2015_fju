
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a numbers : ");
		int num = input.nextInt();
		System.out.println("Your square looks like:");
		
		for (int i = 1 ; i <= num ; i++)
		{
			for (int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			for (int k = num ; k > i ; k--)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
