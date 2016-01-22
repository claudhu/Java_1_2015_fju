
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 3 points for a triangle: ");
		double a1=input.nextDouble();
		double a2=input.nextDouble();
		double b1=input.nextDouble();
		double b2=input.nextDouble();
		double c1=input.nextDouble();
		double c2=input.nextDouble();
		double side1=(double)(Math.sqrt((a1-b1)*(a1-b1)+(a2-b2)*(a2-b2)));
		double side2=(double)(Math.sqrt((b1-c1)*(b1-c1)+(b2-c2)*(b2-c2)));
		double side3=(double)(Math.sqrt((c1-a1)*(c1-a1)+(c2-a2)*(c2-a2)));
	    double s=(side1+side2+side3)/2;
	    double area=(double)(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	    System.out.printf("The area of the triangle:%4.1f",area);
	}

}
