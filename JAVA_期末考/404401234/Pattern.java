import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int a = input.nextInt();
		for(int i = 0; i<a ; i++){
			for(int j = 0 ; j<=i ;j++){
				System.out.print("*");
			}
			for(int k = a-1 ; k>i ;k--){
				System.out.print("#");
			}
			System.out.println();
			
		}

	}

}
