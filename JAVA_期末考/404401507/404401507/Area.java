import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle: ");
		double[] list = new double[6];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		
		double side1 = (Math.sqrt(((list[0] - list[2]) * (list[0] - list[2]) + (list[1] - list[3]) * (list[1] - list[3]))));
		double side2 = (Math.sqrt(((list[0] - list[4]) * (list[0] - list[4]) + (list[1] - list[5]) * (list[1] - list[5]))));
		double side3 = (Math.sqrt(((list[2] - list[4]) * (list[2] - list[4]) + (list[3] - list[5]) * (list[3] - list[5]))));
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.printf("%s %2.1f" , "The area of the triangle is" , area);
				

	}

}
