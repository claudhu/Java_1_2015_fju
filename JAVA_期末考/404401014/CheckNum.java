import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.printf("Please enter 9 digits: ");
		String number = input.nextLine();
		int array[] = new int[9];
		for (int i=0; i<array.length; i++)
			array[i]=Character.getNumericValue(number.charAt(i));
		int totalOfNum10=0;
		for (int j=0; j<array.length; j++)
			totalOfNum10+=array[j]*(j+1);
		int num10=totalOfNum10%11;
		if (num10==10) {
			System.out.printf("The checksum is: X\n");
			System.out.printf("The ISBN is: %sX", number);
		}
		else {
			System.out.printf("The checksum is: %d\n", num10);
			System.out.printf("The ISBN is: %s%d", number, num10);
		}
		
	}
}
