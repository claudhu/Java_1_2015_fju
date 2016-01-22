
public class PerfectNum {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.println("The perfect numbers that are less than 10000 are:");
		
		for (int i = 1 ;i<=10000 ; i++){
			
			num = 0;
			
			for (int j = 1 ; j<=(i/2) ; j++){
				if (i%j==0){
                 num = num + j;
				}
			}
	
		    if (num == i ){
			
			System.out.printf("%d\n",num);
		}
			
		
		
		}
	}

}