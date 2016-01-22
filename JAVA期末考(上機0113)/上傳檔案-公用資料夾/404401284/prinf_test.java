import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enyer 8 numbers: ");
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		int four = input.nextInt();
		int five = input.nextInt();
		int six = input.nextInt();
		int seven = input.nextInt();
		int eight = input.nextInt();

		System.out.printf("%10d%10d%10d%10d\n",one,two,three,four);
		System.out.printf("%10d%10d%10d%10d",five,six,seven,five);
		
	
	}

}
