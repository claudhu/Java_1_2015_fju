import java.util.Scanner;


public class Area {

	

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("輸入三個點的數字");
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		double X3 = input.nextDouble();
		double Y3 = input.nextDouble();
		double side1 = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		double side2 = Math.sqrt((X3-X1)*(X3-X1)+(Y3-Y1)*(Y3-Y1));
		double side3 = Math.sqrt((X3-X2)*(X3-X2)+(Y3-Y2)*(Y3-Y2));
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("area:"+area);

	}


}
