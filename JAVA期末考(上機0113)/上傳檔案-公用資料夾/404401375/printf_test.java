import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("�п�J8�Ӽ�");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
int d = input.nextInt();
int e = input.nextInt();
int f = input.nextInt();
int g = input.nextInt();
int h = input.nextInt();
System.out.printf("%6d%10d%12d%10d\n",a,b,c,d);
System.out.printf("%6d%10d%12d%10d",e,f,g,h);
	}

}
