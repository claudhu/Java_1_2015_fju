
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The perfect numbers that are less than 10000 are: ");
		for(int i=1;i<=10000;i++){
			int k = 0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					k=k+j;
					
			}
			if(i==k)
					System.out.println(i);
		}

		
	}
	

}
