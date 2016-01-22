import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int a[]=new int [4];
		int b[]=new int [4];
		for(i=0;i<4;i++)
		    a[i]=sc.nextInt();
		for(i=0;i<4;i++)
			b[i]=sc.nextInt();
		for(i=0;i<4;i++)
		System.out.printf("%8d",a[i]);
		System.out.println("");
		for(i=0;i<4;i++)
		System.out.printf("%8d",b[i]);
		
	}

}
