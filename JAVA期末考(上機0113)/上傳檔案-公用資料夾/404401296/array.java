

public class array {

	public static void main(String[] args) {
		
		int a[]={20,8,7,50,30,90,78,15,12,100,7};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			c++;
			if(a[i]==78)
				break;
			
		}
		System.out.println("linear search "+c);
		c=0;
		
		sort(a);
	}
	
	
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=a[i];
			int index=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<=min){
					min=a[j];
					index=j;}
			}
			
			
			if(min!=a[i]){
				a[index]=a[i];
				a[i]=min;}
			
			
			
			
		}
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+" ");
			System.out.println();
		
			bsearc(a);
		
	}
	
	public static void bsearc(int[] a)
	{
		
		int c=0;
		int high=a.length-1;
		int low=0;
		while(high>low)
		{
			
			c++;
			int mid=(low+high)/2;
			
			if(78<mid)
				high=mid-1;
			else if(78>mid)
				low=mid+1;
			else 
				break;
			
		}
		System.out.println("binary search "+c);
		

	}
}




