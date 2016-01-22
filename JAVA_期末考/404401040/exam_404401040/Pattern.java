
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a numbers: ");
    int row = input.nextInt();
    
    System.out.print("Your square looks like: ");
    for(int i = 0; i <= row; i++){        //row
    	System.out.println(" ");
    	
    	for(int j = 1; j < i; j++){
    		System.out.print("*");    //col1
    	
    	for(int k = 0; k > 0+i; k--){
    		System.out.print("#");   //col2
    	}
    	}
    	}
    
	}
	}


