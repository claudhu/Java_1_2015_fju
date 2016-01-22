import java.util.Scanner;
public class CheckNum {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Please enter 9 digits:");
		int number =input.nextInt();
		int d1 = number/1000000000;
		int d2 = number/10000000%10;
		int d3 = number/1000000%10;
		int d4 = number/100000%10;
		int d5 = number/10000%10;
		int d6 = number/1000%10;
		int d7 = number/100%10;
		int d8 = number/10%10;
		int d9 = number%10;
		int d10= (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if (d10==10)
		{
			System.out.println("The checksum is: x");
			System.out.print("The ISBN is:" + number + "x");
		}
		else
		{
			System.out.println("The checksum is:" + d10);
			System.out.printf("The ISBN is:%10d%d" , number , d10);
		}
		if(d10==10)
		{
			System.out.println("The checksum is:" + d10);
			System.out.printf("The ISBN is:%10d%d" , number , d10);
		}

	}

}
