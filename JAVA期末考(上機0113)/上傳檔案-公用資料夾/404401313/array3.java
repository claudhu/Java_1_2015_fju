
public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int BS(int a[],int key){
		int low=0;
		int high=a.length-1;
		int mid = (low+high)/2;
		
		if(key>mid)
			high=mid-1;
		else if(key==mid)
			return;
	}

}
