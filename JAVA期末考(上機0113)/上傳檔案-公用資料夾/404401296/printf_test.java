
import java.util.Scanner;

public class printf_test {
	
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[]=new int[8];
		for(int j=0;j<a.length;j++)
			a[j]=input.nextInt();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i==4)
			System.out.println();
			System.out.printf("%10d",a[i]);
		}
	
	}
}
