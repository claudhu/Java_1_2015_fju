import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the three numbers:");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.println("The sorting result is as follows:");
		
		if (a<=b && b<=c)
			
			System.out.printf("%d %d %d",a,b,c);
		else if  (a<=b && c<=b)
	
			System.out.printf("%d %d %d",a,c,b);
		else if  (b<=a && a<=c)
			System.out.printf("%d %d %d",b,a,c);
		else if  (b<=c && c<=a)
			System.out.printf("%d %d %d",b,c,a);
		else if  (c<=a && a<=b)
			System.out.printf("%d %d %d",c,a,b);
		else
			System.out.printf("%d %d %d",c,b,a);
		
	}
	
	
	

}



