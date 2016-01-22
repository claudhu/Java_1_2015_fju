
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {20,8,7,50,30,90,78,15,12,100,7};
		SS(array);

	}
	
	public static void SS(int list[]){
		for(int i=0;i<list.length-1;i++){
			int min = list[i];
			int location = i;
			for(int j=i+1;j<list.length;j++){
				if(min>list[j]){
					min=list[j];
					location =j;
			}
			if(location!=i){
				list[j]=list[i];
				list[i]=list[location];
			}
				
		}
		System.out.print(list);	
		}
			
		}
		

}
