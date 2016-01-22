import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Lottery=""+Math.random()*1000+Math.random()*100+Math.random()*10;
		System.out.println("Please enter the number: ");
		String guess=in.next();
		char Ld1=Lottery.charAt(0);
		char Ld2 =Lottery.charAt(1);
		char Ld3=Lottery.charAt(2);
		char gd1=guess.charAt(0);
		char gd2=guess.charAt(1);
		char gd3=guess.charAt(2);
		System.out.println("The random number is: "+Lottery);
		if(Lottery.equals(guess))
		{
			System.out.println("You win the first prize,money award is 10000! ");
		}
		else if(Ld1==gd1||Ld1==gd2||Ld1==gd3||Ld2==gd1||Ld2==gd2||Ld2==gd3||Ld3==gd1||Ld3==gd2||Ld3==gd3)
		{
			System.out.println("You win the scond prize,money award is 8000! ");
		}
		else if(Ld2==gd2&&Ld3==gd3)
		{
			System.out.println("You win the thrid prize,money award is 6000! ");
		}
		else
		{
			System.out.println("Sorry! ");
		}
		
	}

}
