import java.util.Scanner;
public class Lottery {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter the number(100~999) : ");
		String guess = input.nextLine();
		
		
		String number = ""+(int)(1+Math.random()*9)+(int)(Math.random()*10)+(int)(Math.random()*10);
		System.out.print("the random number : "+number);
		System.out.println();

		
		
		char guess1 = guess.charAt(0);
		char guess2 = guess.charAt(1);
		char guess3 = guess.charAt(2);
		
		char number1 = number.charAt(0);
		char number2 = number.charAt(1);
		char number3 = number.charAt(2);
		
		if(number1==guess1&&number2==guess2&&number3==guess3){
			System.out.print("you win the price, money award is: 10000");
		}
		
		//1-1.2-3.3-2  1-2.2-1.3-3  1-2.2-3.3.1  1-3.2-1.3-2  1-3.2-2-3-1
		else if(guess1==number1&&guess2==number3&&guess3==number2||guess1==number2&&guess2==number1&&guess3==number3||guess1==number2&&guess2==number3&&guess3==number1||
				guess1==number3&&guess2==number1&&guess3==number2||guess1==number3&&guess2==number2&&guess3==number1){
			
			System.out.print("you win the price, money award is: 8000");
			
		}
		
		else if(number1!=guess1 && number2==guess2 && number3==guess3){
			System.out.print("you win the price, money award is: 6000");
		}
		
		else
			System.out.println("sorry");
	
	}
}
