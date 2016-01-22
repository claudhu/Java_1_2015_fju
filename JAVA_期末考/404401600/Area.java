import java.util.Scanner;
public class Area {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1 =input.nextDouble();
		double y1 =input.nextDouble();
		double x2 =input.nextDouble();
		double y2 =input.nextDouble();
		double x3 =input.nextDouble();
		double y3 =input.nextDouble();
		System.out.println();
		double side1o = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		double side1 = Math.sqrt(side1o);
		double side2o = (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
		double side2 = Math.sqrt(side2o);
		double side3o = (x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
		double side3 = Math.sqrt(side3o);
		double s =(side1+side2+side3)/2;
		double areao = s*(s-side1)*(s-side2)*(s-side3);
		double area =Math.sqrt(areao);
		System.out.print("The area of the triangle is "+area);
		
	}

}
