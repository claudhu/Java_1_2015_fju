import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the number: ");
		int number = input.nextInt();

		int lottery = (int) (Math.random() * 900 + 100);
		System.out.println("The random number is: " + lottery);

		int num1 = number / 100;
		int num2 = (number / 10) % 10;
		int num3 = number % 10;

		int lott1 = lottery / 100;
		int lott2 = (lottery / 10) % 10;
		int lott3 = lottery % 10;

		if (num1 == lott1 && num2 == lott2 && num3 == lott3) {
			System.out.print("You win the first prize, money award is 10000");
		}

		else if (num1 == lott1 && num2 == lott3 && num3 == lott2
			   ||num1 == lott2 && num2 == lott1 && num3 == lott3
			   ||num1 == lott2 && num2 == lott3 && num3 == lott1
			   ||num1 == lott3 && num2 == lott1 && num3 == lott2
			   ||num1 == lott3 && num2 == lott2 && num3 == lott1) {
			System.out.print("You win the second prize, money award is 8000");
		} else if (num1 != lott1 && num2 == lott2 && num3 == lott3) {
			System.out.print("You win the third prize, money award is 6000");
		}
	}

}
