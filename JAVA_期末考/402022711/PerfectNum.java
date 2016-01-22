
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 2 ; i <= 10000 ; i++){
			int total = 0;
			
			for(int j = 1 ; j < i ; j++){
							
				if (i % j == 0){
					total = total + j; 
				}						
				
			}
			
			if (i / total == 1 && i % total == 0){
				System.out.println(i + " " +total);
			}
			
									
		}
		
	}

	
	
	
}
