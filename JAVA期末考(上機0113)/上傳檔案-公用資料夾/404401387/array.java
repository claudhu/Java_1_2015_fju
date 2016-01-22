import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={20,8,7,50,30,90,78,15,12,100,7};
		int []sort = new int[11];
		System.out.println("1.找尋78時,需要"+linearsearch(arr,78)+"+1次搜尋");
		

	}
	public static int linearsearch(int arr[],int key){
		int []arrs={20,8,7,50,30,90,78,15,12,100,7};
		for(int i=1;i<=arrs.length;i++){
		if(key==arrs[i])
			return i;
		}
		return -1;
	}
	
		
	

}
