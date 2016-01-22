

public class array {
	public static void main(String[] args) {
		int a[]={20,8,7,50,30,90,78,15,12,100,7};
		
		System.out.println("Á`¦@"+ line(a,78)+"¦¸");
		
	}
	public static int line(int a[],int key){
		for(int i=0;i<11;i++){
		if(a[i]==key)
		return i+1;
		}
		return key;
	}
}
