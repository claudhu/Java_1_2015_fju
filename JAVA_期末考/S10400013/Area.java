import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		
	double a1,a2,b1,b2,c1,c2,side1,side2,side3,s,formula,ans,t1,t2,t3;
		
     Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter three points for a triangle:");
		
		a1 = input.nextDouble();
		
		a2 = input.nextDouble();
		
		b1 = input.nextDouble();
		
		b2 = input.nextDouble();
		
		c1 = input.nextDouble();
		
		c2 = input.nextDouble();
		
		t1=((a1-b1)*(a1-b1))+((a2-b2)*(a2-b2));
		
		side1= Math.sqrt(t1);
		
		t2=((a1-c1)*(a1-c1))+((a2-c2)*(a2-c2));
		
		side2= Math.sqrt(t2);
		
		t3=((b1-c1)*(b1-c1))+((b2-c2)*(b2-c2));
		
		side3= Math.sqrt(t3);
		
		s = ((side1+side2+side3)/2);
		
		formula = (s*(s-side1)*(s-side2)*(s-side3));
		
		ans = Math.sqrt(formula);
		
		System.out.printf("The area of the triangle is %.1f",ans);

	}

}
