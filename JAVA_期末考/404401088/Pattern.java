
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter a number :");
		
		int a = input.nextInt();
		
		for(int row = 0 ; row > 1 ; row++  )
		{
			for(int i = 0 ; i <= row ; i++)
			{
			System.out.print("*");
			}
			for(int k = a-row ; k >= 0 ; k--)
			{
			System.out.print("#");
			}
		
		}
		System.out.println();
	}
	
}
