import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("請輸入三個座標質");

Scanner input = new Scanner(System.in);

double x1 = input.nextDouble();

double x2 = input.nextDouble();

double x3 = input.nextDouble();	
	
double y1 = input.nextDouble();

double y2 = input.nextDouble();

double y3 = input.nextDouble();
	
double side1 = (x2-x1)*(x2-x1)/(x2-x1)+((y2-y1)*(y2-y1))/(y2-y1); 	
	
double side2 = ((x3-x1)*(x3-x1))/(x3-x1)+((y3-y1)*(y3-y1))/(y3-y1);

double side3 = ((x3-x2)*(x3-x2))/(x3-x2)+((y3-y2)*(y3-y2))/(y3-y2);

double s = (side1+side2+side3)/2;

double area=s*(s-side1)*(s-side2)*(s-side3);

System.out.println("the area of triangle is"+area);


	}

}
