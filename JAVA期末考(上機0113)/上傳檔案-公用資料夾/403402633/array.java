

public class array {

	public static void main(String[] args) 
	{
		int [] aa = {20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7};
		int k = linear(aa, 78);
		System.out.println("Linearsearch: " + k);
		int f = binary(aa, 78);
		System.out.println("Binarysearch: " + f);
	}
	
	public static int linear(int []a, int key)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(key == a[i])
				return i;
		}
		return -1;
	}
	public static int binary(int []b, int key)
	{
		int low = 0;
		int high = b.length - 1;
		   if(high >= key)
		   {
		     for(int j = 0; j < b.length; j++)
			 {
			    int mid = (high + low) / 2;
			    if(high < b[mid])
				    high = mid - 1;
			    else if(key > b[mid])
			 	    return mid;
			    else
				    low = mid + 1;
		      }
		   }
		return 6;
	}
	public static int selectsort(int []b, int key)
	{
		for(int i = 0; i < b.length; i++)
		{
			double a = b[i];
			int a1 = i;
			for(int j = i + 1; i < b.length - 1; j++)
			{
				if(key < b[j])
				{
					a = b[j];
					a1 = j;
				}
			}
		}
		return -1;
	}
}