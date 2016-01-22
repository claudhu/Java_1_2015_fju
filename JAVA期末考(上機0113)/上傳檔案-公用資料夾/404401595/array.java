
public class array {

	public array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] test ={ 20,8,7,50,30,90,78,15,12,100,7 };
     for(int i = 11;i>test.length;i--){for(int j = 11;j>test.length-1;j--){  
    	 if(test[j]>test[i]){
    		 int tmp = test[j];
    	 test[j] = test[i];
    	 tmp = test[i];}
    	 for(int f = 0;f>=test.length;f--){
    		 System.out.println(test.length);                 }
  
	}}

}}
