
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for a triangle : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		double Side1 = Math.sqrt(side1);
		double side2 = ((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2));
		double Side2 = Math.sqrt(side2);
		double side3 = ((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3));
		double Side3 = Math.sqrt(side3);
		double s = (Side1+Side2+Side3)/2;
		double area = s*(s-Side1)*(s-Side2)*(s-Side3);
		double Area = Math.sqrt(area);
		System.out.print("The area of the triangle is ");
		System.out.printf( "%10.1f" , Area);

	}

}
