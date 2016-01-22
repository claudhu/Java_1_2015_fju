import java.util.Scanner;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter therr points for a triangle:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double xxx1 = (x1-x2)*(x1-x2);
		double xxx2 = (x2-x3)*(x2-x3);
		double xxx3 = (x3-x1)*(x3-x1);
		double yyy1 = (y1-y2)*(y1-y2);
		double yyy2 = (y2-y3)*(y2-y3);
		double yyy3 = (y3-y1)*(y3-y1);
		double xx1=Math.abs(xxx1);
		double xx2=Math.abs(xxx2);
		double xx3=Math.abs(xxx3);
		double yy1=Math.abs(yyy1);
		double yy2=Math.abs(yyy2);
		double yy3=Math.abs(yyy3);
		
		double ss1 =xx1+yy1;
		double ss2 =xx2+yy2;
		double ss3 =xx3+yy3;
		double s1=Math.pow(ss1, 0.5);
		double s2=Math.pow(ss2, 0.5);
		double s3=Math.pow(ss3, 0.5);
		double s=(s1+s2+s3)/2;
		double area1=s*(s-s1)*(s-s2)*(s-s3);
		double area=Math.pow(area1, 0.5);
		System.out.printf("The aera of the triangle: %.1f",area);
				

		
		input.close();
	}

}
