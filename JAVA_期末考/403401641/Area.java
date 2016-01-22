
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in) ;
System.out.println("Enter three points for a triangle:");
int a = input.nextInt() ;
int b= input.nextInt();
int c = input.nextInt();
double s=(a+b+b)/2;
double area=(s*(s-a)*(s-b)*(s-c)) ;
	System.out.print.Math.pow(area,0.5);
	}
}
