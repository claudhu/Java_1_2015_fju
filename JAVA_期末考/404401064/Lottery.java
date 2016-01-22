
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number:");
		
		String guessnumber = "" + (int)input.nextInt();
		String lotterynumber ="" + (int)(100 + Math.random()*900);
		System.out.print("The random number is: " + lotterynumber);
		
		if(guessnumber == lotterynumber){
			System.out.print("You win the first prize,money award is 6000");
		}
		if((guessnumber.charAt(0) == lotterynumber.charAt(1)||
		    guessnumber.charAt(0) == lotterynumber.charAt(2))&&
		   (guessnumber.charAt(1) == lotterynumber.charAt(0)||
		    guessnumber.charAt(1) == lotterynumber.charAt(2))&&
		   (guessnumber.charAt(2) == lotterynumber.charAt(0)||
		    guessnumber.charAt(2) == lotterynumber.charAt(1))){
		    	System.out.println("You win the second prize , money award is 8000");
		    if(guessnumber.charAt(0) != lotterynumber.charAt(0)&&
		    guessnumber.charAt(1) == lotterynumber.charAt(1)&&
		    guessnumber.charAt(2) == lotterynumber.charAt(2)){
		    System.out.println("You win the thrid prize , money award is 10000");

	}
	}
}
}