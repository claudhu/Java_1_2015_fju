

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle: ");
		String points = input.nextLine();
		
		//�ڧѰO����srting�̪��Ʀr���X�ӤFQQ
		//�ڴH���|�n�n�Ʋߪ�
		
		double x1,x2,x3,y1,y2,y3  ;
		
		
		double side1 = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)) , 2 );
		double side2 = Math.sqrt(((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)) , 2 );
		double side3 = Math.sqrt(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)) , 2 );
		
		double s = (side1 + side2 + side3) / 2 ;
		double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))) ;
		
		
		
		System.out.print("The area of the triangle is " + area);
	}

}
