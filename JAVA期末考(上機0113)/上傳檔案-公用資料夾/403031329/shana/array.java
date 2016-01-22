
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n[]={20,8,7,50,30,90,78,15,12,100,7};
		
		System.out.println("¤G¤Àªk·j´M: "+list(n,78));
		{
			}
		}
		
		public static int list(int n[], int key){
		int low=0;
		int high=n.length-1;
		
		while(true){
			int mid=(low+high)/2;
			if(key<n[mid]){
				high=mid-1;
				
			}if(key==n[mid]){
				
				
			}
			else{
				low=mid+1;
				
			}
		
		}
		
	}

}
