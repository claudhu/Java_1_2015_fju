

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key=0;
		int count=0;
		int array[]={20,8,7,50,30,90,78,15,12,100,7};
		System.out.println("78的搜尋次數為 : " + linearsearch(array,78));
		System.out.println("arranges : ");
		linearsearch(array,key);
		selection(array);
			
		
	}
        public static int linearsearch(int array[] , int key){
        
        int count=0;
	    for(int i = 0; i<array.length ; i++){
		if(key==array[i]){
			
			System.out.println("搜尋次數為 : " + count);
			count++;
			
		}
		
		
	    }
	    
		    return count;
		}
	
	public static void selection(int array[]){
		for(int i = 0 ; i<array.length ; i++){
			int currentmin=array[i];
			int currentindexofmin=i;
			
			for(int j=i+1;j<array.length;j++){
				if(currentmin>array[j]){
					currentmin=array[j];
					j=currentindexofmin;
				}
				
				if(currentindexofmin != i){
					array[currentindexofmin]=array[i];
					array[i]=currentmin;
				}
				
				
			}
			
			System.out.println(array[i]);
			
		
	
		}
		
	}
}
