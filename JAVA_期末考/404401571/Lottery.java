
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1 =(int)(Math.random()*900+100);
		
		int p = num1/100;
		int q1 = num1/10;
		int q2 = q1%10;
		int r1 = num1%100;
		int r2 = r1%10;
		
		System.out.println("The random number is:"+num1);
		
		System.out.println("請輸入一個介於100-999的數字");
		int guess = input.nextInt();
		
		int a = guess/100;
		int b1 =guess/10;
		int b2 = b1%10;
		int c = guess%100;
		
		System.out.println("Please enter the number:"+guess);
		System.out.println("The random number is:"+num1);
		
		if(p == a && q2 == b2 && r2 == c){
			System.out.println("You win the fisrt prize, money award is 10000");
		}
		else if ((p==b2&&q2==c&&r2==a)||(p==c&&q2==a&&r2==b2)||(q2==c&&r2==a&&p==c)){
			System.out.println("You win the second prize, money award is 8000");
		}
		else if((p!=a&&q2==b2&&r2==c)){
			System.out.println("You win the second prize, money award is 6000");
		}
		else
			System.out.println("Sorry!");
	
				
						
								
		

	}

}
