

public class multi_dim {

	public static void main(String[] args) {
		
		int[][]a={{78,100},{59,80},{90,70},{65,120}};
		System.out.println("丙平均:"+((a[2][0]+a[2][1])/2.0));
		
		float s=0;
		for(int i=0;i<a.length;i++)
			s=s+a[i][0];
		System.out.println("國文平均:"+(s/4.0));
		
		float sum=0,sumaverage=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[j].length;j++)
			{
				sum=sum+a[i][j];
			}
			sumaverage=sumaverage+(sum/2);
			sum=0;
		}
		System.out.println("全班平均:"+(sumaverage/4.0));
	}

}
