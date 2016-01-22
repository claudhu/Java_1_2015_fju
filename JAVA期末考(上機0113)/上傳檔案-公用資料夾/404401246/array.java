

public class array {

	public static void main(String args[]){
		
		int list[] = {20,8,7,50,30,90,78,15,12,100,7};
		
		count(list);
		selectionsort(list);
		binarysearch(list);
		
	}
	
	public static void count(int list[]){
		int count =0;
	
		for(int i=0; i<list.length; i++){
			if(list[i] == 78){
				System.out.println("1. 找到78， 花了 "+count+" 次.");
			}
			else{
				count++;
			}
		}
		
	}
	
	public static void selectionsort (int list[]){
		
		System.out.print("2. ");
		for(int i=0; i<list.length; i++){
			int currentmin =list[i];
			int currentindex = i;
			
			for(int j=i+1; j<list.length; j++){
				if(currentmin > list[j]){
					currentmin = list[j];
					currentindex = j;
				}
			}
			
			if(currentindex != i){
				list[currentindex] = list[i];
				list[i] = currentmin;
			}
			System.out.print(list[i]+" ");
		}
		System.out.println();
		}
	
	public static void binarysearch(int list[]){
		
		for(int i=0; i<list.length; i++){
			int currentmin =list[i];
			int currentindex = i;
			
			for(int j=i+1; j<list.length; j++){
				if(currentmin > list[j]){
					currentmin = list[j];
					currentindex = j;
				}
			}
			
			if(currentindex != i){
				list[currentindex] = list[i];
				list[i] = currentmin;
			}
		} 
		
	
		
		int count=0;
		int a=0;
		int low=0;
		int high=list.length-1;
		while(high>=low){
			int mid = (low+high)/2;
			
			if(78>list[mid]){
				low = mid+1;
				count++;
			}
			else if(78==list[mid]){
				a++;
			}
			else{
				high=mid-1;
				count++;
			}
		}
		System.out.print("3. 搜尋 "+count+" 次. ");
	
	
	}
	
	
}
