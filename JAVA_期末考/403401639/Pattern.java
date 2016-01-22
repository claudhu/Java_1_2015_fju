import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter a nembers : ");
		int n = input.nextInt();
		System.out.printf("Your square looks like:\n");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("*");
			}
			for(int k=n-i; k>0; k--){
				System.out.printf("#");
			}
			
			System.out.printf("\n");
		}

	}

}
