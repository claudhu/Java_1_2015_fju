import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter three points for a triangle: " ) ;
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1, side2, side3;
		side1 = computeSide(x1,y1,x2,y2) ;
		side2 = computeSide(x2,y2,x3,y3) ;
		side3 = computeSide(x3,y3,x1,y1) ;
		
		double s = (side1 + side2 +side3) /2 ;
		double tem = s*(s-side1)*(s-side2)*(s-side3) ;
		double area = Math.pow(tem, 0.5) ;
		
		System.out.print("The area of the triangle is ");
		System.out.printf("%-10.1f", area) ;
	
	}
	
	public static double computeSide(double a , double b, double c, double d )   {
		double tem = (a-c)*(a-c) + (b-d)*(b-d);
		double side = Math.pow(tem, 0.5) ;
		return side ;
		
	}
}
