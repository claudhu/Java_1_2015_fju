
import java.util.Scanner;
public class Loterry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("Please Enter the number :");
		String guessnumber = "" + (int)input.nextInt();
		String lotterynumber = "" + (int)(100 + Math.random()*900);
		System.out.println("The random number is :" + lotterynumber) ; 
		
		if(guessnumber == lotterynumber){
			System.out.println("You win the first prize, money award is 10000");
		}
		if((guessnumber.charAt(0) == lotterynumber.charAt(1)||
		   guessnumber.charAt(0) == lotterynumber.charAt(2))&&
		   (guessnumber.charAt(1) == lotterynumber.charAt(0)||
		   guessnumber.charAt(1) == lotterynumber.charAt(2))&&
		  ( guessnumber.charAt(2) == lotterynumber.charAt(0)||
		   guessnumber.charAt(2) == lotterynumber.charAt(1))){
			System.out.println("You win the Second prize, money award is 8000");}
		if(guessnumber.charAt(0) != lotterynumber.charAt(0)&&
		   guessnumber.charAt(1) == lotterynumber.charAt(1)&&
		   guessnumber.charAt(2) == lotterynumber.charAt(2)){
			System.out.println("You win the Third prize, money award is 6000");
		}
	}

}
