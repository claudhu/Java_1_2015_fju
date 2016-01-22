

public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;
		for(int i =1;i<=1000;i++){
			for(int j =1;j<=500;j++){
				 
				if(i%j==0){
					int a = i/j;
					isPrime=true;
					int b =1;
					System.out.print(i);
				while(a%b==0){
					
					
					if(a%b==0){
						isPrime=true;
						}
					
					else 
						{isPrime=false;}
					a=i/a;
					b++;
				if(isPrime){
					
				}
				}
				
				}
				
				else 
					isPrime=false;
				}
				
				
			}
		
	}

}
