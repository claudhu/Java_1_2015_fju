import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a numbers : ");
		int num = sc.nextInt();
		
		if(num == 1){
			System.out.println("Your square looks like: ");
			System.out.println("*");
		}
		else if(num == 2){
			System.out.println("Your square looks like: ");
			System.out.println("*#");
			System.out.println("**");
		}
		else if(num == 3){
			System.out.println("Your square looks like: ");
			System.out.println("*##");
			System.out.println("**#");
			System.out.println("***");
		}
		else if(num == 4){
			System.out.println("Your square looks like: ");
			System.out.println("*###");
			System.out.println("**##");
			System.out.println("***#");
			System.out.println("****");
		}
		else if(num == 5){
			System.out.println("Your square looks like: ");
			System.out.println("*####");
			System.out.println("**###");
			System.out.println("***##");
			System.out.println("****#");
			System.out.println("*****");
		}

	}

}
