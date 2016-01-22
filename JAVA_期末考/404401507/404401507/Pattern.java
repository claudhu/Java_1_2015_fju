import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		int num1= number +1;
		int num2 = number -1;
		System.out.println("Your square looks like");


		for (int i = 1; i < num1; i++) {
			for (int j = 1; j < i +1 ; j++) {
				System.out.print("*");

			}
			for (int k = i -1; k < num2; k++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}

}
