import java.util.Scanner;


public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�T���I");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 , side2 , side3 , s , area ;
		
		side1=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		side2=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
		side3=Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		
		s = (side1+side2+side3)/2;
		
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("The area of tringle is "+ area);
	}

}
