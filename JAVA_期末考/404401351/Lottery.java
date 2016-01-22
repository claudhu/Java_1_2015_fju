import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.println("Please rnter the number:");
	    int guess=input.nextInt();
	    int lottery=(int)(Math.random()*1000+100);
	    if(lottery>999){
	    	lottery=(int)(Math.random()*1000+100);
	    }
	    System.out.println("The random number is:"+lottery);
	    int a=lottery%10;//­Ó
		int b=(lottery/10)%10;
	    int c=(lottery/100)%10;
	    
	    int x=guess%10;//­Ó
		int y=(guess/10)%10;
	    int z=(guess/100)%10;
	    if(a==x&&b==y&&c==z){
	    System.out.println("You win the first prize,money award is 10000");
	    }
	    else if(a==x&&b==z&&c==y){
		    System.out.println("You win the second prize,money award is 8000");
		    }
	    else if(a==y&&b==x&&c==z){
	    System.out.println("You win the second prize,money award is 8000");
	    }
	    else if(a==y&&b==z&&c==x){
		    System.out.println("You win the second prize,money award is 8000");
		    }
	    else if(a==z&&b==y&&c==x){
		    System.out.println("You win the second prize,money award is 8000");
		    }
	    else if(a==z&&b==x&&c==y){
		    System.out.println("You win the second prize,money award is 8000");
		    }
	    else if(a!=x&&b==y&&c==z){
	    	System.out.println("You win the third prize,money award is 6000");
	    }
	    else{
	    	System.out.println("Sorry!");
	    }
	    
	    
	    
	}

}
