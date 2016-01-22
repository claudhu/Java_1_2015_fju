

import java.util.Scanner;

public class x404401296_3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.printf("enter three num:");
		int[] a=new int [3];
		
		for(int i=0;i<3;i++)
		 a[i]=input.nextInt();
		
		
	
		for(int i=0;i<3;i++)
		{
			int min=a[i];
			int index=i;
			
			for(int j=0;j<3;j++)
			{
				if(a[j]<=min){
					min=a[j];
					index=j;
				}
			}
			
			if(index!=0){
				a[index]=a[i];
				a[i]=min;}
			
		}
		
		System.out.println("After sorting:");
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		
	}
		
		

}

