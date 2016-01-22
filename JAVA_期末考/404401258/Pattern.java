

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Please enter a numbers : ");
		
		int number = input.nextInt();
		System.out.println("Your square looks like:");
		for(int i=1 ; i<=number ; i++){
			for(int k=1 ; k<=i ; k++){
				System.out.print("*");
			}
			
			for(int j=number-i ; j>=1 ; j--)
				System.out.print("#");
			System.out.println("");
		}

	}

}
