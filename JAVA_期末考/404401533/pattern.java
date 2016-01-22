import java.util.Scanner;


public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int n = input.nextInt();
		System.out.println("Your square looks like:");
		for(int i = 1 ; i<=n ; i++){
			for(int j =0 ; j<i ; j++)
				System.out.printf("*");
				
			
			for(int j =n ; j>i ; j--)
					System.out.printf("#");
					System.out.println();
	
		}
				
				}
		
		


}
