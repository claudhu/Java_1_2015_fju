
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The perfect numbers that are less than 10000 are:");
		int num =1;
		for(int i=2;i<=10000;i++)
		{
			
			for(int j=2;j<=i;j++)
			{
				if(i%j!=0)
					continue;
				if(i%j==0)
				{
					num=num+j;
					if(i==j){
						num=num-j;
						if(num==i)
					    System.out.println(num);
						else
							break;}
					
				}
				
			}
			
			
			
			num=1;
		}

	}

}
