import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		
		 int random,num;
		
		 
		 
		 Scanner input = new Scanner(System.in);
			
		 System.out.printf("Please enter a number:");
			
	    	 
	    	num = input.nextInt();
	     
	     
	     
	     do
	     {
	     random = (int)(Math.random()*1000);
	     }
	     while (random <= 100);
	     
	   

	     System.out.printf("The random number is:%d\n",random);
	     
	    
	     if (random==num)
	    	 
	    	 System.out.printf("You win the biggest prize,money award is 10000");
	     
	     else if ((random%100)==(num%100))
	    	 
	    	 System.out.printf("You win the third prize,money award is 6000");
	     
	}

}
