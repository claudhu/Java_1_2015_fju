
import java.util.Scanner;
public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	System.out.print("Enter three spots: ");
	double x1=input.nextInt();
	double y1=input.nextInt();
	double x2=input.nextInt();
	double y2=input.nextInt();
	double x3=input.nextInt();
	double y3=input.nextInt();
	double s1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
	double s2=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
	double s3=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
	double s=(s1+s2+s3)/2;
	if (s1+s2>s3 && s1 +s3>s2 && s2+s3>s1){
		double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.print("The area of the triangle is "+ area);}
		else
			System.out.print("invalid numbers");
	
	}

}
