
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
   System.out.print("Please enter the number: ");
    int GuessNum0 = input.nextInt();
    int GuessNum1 = input.nextInt();
    int GuessNum2 = input.nextInt();
    
    System.out.print("The random number is: ");
    int LotteryNum0 = (int)(Math.random()*100);
    int LotteryNum1 = (int)(Math.random()*100);
    int LotteryNum2 = (int)(Math.random()*100);
    
    

    for(int i=1;i <= 1000;i++){
    	if(GuessNum0 == LotteryNum0 && GuessNum1 == LotteryNum1 && GuessNum2 == LotteryNum2)
    		System.out.print("You win the third prize, money award is 10,000");
    	else if(GuessNum0 == LotteryNum0 || GuessNum1 == LotteryNum1 || GuessNum2 == LotteryNum2)
    		System.out.print("You win the third prize, money award is 8,000");
    	else if(GuessNum1 == LotteryNum2 ||
    			GuessNum1 == LotteryNum0 ||
    			GuessNum2 == LotteryNum1 ||
    			GuessNum2 == LotteryNum0  )
    		System.out.print("You win the third prize, money award is 6,000");
    	else
    		System.out.print("Sorry!");
    }
    
   
	}

}
