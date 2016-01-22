

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int array[] = { a, b, c };
	 
		for (int n = 1; n < array.length; n++) {
			for (int j = 1; j < array.length; j++) {
				if (array[n] > array[j]) {
					int x = array[n];
					array[n] = array[j];
					array[n] = x;
				}
				
					System.out.print("The sorting result is as follows:");
					for (int i = 1; i < array.length; i++){
					System.out.printf( "%2d", array[i]);
			}
		}
	}

	}}