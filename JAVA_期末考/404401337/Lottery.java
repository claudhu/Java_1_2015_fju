
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number¡G");
		String guess = input.nextLine();
		
		String lottery = ""+(int)(Math.random()*10)
				+(int)(Math.random()*10)
				+(int)(Math.random()*10);
		System.out.print("The random number is¡G"+lottery);	
		
		char lotterydigit1 = lottery.charAt(0);
		char lotterydigit2 = lottery.charAt(1);
		char lotterydigit3 = lottery.charAt(2);
		
		char guessdigit1 = guess.charAt(0);
		char guessdigit2 = guess.charAt(1);
		char guessdigit3 = guess.charAt(2);
		
		if(lotterydigit1 ==guessdigit1 
				&&lotterydigit2==guessdigit2
				&&lotterydigit3==guessdigit3){
			System.out.println("You win the prize,money award is 10000");
		}
		else if(lotterydigit1 == guessdigit1 
				&& lotterydigit2 == guessdigit3 
				&& lotterydigit3 == guessdigit2
				
				||lotterydigit1==guessdigit2
				&&lotterydigit2==guessdigit3
				&&lotterydigit3==guessdigit1
				
				||lotterydigit1==guessdigit2
				&&lotterydigit2==guessdigit1
				&&lotterydigit3==guessdigit3

				||lotterydigit1==guessdigit3
				&&lotterydigit2==guessdigit2
				&&lotterydigit3==guessdigit1){
			System.out.println("You win the prize,money award is 8000");
		}
		else if(lotterydigit2==guessdigit2
				&&lotterydigit3==guessdigit3){
			System.out.println("You win the prize,money award is 6000");
		}
		else{
			System.out.print("\nSorry!");
	    }
		input.close();
		}

}
