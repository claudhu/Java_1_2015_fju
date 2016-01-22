

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lottery =""+(int)(Math.random()*10)+(int)(Math.random()*10)
				+(int)(Math.random()*10);
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number: ");
		String guess = input.nextLine();
		
		char guess1 = guess.charAt(0);
		char guess2 = guess.charAt(1);
		char guess3 = guess.charAt(2);

		char lottery1 = lottery.charAt(0);
		char lottery2 = lottery.charAt(1);
		char lottery3 = lottery.charAt(2);
		
		System.out.println("the random number is: "+lottery);
		if(guess.equals(lottery))
			System.out.println("you win the first prize,money award is 10000");
		else if((guess1 == lottery1 && guess2 == lottery3 && guess3 == lottery2)
				||(guess1 == lottery2 && guess2 == lottery1 && guess3 == lottery3)
				||(guess1 == lottery2 && guess2 == lottery3 && guess3 == lottery1)
				||(guess1 == lottery3 && guess2 == lottery1 && guess3 == lottery2)
				||(guess1 == lottery3 && guess2 == lottery2 && guess3 == lottery1) )
			System.out.println("you win the second prize,money award is 8000");
		else if(guess2 == lottery2 && guess3 == lottery3)
			System.out.println("you win the third prize,money award is 6000");
		else System.out.println("sorry!");

	}

}
