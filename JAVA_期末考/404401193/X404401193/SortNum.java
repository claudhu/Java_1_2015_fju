import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers:");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		
		if(a>b&&a>c&&b>c)
			System.out.println("The sorting result is as follows:\n"+c+" "+b+" "+a);
		if(a>b&&a>c&&c>b)
			System.out.println("The sorting result is as follows:\n"+b+" "+c+" "+a);
		if(b>c&&b>a&&c>a)
			System.out.println("The sorting result is as follows:\n"+a+" "+c+" "+b);
		if(b>c&&b>a&&a>c)
			System.out.println("The sorting result is as follows:\n"+c+" "+a+" "+b);
		if(c>a&&c>b&&b>a)
			System.out.println("The sorting result is as follows:\n"+a+" "+b+" "+c);
		if(c>a&&c>b&&a>b)
			System.out.println("The sorting result is as follows:\n"+b+" "+a+" "+c);
					
	
	}

}
