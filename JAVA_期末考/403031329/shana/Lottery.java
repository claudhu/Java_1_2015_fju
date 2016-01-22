
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ln=(int)(Math.random()*1000);
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please the number: ");
		int n=input.nextInt();
		
		int n1=ln%100;//樂透字尾
		int n2=ln/100;//樂透自首
		int n3=n1%10;
		
		int ln1=n1%100;//字尾
		int ln2=n2/100;//字首
		int ln3=n%10;
		
		System.out.println("the random number is: "+ln);
		if(n1==ln1&&n2==ln2&&n3==ln3){
			System.out.println("You win the prize, money award is 10000 ");
		}
		else if(n1==ln1||n1==ln2||n1==ln3||n2==ln1||n2==ln2||n2==ln3||n3==ln1||n3==ln2||n3==ln3){
			System.out.println("You win the prize, money award is 8000 ");
		}
		else if(n2==ln2 &&n3==ln3){
			System.out.println("You win the prize, money award is 6000");
		}
	

	}

}
