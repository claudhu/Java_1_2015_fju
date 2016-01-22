
import java.util.Scanner;


public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter 9 digits:");
		int number = input.nextInt();
		int temp = number;
		int array1[] = new int[9];
		int check = 0;

		for(int i =0; i<9;i++)
		 {
			array1[i] = number%10;	
			number = number/10;
		}

		for(int i =0; i<9;i++)
		 {
			check += array1[i] * (9-i) ;
		}
		if(check%11==10)
		{
			System.out.printf("The checksum is:X\n");
		}
		else
		{
			System.out.printf("The checksum is:%d\n", check%11);
		}
		
		System.out.printf("The ISBN is:");
		for(int i =8; i>=0;i--)
		{	
			System.out.printf("%d",array1[i]);
		}
		
		if(check%11==10)
		{
			System.out.print("X");
		}
		else
		{
			System.out.print(check%11);
		}
		

		

	}

}
