
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the number : ");
		String num = input.nextLine();
		
		String lottery = "" + (int)(Math.random()*9 + 1) + (int)(Math.random()*10) + (int)(Math.random()*10);
		System.out.println("The random number is : " + lottery);
		
		char num1 = num.charAt(0);
		char num2 = num.charAt(1);
		char num3 = num.charAt(2);
		char lottery1 = lottery.charAt(0);
		char lottery2 = lottery.charAt(1);
		char lottery3 = lottery.charAt(2);
		
		if (num.equals(lottery))
			System.out.print("You win the first prize,money award is 10000");
		else if (num1 != lottery1 && num2 == lottery2 && num3 == lottery3)
			System.out.print("You win the third prize,money award is 6000");
		else if ((num1 == lottery2 || num1 == lottery3 || num1 == lottery1) && (num2 == lottery1 || num2 == lottery3 || num2 == lottery2) && (num3 == lottery1 || num3 == lottery2 || num3 == lottery3))
			System.out.print("You win the second prize,money award is 8000");
		else
			System.out.print("Sorry!");

	}

}
