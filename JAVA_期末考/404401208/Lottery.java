import java.util.Scanner;


public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input =new Scanner(System.in);
    System.out.println("Please enter the number : ");
	String answer ="" + (int)(Math.random()*10) + (int)(Math.random()*10) +(int)(Math.random()*10);
	System.out.println("The random number is : " + answer);
    String guess = input.nextLine();
    
    
    char answerDigit1 = answer.charAt(0);
    char answerDigit2 = answer.charAt(1);
    char answerDigit3 = answer.charAt(2);
    char guessDigit1 = guess.charAt(0);
    char guessDigit2 = guess.charAt(1);
    char guessDigit3 = guess.charAt(2);
    
    if(answerDigit1 == guessDigit1 && answerDigit2 == guessDigit2 && answerDigit3 == guessDigit3){
    	System.out.println("You win the first prize, money award is 10000");}
    else if(answerDigit1 == guessDigit2 && answerDigit2 == guessDigit3 && answerDigit3 == guessDigit1
          ||answerDigit1 == guessDigit3 && answerDigit3 == guessDigit2 && answerDigit2 == guessDigit1){
    	System.out.println("You win the second prize, money award is 8000");}
    else if(answerDigit2 == guessDigit2 && answerDigit3 == guessDigit3){
    	System.out.println("You win the third prize, money award is 6000");}
    else
    	System.out.println("Sorry, you didn't win the prize");
    	
	}

}
