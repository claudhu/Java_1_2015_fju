
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("The perfect numbers that are less than 10000 are: ");
		
		int sum = 0 ;
		//try numbers 1 ~ 10000
		for ( int i = 1 ; i <= 10000 ; i ++){
			for ( int m = 1 ; m <= ( i / 2 ) ; m ++ ){
				if ( ( i % m  == 0 ) && ( m != i ) ){
					sum = sum + m ;
				}
			}
			if ( sum == i){
				System.out.println(i);
			}
			sum = 0 ;
		}
	}

}
