
public class array {

	public static void main(String[] args) {
		int array[] = {20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7};
		int key = 78;
		
		//question1		
		if (question1(array,key)==-1) System.out.printf("%d not found", key);
		else System.out.printf("%d found after finding %d time(s)\n", key, question1(array,key)+1);
		
		//question2
		SelectionSort(array);
		System.out.printf("The sorted array: ");
		displayArray(array);
		
		//question3		
		if (question3(array,key)==-1) System.out.printf("\n%d not found", key);
		else System.out.printf("\n%d found after finding %d time(s)\n", key, question3(array,key));
	}

	
	public static int question1(int array[], int key)
	{
		for (int i=0; i<array.length; i++)
			if (array[i]==key)
				return i;
		return -1;
	}
	
	public static void SelectionSort(int array[])
	{
		for (int i=0; i<array.length; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for (int j=i+1; j<array.length; j++) {
				if (array[j]<currentMin) {
					currentMin=array[j];
					currentMinIndex=j;
				}
			}
			
			if (currentMinIndex!=i) {
				array[currentMinIndex]=array[i];
				array[i]=currentMin;
			}
		}
	}
	
	public static void displayArray(int array[])
	{
		for (int e: array)
			System.out.printf("%d  ", e);
	}
	
	public static int question3(int array[], int key)
	{
		int high=array.length-1;
		int low=0;
		int count=0;
		while (low<=high) {
			count++;
			int mid=(high+low)/2;
			
			if (key>array[mid])
				low=mid+1;
			else if (key==array[mid])
				return count;
			else high=mid-1;
		}
		return -1;
	}
}
