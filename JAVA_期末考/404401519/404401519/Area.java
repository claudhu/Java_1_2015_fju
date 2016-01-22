
import java.util.Scanner;
public class Area {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter three points for a triangle");
	double x1 = input.nextDouble(); 
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	double a = x1 - x2 ,  b = y1 - y2 ,  c = x2 - x3 ,  d = y2 - y3 ,  e = x1 - x3  ,  f = y1 - y3 ;
	double g = Math.pow(a,2), h = Math.pow(b,2), i = Math.pow(c,2), j = Math.pow(d,2), k = Math.pow(e,2), l = Math.pow(f,2);
	double m=g+h , n=i+j , o=k+l ;  
	double side1 = Math.sqrt(m) , side2 = Math.sqrt(n) , side3 = Math.sqrt(o) ;
	double s = (side1+ side2+ side3 )/2;
	double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); 
	System.out.println("The area of the triangle is : "+area);	
}

}
