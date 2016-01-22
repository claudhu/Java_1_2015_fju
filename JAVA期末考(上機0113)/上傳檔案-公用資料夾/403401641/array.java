

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] ={20,8,7,50,30,90,78,15,12,100,7} ;
for(int i= 0;i<array.length;i++){
	for(int n=0;n<array.length;n++){
		if(array[i]>array[n]){
			int x= array[i];
			array[i]=array[n] ;
			array[n]= x ;
		
		}
		
	for(int n1=0;n1<array.length;n1++){
		System.out.printf("%3d",array[n1]);
	
	

	}}	}

	}}