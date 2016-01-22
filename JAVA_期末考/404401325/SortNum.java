

import java.util.Scanner;

public class SortNum {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the three number:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
	   if(a>b&&a>c&&b>c)
		   System.out.println(c+" "+b+" "+a+" ");
	   else if(a>b&&c>b&&b>c)
		   System.out.println(b+" "+c+" "+a+" ");
	   else if(b>a&&a>c&&b>c)
		   System.out.println(c+" "+a+" "+b+" ");
	   else if(b>a&&c>a&&b>c)
		   System.out.println(a+" "+c+" "+b+" ");
	   else if(c>a&&a>b&&c>b)
		   System.out.println(b+" "+a+" "+c+" ");
	   else 
		   System.out.println(a+" "+b+" "+c+" ");
	   
	   input.close();
	   
	}

}
