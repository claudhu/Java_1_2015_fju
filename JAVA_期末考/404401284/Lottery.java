

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int lottery = (int) (Math.random() * 900 + 100);

		System.out.print("Please enter the number: ");
		int guess = input.nextInt();
		System.out.print("The random number is:  " + lottery);
		
		int lottery1 = lottery / 100 ;
		int lottery2 = (lottery / 10) % 10 ;
		int lottery3 = lottery % 100 ;
		int guess1 = guess / 100 ;
		int guess2 = (lottery / 10) % 10 ;
		int guess3 = guess % 100 ;
		

		if (guess == lottery)
			System.out.println("You win the first price, money award is 10000");
		else if ((lottery1 == guess2 && lottery2 == guess3 && lottery3 == guess1) || (lottery1 == guess3 && lottery2 == guess1 && lottery3 == guess2) || (lottery1 == guess1 && lottery2 == guess3 && lottery3 == guess2))
			System.out.println("You win the second price, money award is 8000");
		else if (lottery2 == guess2 && lottery3 == guess3)
			System.out.println("You win the third price, money award is 6000");
		else
			System.out.print("\nSorry!");



	}
}
