
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("the perfect numbers that are less than 10000 are:");
       int a=0;
		for(int i=1;i<=10000;i++){
		   
		   
		   for(int j =0;j!=i;j++){
			if(i%j==0){
				  a=j++;
			}
		   
		  if( a == i){
			  System.out.println(i); } 
		  }
		   }
			   
		 System.out.println();

		   }}
