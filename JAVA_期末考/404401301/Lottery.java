import java.util.Scanner;
public final class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number :");
		String guess = input.nextLine();
		
		
		String lottery =( ""+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10));
		System.out.println("The random number is : " + lottery);
		
		
		char lottery1 = lottery.charAt(0);
		char lottery2 = lottery.charAt(1);
		char lottery3 = lottery.charAt(2);
		
		
		char guess1 = guess.charAt(0);
		char guess2 = guess.charAt(1);
		char guess3 = guess.charAt(2);
		
		
		if(guess1==lottery1 && guess2==lottery2 && guess3==lottery3)
			System.out.println("You win the third prize,money award is 6000");
		else if(  guess1==lottery2||guess1==lottery3 
				&&guess2==lottery1||guess2==lottery3
				&&guess3==lottery1||guess3==lottery2)
			System.out.println("數字對了但順序不對，獎金8000");
		else if(guess2==lottery2 && guess3==lottery3 && guess1 != lottery1)
			System.out.println("末兩位數字順序和號碼都對，獎金6000");
		else
			System.out.println("Sorry!");
			
		
		
		
	}

}
