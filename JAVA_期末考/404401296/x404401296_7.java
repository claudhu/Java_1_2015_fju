

public class x404401296_7 {

	public static void main(String[] args) {
		
		int sum=1;
		System.out.println("the perfect num:");
		
		
		for(int n=2;n<=1000;n++)
		{
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					sum=sum+i;
			}
			
			if(sum==n)
				System.out.println(n);	
				sum=1;
		}

	}

}
