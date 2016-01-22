import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a numbers:");
        int a = input.nextInt();
        System.out.println("Your square looks like:");
        for(int i = 1 ; i<=a ; i++ ){
        	for(int x=1 ; x<=i ; x++){
        		System.out.print("*");        	    
        	}
        	for(int j=a ; j > i ; j--){
        		System.out.print("#");
        	}
        	System.out.println();
        }
	}

}
