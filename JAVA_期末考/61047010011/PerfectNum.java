

public class PerfectNum {

	public static void main(String[] args) {
		System.out.println("The perfect numbers that are less than 10000 are:");
		for(int i=1;i<10000;i++) {
			if(checkPerfect(i)) {
			System.out.printf("%d\n",i);
			}
			
		}	

	}
	public static boolean checkPerfect(int n){
		int sum=0;
		for(int i=1;i<n;i++) {
			if((n%i)==0) {
				sum=sum+i;
			}	
		}
		if(sum==n)
			return true;
		else
			return false;
	}
}
