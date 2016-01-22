
public class PerfectNum {

	public static void main(String[] args) {
		System.out.printf("The perfect numbers that are less than 10000 are:\n");
		for(int i=1; i<10001; i++){
			int sum=0;
			for(int j=1; j<=i/2; j++){
				if(i%j==0){
				  sum += j;
				}
			}
			if(sum==i)
				System.out.printf("%d\n",i);
		}
           	

	}

}
