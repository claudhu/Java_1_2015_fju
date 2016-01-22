
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("請輸入8個數  : ");
		
		int list [] = new int [8] ;
		
		for (int i = 0 ; i < list.length ; i++)
		{
			list [i] = input.nextInt();
		}
		
		int count = 0 ;
		
		for (int i = 0 ; i < list.length ; i++)
		{
			System.out.printf("%10d" , list [i]);
			count ++ ;
			
			if (count % 4 == 0)
				System.out.printf("\n");
		}

	}

}
