

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("please  enter a numbers:");
		int num = input.nextInt();
		
		for(int i=0;i<=num-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");}
				for(int k=num-1;k>i;k--){
					System.out.print("# ");
			}
				System.out.println();
		} 
		

	}

}
