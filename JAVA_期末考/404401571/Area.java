
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three points for a triangle");
		System.out.println("Please enter the first point ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Please enter the second point");
		double x2 = input.nextDouble();
		double y2= input.nextDouble();
		System.out.println("Please enter the third point");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		double side2 = Math.sqrt(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
		double side3 = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y3)));
		
		double S = (side1+side2+side3)/2;
		
		double area = Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
		
		System.out.println("Enter three points for a triangle: "+x1+"  "+y1+"  "+x2+"  "+y2+"  "+x3+"  "+y3+"  ");
		System.out.printf("The area of the triangle is %-4.1f",area);
		

	}

}
