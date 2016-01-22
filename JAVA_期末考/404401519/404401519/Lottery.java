
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 100 and 999");
		int num=input.nextInt();
		int k =(int)(Math.random()*1000);		
		System.out.println("The random number is : "+k);
		if(num==k)
			System.out.println("You win the first peize, money award is 10000");
		else if((num-k)/100 == 1)
			System.out.println("You win the third peize, money award is 6000");
		else 
			System.out.println("Sorry !");
			
		
	}

}
