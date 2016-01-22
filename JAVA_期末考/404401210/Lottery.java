

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lottery = "" 
		        + (int)(Math.random() * 10) 
				+ (int)(Math.random() * 10) 
				+ (int)(Math.random() * 10);
		System.out.println(lottery);
		char lotteryd1 = lottery.charAt(0) ;
		char lotteryd2 = lottery.charAt(1) ;
		char lotteryd3 = lottery.charAt(2) ;
		System.out.println("Please enter the number (3 ¦ì¼Æ) ");
		Scanner input = new Scanner(System.in) ;
		String guess = input.nextLine() ;
		
		char guess1 = guess.charAt(0) ;
		char guess2 = guess.charAt(1) ;
		char guess3 = guess.charAt(2) ;
		
		
		if(guess.equals(lottery))
			System.out.println(" The random number is " + lottery +
					"\nYou win the first prizs , money award is 10,000 !");
		else if(  guess1 == lotteryd2 && guess2 == lotteryd3 && guess3 == lotteryd1
				||guess1 == lotteryd3 && guess2 == lotteryd1 && guess3 == lotteryd2)
			System.out.println(" The random number is " + lottery +
					"\nYou win the second prizs , money award is 8,000 !");
		else if(guess2 == lotteryd2 && guess3 == lotteryd3)
			System.out.println(" The random number is " + lottery +
					"\nYou win the third prizs , money award is 6,000 !");
		else
			System.out.println(" The random number is " + lottery +
					"\nSorry!");
			

	}

}
