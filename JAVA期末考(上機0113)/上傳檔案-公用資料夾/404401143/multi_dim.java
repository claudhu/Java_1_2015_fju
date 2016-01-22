

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] a=
     {{78,100},{59,80},{90,70},{65,120}
    		 
     };
     int sum=0;
     int b=(a[2][0]+a[2][1])/2;
     System.out.println("丙班的平均分數:"+b);
	 int c=(a[0][0]+a[1][0]+a[2][0]+a[3][0])/4;
	 System.out.println("國文成績的平均分數:"+c);
	 
	 int d=(a[1][0]+a[1][1])/2;
	 int e=(a[3][0]+a[3][1])/2;
	 int f=(a[0][0]+a[0][1])/2;
	 int average=(f+b+d+e)/4;
	 System.out.println("全班的平均分數:"+average);
	 
	 }

}
