import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String L =""+ (int)(Math.random()*10+1)+(int)(Math.random()*10)+(int)(Math.random()*10);
		int L1 =L.charAt(0);
		int L2 =L.charAt(1);
		int L3 =L.charAt(2);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number (100~999): ");
		String guess = input.nextLine();
		int G1 = guess.charAt(0);
		int G2 = guess.charAt(1);
		int G3 = guess.charAt(2);
		System.out.println("The random number is : "+L);
		if(guess==L){
			System.out.println("You win the first prize,money award is 10000");
		}
		else if((G1==L2||G1==L3)&&(G2==L1||G2==L3)&&(G3==L1||G3==L2)){
			System.out.println("You win the second prize,money award is 8000");
		}
		else if((G2==L2)&&(G3==L3)){
			System.out.println("You win the third prize,money award is 10000");
		}
		else
			System.out.println("Sorry!");
		

	}

}
