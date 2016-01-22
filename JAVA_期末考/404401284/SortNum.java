

import java.util.Arrays;
import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the three numbers: ");
		int[] arr = new int[3];

		for (int i = 0; i < arr.length - 1; i++) {
			int currentMin = arr[i];
			int currentMinIndex = i;

			for (int j = 0; j < arr.length; j++) {
				if (currentMin > arr[j]) {
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}

			if (currentMin != arr[i]) {
				arr[i] = arr[currentMinIndex] ;
				currentMin = arr[i] ;
				arr[i] = currentMin ;
			}

		}
		
		System.out.println("The sorting result is as follows: ");
		System.out.print(arr);

	}

}
