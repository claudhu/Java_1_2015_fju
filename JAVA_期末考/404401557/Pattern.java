

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a numbers :");
		int n = input.nextInt();
		for (int i = 0; i<=n ; i++){
			for(int j = 1; j<=i; j++)
				System.out.print("*");
			
		}
		 
		for (int g =0 ;g<=n;g++){
			for (int k = n-1;k>=0;k--)
				System.out.print("#");
		}
			
		}
		

	}


