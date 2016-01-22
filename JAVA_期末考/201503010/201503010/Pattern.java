import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		System.out.print("Please enter a numbers : ") ;
		int a = input.nextInt() ;
		
		for(int i=1; i<=a; i++) {

			for(int j=1; j<=a; j++) {
				if(i >= j) 
					System.out.print("*") ;
				else
					System.out.print("#") ;

			}
			
			System.out.println(" ") ;
		}
	}

}
