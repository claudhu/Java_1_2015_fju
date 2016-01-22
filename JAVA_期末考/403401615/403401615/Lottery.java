import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int lottery = (int)(Math.random()*1000);
		System.out.println("Please enter the number: ");
		int guess = sc.nextInt();
		
		int lotterydigit1 = lottery / 10 ;
		int lotterydigit2 = lottery % 10 ;
		int lotterydigit3 = lottery % 10 ; 
		
		int guessdigit1 = guess / 10;
		int guessdigit2 = guess % 10;
		int guessdigit3 = guess % 10;
		
		System.out.println("The random number is : " + lottery);
		if(guess == lottery )
			System.out.println("You win the first prize, money award is 10000");
		else if (guessdigit1 == lotterydigit2 && guessdigit2 == lotterydigit3 && guessdigit3 == lotterydigit1)
			System.out.println("You win the second prize, money award is 8000");
		else if (guessdigit1 == lotterydigit1 || guessdigit1 == lotterydigit2 || guessdigit1 == lotterydigit3
				|| guessdigit2 == lotterydigit1 || guessdigit2 == lotterydigit2 || guessdigit2 == lotterydigit3
				|| guessdigit3 == lotterydigit1 || guessdigit3 == lotterydigit2 || guessdigit3 == lotterydigit3)
			System.out.println("You win the third prize, money award is 6000");
		else
			System.out.println("Sorry! ");

	}

}
