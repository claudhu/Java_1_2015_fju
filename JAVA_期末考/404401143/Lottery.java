import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String num1=""+(int)((Math.random()*9)+1)+((int)(Math.random()*10))+((int)(Math.random()*10));
		System.out.println("Please enter the number:");
		
		String guess1=input.nextLine();
		
		System.out.println("The random number is: "+num1);
		if(num1.equals(guess1)){
			System.out.println("You win the first prize,money award is 10000");
		}
	    if(num1.charAt(0)==guess1.charAt(1)&&num1.charAt(1)==guess1.charAt(2)&&
	    		num1.charAt(2)==guess1.charAt(0)||
	    		num1.charAt(0)==guess1.charAt(2)&&num1.charAt(1)==guess1.charAt(0)&&
	    	    		num1.charAt(2)==guess1.charAt(1)){
	    	System.out.println("You win the first prize,money award is 8000");
	    }
	   if(num1.charAt(1)==guess1.charAt(1)&&num1.charAt(2)==guess1.charAt(2)){
		   System.out.println("You win the first prize,money award is 6000");
	   }
	   else
	   {
		   System.out.println("Sorry!");
	   }
	   
	}

}
