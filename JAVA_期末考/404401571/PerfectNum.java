

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1 ;
		for(num =1; num<=10000;num++){
			for(int a=2;a<num;a++){
				if(num%a==0){
					System.out.print(a);
				}
				
			}
			
		}

	}

}
