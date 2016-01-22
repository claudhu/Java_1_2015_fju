import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lottery=(int)(Math.random()*900+100);
		System.out.println("The random number is"+lottery);
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number,(¤¶©ó100~999)");
		String number=input.nextLine();
		String s=lottery+"";
		if(number.charAt(0)==s.charAt(0)&&number.charAt(1)==s.charAt(1)&&number.charAt(2)==s.charAt(2))
		    System.out.println("You win the third prize,money award is 10000");
	    else if(number.charAt(0)!=s.charAt(0)&&number.charAt(1)==s.charAt(1)&&number.charAt(2)==s.charAt(2))	
			System.out.println("You win the third prize,money award is 6000");
	    else
	    	System.out.println("Sorry");
	}

}
