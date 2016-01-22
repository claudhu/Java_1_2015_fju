

public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("The perfect numbers that are less than 10000 are : ");
		for(int num=2;num<=10000;num++){
			int sum=0;
			for(int b=1;b<num;b++){
				if(num%b==0){
					sum+=b;
				}
			}
			if (sum==num){
				System.out.print("\n"+num);
			}
		}
	

	}

}
