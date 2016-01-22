import java.util.Scanner;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three points for a triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double side1=Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
		double side2=Math.sqrt((e-c)*(e-c)+(f-d)*(f-d));
		double side3=Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
		
		double s = (side1+side2+side3)/2;
		
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.printf("The area of the triangle is:"+" %2.1f ",area);
		

	}

}
