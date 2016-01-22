import java.util.Scanner;
public class Area {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle¡G");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double ss1 = (x2 - x1) * (x2 - x1);
		double ss11 = (y2 - y1) * (y2 - y1);
		double s1 = (double)(Math.sqrt(ss1 + ss11));
		double ss2 = (x3 - x1) * (x3 - x1);
		double ss22 = (y3 - y1) * (y3 - y1);
		double s2 = (double)(Math.sqrt(ss2 + ss22));
		double ss3 = (x3 - x2) * (x3 - x2);
		double ss33 = (y3 - y2) * (y3 - y2);
		double s3 = (double)(Math.sqrt(ss3 + ss33));
		double s = (s1 + s2 + s3) / 2;
		double a = s * (s - s1) * (s - s2) * (s - s3);
		double area = (double)(Math.sqrt(a));
		System.out.println("The area of triangle is " + area);
	}

}
