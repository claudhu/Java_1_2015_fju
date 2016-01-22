

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=(int)(100+Math.random()*1000);
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number between100&999:");
		int j=input.nextInt();
		System.out.println("the random number is:"+k);
		if(j==k)
			System.out.println("You win the prize,money award is 10000");
		else if(j%10==k/100||j%10==(k/10-k/100)&&(j/10-j/100)==k/100)
			System.out.println("You win the prize,money award is 8000");
		else if((j/10-j/100)==(k/10-k/100)&&j%10==k%10)
			System.out.println("You win the prize,money award is 6000");
		else
			System.out.println("You don't win the prize");
		
		
		input.close();
		
	}

}
