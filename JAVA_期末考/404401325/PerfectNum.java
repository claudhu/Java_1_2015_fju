

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the perfect numbers that are less than 10000 are:");
		int total = 0;
		for(int i=1;i<=10000;i++){
			for(int k=1;k<i;k++){
				if(i%k==0){
					
				  total=total+k;
			}
				
			}
			if(total==i){
				System.out.println(i);
			}
			
		}

	}

}
