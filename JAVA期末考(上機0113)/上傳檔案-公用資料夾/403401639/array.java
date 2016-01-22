

public class array {

	public static void main(String[] args) {
		int array[] = {20,8,7,50,30,90,78,15,12,100,7};
		int count1=0,count2=0;
		for(int i=0; i<array.length; i++){
			count1++;
			if(array[i]==78)
				break;
			}
		System.out.printf("%d¦¸\n",count1);
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i]>array[j]){
					int min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
			System.out.printf("%-3d",array[i]);
		}
		System.out.printf("\n");
		int low=0,high=array.length-1;
		while(high>=low){
			count2++;
			int mid = (low+high)/2;
			if(mid==78)
				break;
			else if(mid>78)
				high=mid-1;
			else
				low = mid+1;
		}
		System.out.printf("%d¦¸",count2);
		
	}

}
