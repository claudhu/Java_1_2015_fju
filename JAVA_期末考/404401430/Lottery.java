

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = (int)(100+Math.random()*1000);
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Please enter the number: ");int i =input.nextInt();
		
		System.out.print("The random number is: "+j);
		
		if(i == j){
			System.out.print("You win the first prize, money award is 10000");}
		else if(i/100!=j/100 && i/10-(i/100)*10==j/10-(j/100)*10 && i%10==j%10){
			System.out.print("You win the third prize, money award is 6000");}
		else if((i/100==j/100 && i/10-(i/100)*10==j%10 && i%10==j/10-(j/100)*10)||(i%10==j%10 && i/100==j/10-(j/100)*10) && i/10-(i/100)*10==j/100)||(i/100==j%10 && i/10-(i/100)*10==j/100 && i%10==j/10-(j/100)*10)||(i/100==j/10-(j/100)*10 && i/10-(i/100)*10==j%10 && i%10 == j/100)||(i/100==j%10 && i/10-(i/100)*10==j/10-(j/100)*10 && i%10==j/100));{
		     System.out.print("You win the second prize, money award is 8000");}
		 

	}

}
