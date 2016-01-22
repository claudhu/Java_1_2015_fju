import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        
        //print
        System.out.println("Your square looks like: ");
        for ( int i = 1 ; i <= n ; i ++){
        	for ( int j = 1 ; j <= i ; j ++){
        		System.out.print(" * ");
        	}
        	
        	for ( int a = n-1 ; a >= i ; a --){
        			System.out.print(" # ");
        	}
        	
        	System.out.println();
        }
	}

}
