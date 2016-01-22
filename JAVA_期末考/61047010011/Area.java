

import java.util.Scanner; 
import java.lang.Math;

public class Area {

	public static void main(String[] args) {
		double x1,y1,x2,y2,x3,y3;
		double side1,side2,side3,s;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
		x3=input.nextDouble();
		y3=input.nextDouble();

		side1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		side2 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
		side3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1, 2));
		s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.printf("The area of the triangle is %.1f\n",area);
	}

}
