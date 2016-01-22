

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for a triangle");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = x2-x1;
		double side11 = y2-y1;
		double side2 = x3-x2;
		double side22 = y3-y2;
		double side3 = x3-x1;
		double side33 = y3-y1;
		double side111 = (double)(Math.pow(side1,2));
		double side1111 = (double)(Math.pow(side11,2));
		double side222 = (double)(Math.pow(side2,2));
		double side2222 = (double)(Math.pow(side22,2));
		double side333 = (double)(Math.pow(side3,2));
		double side3333 = (double)(Math.pow(side33,2));
		double final1 = (double)(Math.sqrt(side111+side1111));
		double final2 = (double)(Math.sqrt(side222+side2222));
		double final3 = (double)(Math.sqrt(side333+side3333));
		double s =(final1+final2+final3)/2;
		double area0= s*(s-final1)*(s-final2)*(s-final3);
		double area= (double)(Math.sqrt(area0));
		System.out.print("The area of the triangle is");
		System.out.printf("%5.1f",area);
		
		
	}

}
