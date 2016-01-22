

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter the number : ");
		int number = input.nextInt();
		
		int rNumber = (int)(Math.random()*900+100);
		
		System.out.print("The random number is: "+rNumber);
		
		int x1 = number/100;
		int x2 = (number/10)%10;
		int x3 = number%10;
		int y1 = rNumber/100;
		int y2 = (rNumber/10)%10;
		int y3 = rNumber%10;
		
		if(number==rNumber)
			System.out.print("You win the first prize,money award is 10000");
		else if(x2==y2 && x3==y3 && x1!=y1)
			System.out.print("You win the third prize,money award is 6000");
		else if(x1==y1 && x2==y3 && x3==y2)
			System.out.print("You win the second prize,money award is 8000");
		else if((x1==y2 && x2==y3 && x3==y1) || (x1==y2 && x2==y1 && x3==y3))
			System.out.print("You win the second prize,money award is 8000");
		else if((x1==y3 && x2==y2 && x3==y1) || (x1==y3 && x2==y1 && x3==y2))
			System.out.print("You win the second prize,money award is 8000");
		else
			System.out.print("\nSorry!");

	}

}
