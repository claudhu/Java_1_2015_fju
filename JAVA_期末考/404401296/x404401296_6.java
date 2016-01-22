

import java.util.Scanner;

public class x404401296_6 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("please enter 9 num:");
		int num=input.nextInt();
		int[] a=new int [9];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int) (num%10);
			num=(int) (num/10);
			
		}
			
	
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i]*(i+1);
		
		System.out.println("the check num: "+sum%11);
		
		System.out.print("the IBSN: ");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
		
		if(sum%11==10)
			System.out.print("X");
		else
			System.out.print(sum%11);
			

}
}