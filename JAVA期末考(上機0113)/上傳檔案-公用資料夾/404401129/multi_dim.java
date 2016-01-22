public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{78, 100}, 
					 {59, 80 }, 
					 {90, 70 }, 
					 {65, 120}};
		int a = x[2][0] + x[2][1];
		int b = a / 2 ;
		System.out.println("丙的平均分數:" + b );
		int c = x[0][0] + x[1][0] + x[2][0] + x[3][0] ;
		int d = c / 4 ;
		System.out.println("國文成績平均分數:" + d );
		int e = x[0][0] + x[0][1];
		double i = e / 2 ;
		int f = x[1][0] + x[1][1];
		double j = f / 2 ;
		int g = x[2][0] + x[2][1];
		double k = g / 2 ;
		int h = x[3][0] + x[3][1];
		double l = h / 2 ;
		double m =( i + j + k + l ) / 4 ;
		System.out.println("全班的平均分數:" + m );
	}

}
