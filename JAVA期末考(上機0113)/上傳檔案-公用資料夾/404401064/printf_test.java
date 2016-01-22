

import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter four number : ");
		int [] array = new int [4];
		
		for(int i = 0 ; i <array.length ; i++){
			array[i] = input.nextInt();
		}
		System.out.print("enter four number : ");
		int [] array1 = new int [4];
		
		for(int i =0 ; i < array1.length ; i++){
			array1[i] = input.nextInt();
		}
		System.out.printf("%6d   %5d  %2d  %7d" , array[0] , array[1] , array[2] , array[3]);
		System.out.println();
		System.out.printf("%2d   %5d  %6d  %7d" , array1[0] , array1[1] , array1[2] , array1[3]);
		
		

	}

}
