
public class array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {20,8,7,50,30,90,78,15,12,100,7};
		
		System.out.print("²Ä");
		LS(array,78);
		System.out.print("¦¸");

	}
	
	public static void LS(int a[],int key){
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				System.out.print(i+1);
				
			}
			
		}
		
		
		
	}

}
