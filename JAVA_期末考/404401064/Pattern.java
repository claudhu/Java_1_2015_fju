
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a numbers :");
		int n = input.nextInt();
		for(int i = 1 ; i <= n ; i++){
			System.out.println();
			
			for(int j = 0 ; j < i ; j++){
				System.out.print("*");
				}
			
				
				for(int k = 0 ; k < n-i ; k++){
					System.out.print("#");
				}
			}
		}
		

	}


