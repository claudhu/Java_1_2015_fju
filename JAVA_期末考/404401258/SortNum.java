

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Please enter the three numbers : ");
		
		int number[] = new int[3];
		
		String num1 = input.next();
		String num2 = input.next();
		String num3 = input.next();
		
		System.out.println("The sorting result is as follows:");
		
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		int z = Integer.parseInt(num3);
		
		number[0] = x;
		number[1] = y;
		number[2] = z;
		
		java.util.Arrays.sort(number);
		
		for(int e:number)
			System.out.print(e+" ");
	}

}
