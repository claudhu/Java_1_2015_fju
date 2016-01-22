import java.util.*;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入8個數字:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		
		
		System.out.printf("%7d%10d%10d%10d \n%7d%10d%10d%10d",num1,num2,num3,num4,num5,num6,num7,num8);
	}

}
