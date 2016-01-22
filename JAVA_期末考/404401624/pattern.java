
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter an integer:");
    int num = input.nextInt();
    System.out.println("Your square looks like:");
    
    for (int i = 0 ; i <= num ; i ++){    	
    	for (int j = 1 ; j<=i ; j++){
    			System.out.print("* ");
    		for (int k = num ; k >= k+j ; k++){
    			System.out.print("# ");
    		}
    	}
    	System.out.println("");
    		
	}

}
}