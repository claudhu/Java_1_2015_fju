
import java.util.*;
public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[6];
		double side1=0,side2=0,side3=0;
		System.out.printf("Enter three points for a triangle:");
		for(int i=0; i<array.length; i++){
			array[i] = input.nextDouble();
			}
		side1 = Math.sqrt((array[0]-array[2])*(array[0]-array[2])+(array[1]-array[3])*(array[1]-array[3]));
		side2 = Math.sqrt((array[0]-array[4])*(array[0]-array[4])+(array[1]-array[5])*(array[1]-array[5]));
		side3 = Math.sqrt((array[2]-array[4])*(array[2]-array[4])+(array[3]-array[5])*(array[3]-array[5]));
		double s=(side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.printf("The area of the triangle is %.1f",area);
	}

}
