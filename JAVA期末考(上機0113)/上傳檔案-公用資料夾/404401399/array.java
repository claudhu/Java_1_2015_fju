

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int array[] = {20,8,7,50,30,90,78,15,12,100,7};
	int count = 1;
	for(int i=0;i<array.length;i++){
		if(array[i]!=78){
			count++;
			}
		else if(array[i]==78){
			System.out.println("§ä´M78®É·j´M¤F"+ count + "¦¸");
		}
	    }
	for(int j=0;j<array.length;j++){
		int min = array[j];
		if(min>array[j+1]){
			int temp = min;
			min = array[j+1];
			array[j+1]=temp;
		}
		else if(min==array[j]){
			min = array[j];
		
		}
		System.out.print(array[j]+" ");		
				
	}

	}}

