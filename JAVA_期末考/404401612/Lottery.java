import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int ans = (int)(Math.random() * 900) + 100 ;
        //System.out.println(ans);
        
        int num1 = ans / 100 ;
        int num2 = (ans / 10) % 10 ;
        int num3 = ans % 100 % 10; 
        
        //Enter number
        System.out.println("Please enter the number: ");
        int guess = input.nextInt();
        
        int g1 = guess / 100 ;
        int g2 = ( guess / 10) % 10 ;
        int g3 = guess % 100 % 10 ;
        
        //Ans
        System.out.println("The random number is: " + ans);
        
        if ( ans == guess )
        	System.out.println("You win the first prize , money award is 10000");
        else if ( ( g1 == num1 && g2 == num3 && g3 == num2) || ( g1 == num2 && g2 == num1 && g3 == num3)
        		|| ( g1 == num3 && g2 == num2 && g3 == num1) || ( g1 == num3 && g2 == num1 && g3 == num2) ||
        		( g1 == num2 && g2 == num3 && g3 == num1) ) {
        	System.out.println("You win the second prize , money award is 8000");     	
        }
        else if ( ans != guess && ( g2 == num2 && g3 == num3) ){ 
            System.out.println("You win the third prize , money award is 6000");          	
	    }
        else
        	System.out.println("Sorry!");

}
}