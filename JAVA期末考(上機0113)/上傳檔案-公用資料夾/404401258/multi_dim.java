
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][] = {
				{78,100},
				{59,80},
				{90,70},
				{65,120}
		};
		
		double average = (num[2][0]+num[2][1])/2.0;
		System.out.println("(�@)�����������Ƭ�"+average);
		
		int total = 0;
		for(int i=0 ; i<num.length ; i++)
			total += num[i][0];
		average = total/4.0;
		System.out.println("(�G)��妨�Z���������Ƭ�"+average);
		
		total = 0;
		for(int i=0 ; i<num.length ; i++)
			for(int k=0 ; k<num[i].length ; k++)
				total += num[i][k];
		average = total/8.0;
		System.out.println("(�T)���Z���������Ƭ�"+average);
		
		

	}

}
