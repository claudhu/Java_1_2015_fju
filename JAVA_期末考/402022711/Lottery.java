import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lottery = 146;
		
		System.out.print("Please enter the number:  ");
		int num = input.nextInt();		
		
		System.out.println("The random number is: " + lottery);
		
		int ran[] = new int[3];
		int numm[] = new int[3];
		int count = 0;
		
		ran[0] = lottery / 100;
		ran[1] = (lottery / 10) % 10;
		ran[2] = lottery % 10;
		
		numm[0] = num / 100 ;
		numm[1] = (num / 10) % 10 ;
		numm[2] = num % 10;
		
		for(int i = 0 ; i < ran.length; i++){
			for(int j = 0 ; j < ran.length; j++){
			
				if(ran[i] == numm[j]){
					count++;
				}	
				
			}
			
		}
		
		
		
		if(num == lottery){
			System.out.println("You win the fist prize, money award is 10,000");
						
		}
		
		else if(count == 3){
			System.out.println("You win the second prize, money award is 8,000");
		
		}
		
		
		else if(num % 100 == lottery %100){
			System.out.println("You win the third prize, money award is 6,000");

		}
		
		else
			System.out.println("Sorry!");
		
	}

}
