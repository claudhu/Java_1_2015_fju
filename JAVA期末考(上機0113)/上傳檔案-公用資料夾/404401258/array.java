
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {20,8,7,50,30,90,78,15,12,100,7};
		
		int count = 0;
		for(int i=0 ; i<num.length ; i++){
			count++;
			if(num[i] == 78)
				break;
		}
		System.out.println("(�@)�u�ʷj�M78�@�j�M"+count+"��");
		
		
		
		
		for(int i=0 ; i<num.length ; i++){
			int currentMin = num[i];
		    int currentMinIndex = i;
		    
			for(int k=i+1 ; k<num.length ; k++)
			    if(num[k] < currentMin){
				   currentMin = num[k];
				   currentMinIndex = k;
			    }
			   
			if(currentMinIndex != i){
				num[currentMinIndex] = num[i];
				num[i] = currentMin;
			}
		}
		
		System.out.print("(�G)�Ѥp�Ʀܤj��: ");
		for(int e:num)
			System.out.print(e+" ");
		
		
		int high = num.length-1;
		int low = 0;
		count = 0;
		while(high>=low){
			int mid = (high+low)/2;
			count++;
			if(num[mid]>78)
				high = mid--;
			else if(num[mid] == 78)
				break;
			else
				low = mid++;	
		}
		System.out.println("\n(�T)�G���j�M�k�j�M78�@�j�M"+count+"��");
	}
	

}
