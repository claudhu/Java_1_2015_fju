import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
				
		System.out.println("Your sqaure looks like: ");

		for(int i = 0 ; i < num ; i++){
			for(int j = 0; j <= i ; j++){
				System.out.print("*");
				
				
			}
			
			for(int k = 1; k < num-i ; k++){
				System.out.print("#");
				
				
			}
			
			
			System.out.println("");

		}
		
		
		System.out.print("");

	}

}
