

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double array [] = {20,8,7,50,30,90,78,15,12,100,7};
		int key =78;
		System.out.println("��M78�ɡA�@��F"+LinearSearch(array,key)+"��");
		SelectionSorting(array);

	}
	
	public static int LinearSearch(double array[],int key){
		
		for(int i=0;i<array.length;i++){
			if (array[i] == key)
				return i+1;
		}
			return -1;
		
	}
	
	public static void SelectionSorting(double array[]){ 
		
		for (int i = 0;i<array.length;i++){  
			
			double currentmin= array[i];   
			int minindex = i ;  
			
			for(int j=i+1; j<array.length-1;j++){
				
				if(currentmin>j){
					
					currentmin = array[j];   
					minindex = j ;  
				}
			}
			
			if(currentmin != array[i]){
				currentmin = array[i];   
				minindex = i ; 
			}
			
			
		}
		
		System.out.printf("�}�C�Ƨ�: %4d",array);
	}
	
	
		
	

}
