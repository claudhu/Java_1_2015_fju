
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a number :");
		int number = input.nextInt();
		for(int i = 1 ; i <= number ; i++){
			System.out.println();
			
			for(int j = 0 ; j < i ; j++){
				System.out.print("*");}
		
				for(int k = 0 ; k < number-i ; k++){
					System.out.print("#");
				}
			
		}
	}

}
