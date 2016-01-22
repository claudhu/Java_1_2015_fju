import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) 
	{
		System.out.println("中獎方式\t\t\t獎金");
		System.out.println("三個數字順序、號碼全對\t\t10000");
		System.out.println("三個數字號碼全對但順序不對\t8000");
		System.out.println("末兩位數字順序、號碼全對\t\t6000");
		Scanner input = new Scanner(System.in);
		int key1 = (int)(1+(Math.random()*9));
		int key2 = (int)(1+(Math.random()*9));
		int key3 = (int)(1+(Math.random()*9));
		System.out.printf("Please enter three numbers(三位數字分開輸入)： ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.printf("Please enter the numbers: %d%d%d", a, b, c);
		System.out.printf("\nThe random number is: %d%d%d", key1, key2, key3);
		if(key1 == a && key2 == b && key3 == c)
			System.out.printf("\nYou win the first prize, money award is 10000");
		else if((key1 == a && key2 == b && key3 == c)||(key1 == b && key2 == c && key3 == a)||(key1 == b && key2 == a && key3 == c)||(key1 == c && key2 == b && key3 == a)||(key1 == c && key2 == a && key3 == b))
		{
			System.out.printf("\nYou win the second prize, money award is 8000");
		}
		else if(key2 == b && key3 == c)
		{
			System.out.printf("\nYou win the third prize, money award is 6000");
		}
		else
			System.out.println("\nSorry, see you next time.");
	}

}
