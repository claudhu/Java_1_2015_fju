import java.util.Scanner;       
public class Lottery {  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num =100+ (int)( Math.random()*1000);
	
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number: ");
   
    int a = input.nextInt();
    System.out.println("The random number is: "+ num);
    if(a == num){
    	System.out.println("You win the first prize, money award is 10000!!");
    }
    else if (num%100 == a%100 && num/100 != a/100 )
    System.out.println("You win th third prize,money award is 6000");
    
    else if(num%100 != a%100 && num/100 != a/100 && num%10 != a%10 && num/10 != a/10 || num/100 == a/100 && num%100 != a%100 || num%10 == a%10 && num/100 == a/100 && num!=a ||num%100 != a%100 && num%10 == a%10 )
    System.out.println("Sorry!");
    else
    System.out.println("You win the second prize, money award is 8000~"); 
    
	}}    
   
		
		
		
    
	


