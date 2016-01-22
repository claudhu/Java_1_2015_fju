import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the three numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b&&a>c&&b>c)
			System.out.println(c+" "+b+" "+a);
		else if(a>b&&a>c&&b>c)
			System.out.println(b+" "+c+" "+a);
		else if(b>a&&b>c&&a>c)
			System.out.println(c+" "+a+" "+b);
		else if(b>a&&b>c&&c>a)
			System.out.println(a+" "+c+" "+b);
		else if(c>a&&c>b&&a>b)
			System.out.println(b+" "+a+" "+c);
		else
			System.out.println(a+" "+b+" "+c);

	}

}
