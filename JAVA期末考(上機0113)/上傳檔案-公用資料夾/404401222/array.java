
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {20,8,7,50,30,90,78,15,12,100,7};
		
		System.out.println(linearsearch(num,78));
		
		for(int i = 0; i < num.length-1; i++){
			for(int j = i+1; j < num.length; j++){
				if(num[i] > num[j]){
				  int temp = num[i];
				  num[i] = num[j];
				  num[j] = temp;
				}
	        }
		}
		for(int s = 0; s < num.length; s++){
			System.out.print(num[s] + " ");
		}
		System.out.println();
		
		System.out.println(binarysearch(num,78));
		
	}
	public static int linearsearch(int n[],int key){
		for(int i = 0; i < n.length; i++){
			if(key == n[i])
				return i;
		}
		return -1;
	}
	public static int binarysearch(int num[],int key){
		int low = 0;
		int high = num.length-1;
		while(high >= low){
			int mid = (low + high)/2;
			if(key < num[mid])
				high = mid - 1;
			else if(key == num[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}
}
