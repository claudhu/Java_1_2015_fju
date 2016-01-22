

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a numbers: ");
		int number = input.nextInt();
		
		System.out.println("Your square looks like: ");
		
		for (int i = 1 ; i <= number ; i++) {
			for (int j = 1 ; j <= number ; j++) {
				
				if (j <= i)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.print("\n");

			
		}
			

		
		
	}

}
