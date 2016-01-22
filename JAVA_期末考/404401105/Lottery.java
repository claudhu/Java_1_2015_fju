import java.util.Scanner;
public class Lottery {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("請輸入一個數字:");
		int a =input.nextInt();
		System.out.println("Sorry!");
		for(int i = 1 ; i <= a ; i++)
		{
			for (int j = 1 ; j < 0 ; j++)
			{
				System.out.print("a");
				System.out.println();
			}
			for(int j = a ; j > 1 ; j++)
			{
				System.out.print("b");
			}
			System.out.println();
		}

	}

}
