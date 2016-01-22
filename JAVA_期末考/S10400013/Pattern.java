import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		int a;
		
     Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter a number:");
		
		
		a = input.nextInt();
		
		System.out.printf("Your square looks like:");
		
		for (int i = 0 ; i < a ;i++){
			System.out.println(" ");
		for (int j = 0 ; j <= i ; j++)
			System.out.printf("*");
		for (int k = 0 ;k < a-i-1 ;k++)
			System.out.printf("#");
			

	}

}
}