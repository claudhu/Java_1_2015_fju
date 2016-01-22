
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int List[]={20,8,7,50,30,90,78,15,12,100,7};
		int temp = 0;
		
		
		
		for(int i=0;i<List.length;i++){
			for(int j=0;j<List.length;j++){
				if(List[i]<List[j]){
				    temp = List[i];
				    List[i]=List[j];
				    List[j]=temp;
				}
			}}
			for(int s=0; s<List.length;s++){
				System.out.print("  "+List[s]);
		}
			
	}

	}
