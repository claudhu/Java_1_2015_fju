

import java.util.Scanner;

public class x404401296_8_2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int[] m=new int [5];
		int[] a={0,3000,25000,2000,1000,500};
		int sum=0;
		
		for(int i=0;;i++)
		{
			System.out.print("please enter number:");
			int num=input.nextInt();
			if(num==0)
				break;
			System.out.print("please enter quantity:");
			int q=input.nextInt();
				m[i]=a[num]*q;
		
		}
		
		for(int i=0;i<m.length;i++)
		{
			sum=sum+m[i];
			
		}
	System.out.print("total: "+sum);
	}

}
