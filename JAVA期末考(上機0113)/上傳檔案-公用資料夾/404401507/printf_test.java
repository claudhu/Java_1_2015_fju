import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 1000 10000 10 20000 2 2000 20000

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = input.nextInt();

		System.out.print("Enter the third number:");
		int num3 = input.nextInt();

		System.out.print("Enter the fourth number:");
		int num4 = input.nextInt();

		System.out.print("Enter the fifth number:");
		int num5 = input.nextInt();

		System.out.print("Enter the suxth number:");
		int num6 = input.nextInt();

		System.out.print("Enter the seventh number:");
		int num7 = input.nextInt();

		System.out.print("Enter the eighth number:");
		int num8 = input.nextInt();
		
		System.out.printf("%5d %5d %5d %5d \n", num1, num2, num3, num4);
		System.out.printf("%5d %5d %5d %5d ", num5, num6, num7, num8);

	}

}
