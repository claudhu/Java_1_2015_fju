import java.util.Scanner;


public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int rnd = (int)(Math.random()*900+100);
     System.out.print("Please enter the number :");
     int num = input.nextInt();
     System.out.println("The random number is  :"+rnd);
     
     if (num==rnd){
    	 System.out.println("You win the first prize,money award is 10000");
     }
     if (num%100==rnd%100){
    	 System.out.println("You win the third prize,money award is 6000");
     }
     else
    	 System.out.println("Sorry!");
    	
     
	}

}
