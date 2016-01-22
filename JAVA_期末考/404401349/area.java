import java.util.Scanner;

public class area1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("enter three points for a triangle¡F");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		
		double s1=Math.sqrt(((x1*x1)+(y1*y1)));
		double s2=Math.sqrt(((x2*x2)+(y2*y2)));
		double s3=Math.sqrt(((x3*x3)+(y3*y3)));
		double s=(s1+s2+s3)/2;
		double a= s*(s-s1)*(s-s2)*(s-s3);
		double area =Math.sqrt(a);
		System.out.printf("the area of the triangle is %3.1f",area);
		input.close();
	}

}
