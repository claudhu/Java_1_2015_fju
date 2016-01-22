

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]={
				{78,100},
				{59,80},
				{90,70},
				{65,120}
		};
		
		
		double average = (num[2][0] + num[2][1])/2.0;
		System.out.println("(一)平均數:" + average);
		double average1 = (num[0][0] + num[1][0] + num[2][0] + num[3][0]);
		System.out.println("(二)國文成績平均分數:" + average1);
		double average2 = ((num[0][0] + num[0][1])/2 + (num[1][0]+num[1][1])/2 + (num[2][0]+num[2][1])/2 + (num[3][0]+num[3][1])/2);
		System.out.println("(三)全班的平均分數:" + average2);
		
		
		

	}

}
