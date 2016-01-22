

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int row=input.nextInt();
		System.out.println("your square looks like:");
		for(int i=0;i<=row;i++){
			for(int j=0;j<=i;j++){ 
			System.out.print("* ");
			}
	        for(int k=row-1;k>=i;k--){
	        	System.out.print("# ");
	        }
	        	
	        System.out.println();
		
		
		}
	       input.close();
	
	}
}
