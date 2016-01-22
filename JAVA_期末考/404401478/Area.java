

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("請輸入三個點");
		Double x1=input.nextDouble();
		Double y1=input.nextDouble();
		Double x2=input.nextDouble();
		Double y2=input.nextDouble();
		Double x3=input.nextDouble();
		Double y3=input.nextDouble();
		
		Double side1 =Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		Double side2 =Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		Double side3 =Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		 System.out.println("side1 = "+side1);
		 System.out.println("side2 = "+side2);
		 System.out.println("side3 = "+side3);
		 Double s= (side1+side2+side3)/2.0;
		 
		 Double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		 System.out.println("area = "+area);
		
		

	}

}
