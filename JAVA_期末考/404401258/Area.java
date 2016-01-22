

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter three points for a triangle: ");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double point [][] = new double [3][2];
		
		for(int i=0 ; i<point.length ; i++){
			point[i][0] = input.nextDouble();
			point[i][1] = input.nextDouble();
		}
		
		double side1 = compute(point[0][0],point[0][1],point[1][0],point[1][1]);
		double side2 = compute(point[0][0],point[0][1],point[2][0],point[2][1]);
		double side3 = compute(point[1][0],point[1][1],point[2][0],point[2][1]);
		
		double s = (side1+side2+side3)/2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.printf("The area of the triangle is %4.1f",area);

	}
	
	public static double compute(double x1, double y1,double x2,double y2){
		double x = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		return x;
	}

}
