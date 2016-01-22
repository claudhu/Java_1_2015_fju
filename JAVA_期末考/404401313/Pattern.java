
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=n;k>i;k--){
				System.out.print("#");
			}
			System.out.println();
		}
		
		

	}

}
