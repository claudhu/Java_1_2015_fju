import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String l = "" +(int)(100+Math.random() * 900) ;
		System.out.print("Please enter the number : ");
		String g = "" + input.nextLine();
		System.out.println("The random number is : " + l);
		char l1 = l.charAt(0) ;
		char l2 = l.charAt(1) ;
		char l3 = l.charAt(2) ;
		
		char g1 = g.charAt(0) ;
		char g2 = g.charAt(1) ;
		char g3 = g.charAt(2) ;
		
		if(l1 == g1 && l2 == g2 && l3 == g3){
			System.out.println("You win the first prize, money award is 10000");
		}
		else if((l1 == g2 || l1 == g3) && (l2 == g1 || l2 == g3) && (l3 == g1 || l3 == g2)){
			System.out.println("You win the Second prize, money award is 8000");
		}
		else if(l2 == g2 && l3 == g3){
			System.out.println("You win the third prize, money award is 6000");
		}
		else{
			System.out.println("Sorry!");
		}
		input.close();
		
	}

}
