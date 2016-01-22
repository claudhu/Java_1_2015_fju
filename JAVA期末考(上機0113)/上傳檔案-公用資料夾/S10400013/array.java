
public class array {

	public static void main(String[] args) {
		
		int []m = {20,8,7,50,30,90,78,15,12,100,7};

		int key =78,count=0;
		
		for (int i=0 ; i<m.length ; i++){
			count++;
			if (m[i]==78)
				break;
		}
	
		System.out.printf("利用線性搜尋 (Linear Search )找尋 78 時,需要%d次搜尋\n",count);
		
		SelectionSort(m);
		
		for (int i=0 ; i<m.length ; i++){
			System.out.printf("%d ",m[i]);
		}
	}
	
	public static int[] SelectionSort(int[] list )
	{
		for (int i=0 ; i<list.length-1;i++){
			
			int currentminIndex = i;
			int currentMin = list[currentminIndex];
			list[i]=list[currentminIndex];
			
			for (int j=1 ;j<list.length;j++){
				if (currentMin > list[j]){
					currentMin = list[j];
				currentminIndex = j;
				}
			
			if (currentminIndex != i)
				currentminIndex = i;
			}
		}
		return list;
	}

}
