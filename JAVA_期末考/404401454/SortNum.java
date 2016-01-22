import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =  new Scanner(System.in);  
        System.out.println("Please enter the three numbers:");       
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt(); 
        System.out.println("The sorting result is as follows:");
        if(a>b && a>c && b>c)
        	System.out.printf("%2d  %2d  %2d",c,b,a);
        if(b>a && b>c && a>c)
        	System.out.printf("%2d  %2d  %2d",c,a,b);
        if(c>a && c>b && a>b)
        	System.out.printf("%2d  %2d  %2d",b,a,c);
        if(a>b && a>c && c>b)
        	System.out.printf("%2d  %2d  %2d",b,c,a);
        if(b>a && b>c && c>a)
        	System.out.printf("%2d  %2d  %2d",a,c,b);
        if(c>b && c>a && b>a)
        	System.out.printf("%2d  %2d  %2d",a,b,c);
       
	}

}
