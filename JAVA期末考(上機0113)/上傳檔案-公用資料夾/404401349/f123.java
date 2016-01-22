
public class f123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []={20,8,7,50,30,90,78,15,12,100,7};
		
		for(int i=0;i<arr.length-1;i++){
			int min=arr[i];
			int index =i;
			for(int j=i+1;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					index=j;	
			}
			}
			if(index!=arr[i]){
				index=arr[i];
				arr[i]=min;
				System.out.println(arr[i]);
			}
			
				
			}
			}
		}

	
