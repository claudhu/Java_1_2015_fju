
import java.util.Scanner;
public class print_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     int a=input.nextInt();
     int b=input.nextInt();
     int c=input.nextInt();
     int d=input.nextInt();
     int e=input.nextInt();
     int f=input.nextInt();
     int g=input.nextInt();
     int h=input.nextInt();
     
     System.out.printf("\t%-3d\t%-4d\t%-6d\t%-2d\t",a,b,c,d);
     System.out.println("");
     System.out.printf("\t%-6d\t%-4d\t%-2d\t%-2d\t",e,f,g,h);
	}

}
