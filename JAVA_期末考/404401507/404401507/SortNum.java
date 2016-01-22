import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers :");

		int[] list = new int[3];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();

		}
		System.out.println("The sorting result is as follows :");
		for (int i = 0; i < list.length; i++) {
			int currentMin = list[0];
			int currentMinIndex = i;

			for (int j = 0 + i; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}

			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;

			}
			System.out.printf("%1d\t", list[i]);
		}

	}
}
