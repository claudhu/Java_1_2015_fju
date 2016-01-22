
import java.util.Scanner;


public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("The perfect numbers that are less than 10000 are:\n");
		for(int i =1; i<=10000;i++)
		{
			int check =0;
			for(int j =1;j<i;j++)
			{
				if(i%j == 0)
				{
					check+=j;
				}
			}
			if(check == i)
			{
				System.out.print(i+" ");
			}
		}
		
		


		

	}

}
