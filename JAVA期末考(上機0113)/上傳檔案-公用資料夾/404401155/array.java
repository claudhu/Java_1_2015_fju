
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };
		System.out.println("test 1");
		System.out.println(search(array,78)+"¦¸");
		
		
		
	}
		public static int search(int[]array,int key){
			int low = 0;
			int high = array.length-1;
			while(high>=low){
				int mid = (1+high)/2;
						if(key<array[mid])
							high=mid-1;
						else if(key == array[mid])
							return mid;
						else 
							low =mid+1;
			}
			return -1;
		}



}