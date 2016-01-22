

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("piease enter a numbers:");
		int a = input.nextInt();
		System.out.println("your square looks like");
		for(int i =0;i<a;i++){
			for(int k =0;k<i+1;k++){
				System.out.print("*");
			}
			for(int j =a-1;j>i;j--){
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
