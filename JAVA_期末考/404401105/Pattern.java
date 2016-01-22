import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a numbers:");
		int num = input.nextInt();
		System.out.println("Your square looks like:");
		for(int i = 1 ; i <= num ; i++)
		{
			for(int k = 1 ; k<=i ; i++)
				System.out.print('*');
			System.out.println();
			

	
		}

	}




	}

