import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		System.out.println("Please enter 8 numbers: ") ;
		
		int[] list = new int[8] ;
		for(int i=0; i<=8; i++) {
			list[i] = input.nextInt();
			
			if( i==3 ) {
				System.out.printf("%10d\n",list[i]) ;
			}
			else 
				System.out.printf("%10d",list[i]);
		}
	}

}
