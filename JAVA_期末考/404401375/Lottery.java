import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the numbers : ");
		
		int num = input.nextInt();
		int a = (int) (Math.random()*1000);
		System.out.println("The random number is "+a);
		if(num == a)
			System.out.print("You win the first prise , money award is 10000");
		else
			System.out.println("Sorry!");
		
	}

}
