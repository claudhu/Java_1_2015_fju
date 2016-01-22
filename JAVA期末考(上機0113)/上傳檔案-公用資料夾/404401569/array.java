

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list [] = { 20 , 8 , 7 , 50 , 30 , 90 , 78 , 15 , 12 , 100 , 7 } ;
		System.out.println("1.利用線性搜尋");
		System.out.println("花了 " + linearSearch(list , 78) + "次搜尋");
		System.out.printf("\n");
		
		System.out.println("2.利用選擇排序，由小至大排列");
		sorting(list);
		System.out.println();
		System.out.printf("\n");
		
		System.out.println("3.利用二元搜尋法");
		System.out.println(two(list,78) + "次");

	}
	
	public static int linearSearch(int list [] , int key)
	{
		for (int i = 0 ; i < list.length ; i++)
		{
			if (key == list [i])
				return i + 1 ;
		}
		
		return -1 ;
	}
	
	public static void sorting(int list [])
	{
		for (int i = 0 ; i < list.length ; i++)
		{
			for (int j = i + 1 ; j < list.length ; j++)
			{
				if (list [i] > list [j])
				{
					int temp = list [i] ;
					list [i] = list [j] ;
					list [j] = temp ;
				}
			}
		}
		
		for (int k = 0 ; k < list.length ; k++)
			System.out.printf("%4d" , list [k]);
	}
	
	public static int two (int list [] , int key)
	{
		int low = 0 ;
		int high = list.length -1 ;
		if (list[high] > list[low])
		{
			int mid = (low + high) / 2 ;
			
			if (key > list [mid])
			{
				low = mid + 1 ;
			}
			else if (key == list[mid])
			{
				return mid ;
			}
			else{
				high = mid - 1 ;}
		}
		
		return 2 ;
	}

}
