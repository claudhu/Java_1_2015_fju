
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the number:");
    int num = input.nextInt();
    int randomnum = (int)(100 +Math.random()*1000);
    
    System.out.println("The random number is :" + randomnum);
    
    if ( num == randomnum )
    	System.out.println(" You win the first prize , money award is 10000");
    
    else 
    	System.out.println("Sorry!");
	} 

}
