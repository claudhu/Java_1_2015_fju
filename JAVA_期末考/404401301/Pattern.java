
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a numbers :");
		int n = input.nextInt();
		
		System.out.print("Your square looks like : ");
		for(int i = 0 ; i<=n ;i++){
			System.out.println("*"+"#");
			
			
			for(int j = 1 ; j<=i ; j++){
				System.out.print("*"+"#");
					
			}
			
	
		}

	}

		}
