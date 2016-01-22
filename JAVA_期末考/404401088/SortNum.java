
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter the three numbers :");
		int array[] = new int[3];
		String num1 = input.next();
		String num2 = input.next();
		String num3 = input.next();
		
		System.out.print("the sorting result is as follows:");
		
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		int z = Integer.parseInt(num3);
		
		num1 = x;
		num2 = y;
		num3 = z;
		
		java.util.Arrays.sort(number);
		
		
	}

}
