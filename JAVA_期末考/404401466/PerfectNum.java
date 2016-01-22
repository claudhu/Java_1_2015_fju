

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~1000的完美數字為:");
		int num = 1;
		int sum = 0;
		
		while(num<=1000){
			
			for(int divisor=1;divisor<=num/2;divisor++){
				if(num%divisor==0){
					boolean isP = true;
					sum+=num;
				}
				else{
					num++;
				}
				
		
				
				
		
					
			}
		}

	}

}
