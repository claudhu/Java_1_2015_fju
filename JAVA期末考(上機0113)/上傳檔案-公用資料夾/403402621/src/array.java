
public class array {

	public static void main(String[] args) {
		int[] arr=new int[]{20,8,7,50,30,90,78,15,12,100,7};
		int LinearSearch=linear(arr,78);
		System.out.println("利用Linear Search找尋78，需要"+LinearSearch+"次搜尋");
		sort(arr);
		System.out.println("由小到大排列:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		int BinarySearch=binary(arr,78);
		System.out.print("\n");
		System.out.print("利用Binary Search找尋78，需要"+BinarySearch+"次搜尋");

	}
	public static int linear(int[] a,int key){
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				return i+1;
			}
		}
		return -1;
	}
	public static void sort(int[] b){
		for(int i=0;i<b.length-1;i++){
			int CurrentMini=b[i];
			int CurrentMiniIndex=i;
			for(int j=i+1;j<b.length;j++){
				if(CurrentMini>b[j]){
					CurrentMini=b[j];
					CurrentMiniIndex=j;
				}
			}
			if(CurrentMini!=b[i]){
				b[CurrentMiniIndex]=b[i];
				b[i]=CurrentMini;
			}
		}
	}
	public static int binary(int[] c,int key){
		int low=0;
		int high=c.length-1;
		for(int i=1;i<c.length;i++){
			int mid=(low+high)/2;
			if(key==c[mid]){
				return i;
			}
			else if(key>c[mid]){
				low=mid+1;
			}
			else if(key<c[mid]){
				high=mid-1;
			}
		}
		return -1;
	}

}
