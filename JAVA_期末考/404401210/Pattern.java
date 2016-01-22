

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter a number : ");
		int n = input.nextInt();
		System.out.println("Your square looks like : ");
		for(int i = 0 ; i < n ; i ++){
			for(int j = 0 ; j <= i ; j ++){
				System.out.printf("*");
			}
			for(int j = n-i ; j > 1 ; j--){
				System.out.printf("#");
			}

			System.out.printf("\n");
		}

	}

}
