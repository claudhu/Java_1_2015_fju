import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = in.nextInt();
		System.out.println("Your square looks like:");
		for(i=1;i<num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(k=num-1;k>i;k--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
