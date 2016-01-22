import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a numbers : ");
		
		int a = scn.nextInt();
		
		for(int row = 0 ; row < a ; row++)
		{
			for(int i = 0 ; i <= row ; i++)
			{
				System.out.print("*");
			}
			for(int k = a-row ; k > 1 ; k--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
