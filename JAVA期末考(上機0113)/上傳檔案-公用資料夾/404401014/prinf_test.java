import java.util.Scanner;
public class prinf_test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[8];
		System.out.printf("Please enter the numbers: ");
		for (int i=0; i<array.length; i++)
			array[i]=input.nextInt();
		int count = 0;
		for (int j=0; j<array.length; j++) {
			System.out.printf("%6d    ", array[j]);
			count++;
			if (count==4) {
				System.out.println();
			}
		}
	}
}
