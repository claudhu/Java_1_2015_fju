

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][]={
				{78,100},
				{59,80},
				{90,70},
				{65,120},
		};
					
		double b=(array[2][0]+array[2][1])/2.0;
		System.out.println("丙的平均分數:"+b);
		double total1=0,c=0;
		for(int j=0;j<1;j++)
		{
			for(int i=0;i<4;i++)
			{
				total1+=array[i][j];
				c=total1/4;
			}
		}
		System.out.println("國文成績的平均分數:"+c);
	double q=(array[0][0]+array[0][1])/2.0;
	double w=(array[1][0]+array[1][1])/2.0;
	double e=(array[2][0]+array[2][1])/2.0;
	double r=(array[3][0]+array[3][1])/2.0;
	double total2=q+w+e+r;
	double average=0;
	average=(total2/4.0);
	System.out.println("全班平均分數:"+average);
	}
    
}
