
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int list[] = {20,8,7,50,30,90,78,15,12,100,7};
    for(int i = 0 ; i < list.length-1;i++){
    System.out.println(selectionSort(list)[i] + " ");
	}
    int l = binarySearch(list,78);
    l ++ ;
    System.out.println(l);
    }
    
    public static int binarySearch(int list[],int key){
    	int low = 0 ;
    	int high = list.length-1;
    	while(high>=low){
    		int mid = (high + low)/2;
    		if(key<=mid){
    			high = mid - 1 ;
    		}  
    		else if (key == mid){
    			return mid;
    		}
    		else
    			low = mid + 1 ;
    	}
    	return -low-1;
    }

    public static int[] selectionSort(int[]list){
    	for(int i = 0 ;i <list.length;i++){
    		int currentMin = list[i] ;
    		int currentMinIndex = i ;
    	for(int j = i + 1 ; j < list.length ;j++){
    		if(currentMin > list[j])
    			currentMin = list[j];
    		    currentMinIndex = j;
    	}
    	if(currentMinIndex != i)
    		list[currentMinIndex] = list[i];
    	    list[i] = currentMin ; 
    	}
    	return list ;
    }}