


import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[] = new int[11];
		a[0]=20;a[1]=8;a[2]=7;a[3]=50;a[4]=30;a[5]=90;a[6]=78;a[7]=15;a[8]=12;a[9]=100;a[10]=7;
		int time = LinearSearch(a,78);
		System.out.println("LinearSearch ·j´M"+time+"¦¸");
		for(int i =0;i<a.length;i++)
		{			
			System.out.printf("%-4d",a[i]);
		}
		System.out.println();
		SelectionSort(a);
		for(int i =0;i<a.length;i++)
		{			
			System.out.printf("%-4d",a[i]);
		}
		time =BinarySearch(a,78);
		System.out.println();
		System.out.println("BinarySearch ·j´M"+time+"¦¸");

	}
	public static int LinearSearch(int a[],int key)
	{
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i+1;
			}
		}
		return -1;
	}
	public static void SelectionSort(int a[])
	{
		for(int i =0;i<a.length;i++)
		{
			int temp = i;
			for(int j =i;j<a.length-1;j++)
			{
				if(a[temp]>a[j+1])
				{
					temp =j+1;
				}
					
			}
			int b = a[i];
			a[i]=a[temp];
			a[temp]=b;
		}

	}
	public static int BinarySearch(int a[],int key)
	{
		int high = a.length-1;
		int low =0;
		int mid = high+low/2;
		int times = 0;
		while(high!=low)
		{
			times++;
			if(a[mid]>key)
			{
				high = mid-1;
				mid = high+low/2;
			}
			if(a[mid]<key)
			{
				low = mid+1;
				mid = high+low/2;
			}
			if(a[mid]==key)
			{
				return times;
			}
				
		}
		return -1;
	}


}
