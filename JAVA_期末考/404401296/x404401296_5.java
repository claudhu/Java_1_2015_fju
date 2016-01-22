

import java.util.Scanner;

public class x404401296_5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("please enter the num:");
		int a=input.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			for(int j=a-1;j>=i;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
