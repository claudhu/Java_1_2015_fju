import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 3 points for a triangle:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
	
    double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
    double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
	
	double s = (a + b + c ) /2 ;
	double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
	System.out.printf("The area of the triangle is %-5.1f", area);
	
	
	
	}

}
