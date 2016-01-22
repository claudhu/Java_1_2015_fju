import java.util.Scanner;
public class Pattern {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int a = input.nextInt();
		int count = 0;
		for(int i = 0; i < a; i++)
		{
			count++;
			System.out.print('*');
			System.out.print('#');
			if(count > a)
				System.out.print("\n");		
		}
	}

}
