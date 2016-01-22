import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		
		int key = (int)(Math.random()*1000) ;
		int k1 = key /100 ;
		int k2 = key / 10 ; 
		int k3 = key % 10 ;
		
		System.out.print("Please enter the number : " ) ;
		int a = input.nextInt() ;
		
		int a1 = a / 100 ;
		int a2 = a /10 ;
		int a3 = a % 10 ;
		
		System.out.println("The random number is : " + key ) ;
		
		if(a==key) {
			System.out.print("You wiin the first prize, money award is 10000") ;
		}
		
		else if ((a1==k1 && a2 == k3 && a3 == k2) || (a1 == k2 && a2== k1 && a3==k3 )||( a1==k2 && a2==k3 && a3==k1)||(a1==k3&& a2==k2&&a2==k1 || (a1==k3&&a2==k1&&a3==k2)) ) {
			
		}
		
		else if ( k2==a2 && k3 == a3) 
			System.out.println("You wiin the third prize, money award is 6000") ;
			
		else
			System.out.print("Sorry!") ;
	}

}
