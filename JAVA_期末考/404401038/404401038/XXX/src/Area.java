import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter three points:");
	double[][] points = new double[3][2];
	for(int i = 0 ; i < points.length ; i++){
		for(int j = 0 ; j < points[i].length ; j++){
			points[i][j] = input.nextDouble();
		}
	}
	double[] side = new double[3];
	side = jisuan(points);
	double s = jisuans(side);
	double area = Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2]));
	System.out.printf("The area of the triangle is: " + "%4.1f",area);

	}
	public static double[] jisuan (double[][] point){
		double[] a = new double[3];
		for(int i = 0 ; i < a.length - 1; i++){
			a[i] = Math.sqrt((point[i][0] - point[i+1][0]) * (point[i][0] - point[i+1][0]) + (point[i][1] - point[i+1][1]) * (point[i][1] - point[i+1][1]));
		}
		a[2] =  Math.sqrt((point[0][0] - point[2][0]) * (point[0][0] - point[2][0]) + (point[0][1] - point[2][1]) * (point[0][1] - point[2][1]));
		return a ;
	}
	public static double jisuans(double[] b){
		double x = 0;
		for(int i = 0 ; i < b.length ; i++){
			x += b[i];
		}
		x = x / 2 ;
		return x ;
	}

}
