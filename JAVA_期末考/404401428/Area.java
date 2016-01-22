import java.util.Scanner;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter three points for a triangle : ");
		double side1 , side2 , side3 , s , area;
		
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		double x3 = scn.nextDouble();
		double y3 = scn.nextDouble();
		
		side1 = Math.sqrt(Math.pow((x1-x2), 2) +Math.pow((y1-y2), 2));
		side2 = Math.sqrt(Math.pow((x2-x3), 2) +Math.pow((y2-y3), 2));
		side3 = Math.sqrt(Math.pow((x3-x1), 2) +Math.pow((y3-y1), 2));
		
		s = (side1 + side2 + side3)/2;
		
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("The area of the triangle is : " + area);
	}

}
