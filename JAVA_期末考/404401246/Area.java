import java.util.Scanner;
public class Area {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the three points for triangle: ");
	
		double number[][] = new double[3][2];
		for(int i=0; i<3; i++){
				number[i][0]=input.nextDouble();
				number[i][1]=input.nextDouble();
			
		}
		
		area(number[0][0],number[0][1],number[1][0],number[1][1],number[2][0],number[2][1]);
		
}
	
	
	public static void area (double x1,double y1,double x2,double y2,double x3,double y3){
		double distance1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double distance2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double distance3 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		
		double s = (distance1+distance2+distance3)/2;
		
		double area = Math.sqrt(s*(s-distance1)*(s-distance2)*(s-distance3));
		
		System.out.print("the area of the triangle is "+area);
	}
	

}