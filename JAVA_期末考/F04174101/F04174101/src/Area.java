import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pleases enter three points for a triangle: ");
		double x1 =in.nextDouble();
		double y1 =in.nextDouble();
		double x2 =in.nextDouble();
		double y2 =in.nextDouble();
		double x3 =in.nextDouble();
		double y3 =in.nextDouble();
		double side1= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double side2= Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		double side3= Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		double s =(side1+side2+side3)/2;
		double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.printf("The areas of the triangle:%4.1f ",area);
		
	}

}
