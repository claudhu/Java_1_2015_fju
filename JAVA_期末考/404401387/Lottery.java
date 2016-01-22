import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number :");
		int g = input.nextInt();
		
		int c= 100+(int)(Math.random()*900);
		
		System.out.println("The random number is:"+c);
		if(g==c)
			System.out.print("You win the first prize, money award is 10000");
		else if(g%10==c%10&&g/100==c/10%10&&g/10%10==c/100 || g%10==c/100&&g/100==c%10&&g/10%10==c/10%10 || g%10==c/100&&g/100==c/10%10&&g/10%10==c%10 || g%10==c/10%10&&g/100==c%10&&g/10%10==c/100 || g%10==c/10%10&&g/100==c/100&&g/10%10==c%10)
			System.out.print("You win the first prize, money award is 8000");
		else if(g%100==c%100)
			System.out.print("You win the first prize, money award is 6000");
		else
			System.out.print("Sorry!");

	}

}
//*g1==c1&&g2==c3&&g3==c2||g1==c3&&g2==c2&&g3==c1||g1==c2&&g2==c1&&g3==c3||g1==c2&&g2==c3&&g3==c1||g1==c3&&g2==c1&&g3==c2 
//*156                         g%10_6                    g/100_1                g/10%10_5                    g%100_56   132 213 231 312 321