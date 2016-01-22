import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter 8 numbers");
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int n4=input.nextInt();
		int n5=input.nextInt();
		int n6=input.nextInt();
		int n7=input.nextInt();
		int n8=input.nextInt();
		System.out.printf("%10d %10d %10d %10d\n",n1,n2,n3,n4);
		System.out.printf("%10d %10d %10d %10d",n5,n6,n7,n8);
		input.close();
	}

}
