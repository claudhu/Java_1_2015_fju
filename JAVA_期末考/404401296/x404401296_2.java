

import java.util.Scanner;

public class x404401296_2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.printf("enter three points:");
		double x,y;
		double x1 =input.nextDouble();
		double y1 =input.nextDouble();
		System.out.println();
		double x2 =input.nextDouble();
		double y2 =input.nextDouble();
		System.out.println();
		double x3 =input.nextDouble();
		double y3 =input.nextDouble();
		double[][] a=new double[3][2];
		
		double len1=len(x1, y1, x2, y2);
		double len2=len(x1, y1, x3, y3);
		double len3=len(x3, y3, x2, y2);
		
		double s=(len1+len2+len3)/2;
		double area=Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
		System.out.printf("The area :%5.2f",area);
		
		
	}
		public static double len(double x,double y,double x1,double y1)
		{
			
			return Math.sqrt((y1-y)*(y1-y)+(x1-x)*(x1-x));
			
		}
			
}
/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=input.nextDouble();
			}
			
		}
		
		
		
		/*double s,area;
		s=(a[0]+a[1]+a[2])/2;
		area=
			a[i]=
	}
	
	
*/
