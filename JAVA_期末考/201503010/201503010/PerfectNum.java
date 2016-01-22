
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    System.out.println("The perfect numbers that are less than 10000 are : ") ;
	
	for(int num=1 ; num <= 10000; num++) {
        if (Perfect(num)) {
        	System.out.println(num) ;
        }
	}
		
	}
	
	public static boolean Perfect(int a ) {
		int total = 0 ;
		for(int i=1; i<a; i++) {
			if( a % i == 0) {
				total = total + i ;
			}
		}
		
		if(total==a) 
			return true ;
		else 
			return false ;
	}
	

}
