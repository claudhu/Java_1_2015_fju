

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer = "  "+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10);
		String guess = input.nextLine();
		
		int answer1 = (int)answer.charAt(0);
		int answer2 = (int)answer.charAt(1);
		int answer3 = (int)answer.charAt(2);
		int guess1 = (int)guess.charAt(0);
		int guess2 = (int)guess.charAt(1);
		int guess3 = (int)guess.charAt(2);
		
		if(answer==guess){
			System.out.println("You win the first prize,money award is 10000");
		}
		else if (answer1==guess2&&answer2==guess3&&answer3==guess1){
			System.out.println("You win the second prize,money award is 8000");
		}
		else if (answer1==guess3&&answer2==guess1&&answer3==guess2){
			System.out.println("You win the second prize,money award is 8000");
		}
		else if (answer2==guess2&&answer3==guess3){
			System.out.println("You win the third prize,money award is 6000");
		}
		else 
			System.out.println("Sorry!");
	}

}
