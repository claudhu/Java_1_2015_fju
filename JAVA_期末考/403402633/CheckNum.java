import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 9 digits: ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();
		int check = (d1 + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
		if(check == 10)
			System.out.printf("The ISBN is: %d%d%d%d%d%d%d%d%dX", d1, d2, d3, d4, d5, d6, d7, d8, d9);
		else
			System.out.printf("The ISBN is: %d%d%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9, check);
	}
}
