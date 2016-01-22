import java.util.Scanner;
public class Pattern {

	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter the number: ");
		int num = input.nextInt();
		
		int x [] = new int[num];
		
		for(int i=0; i<x.length; i++){
			for(int j=0 ;j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
