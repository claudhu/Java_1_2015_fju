import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the three numbers : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a > b || a > c || b > c)
			System.out.print("The sorting result is as follows " + c +" "+ b +" "+ a );
		else if(b > a || b > c || a > c)
			System.out.print("The sorting result is as follows " + c +" "+ a +" "+ b );
		else if(c > b || c > a || b > a)
			System.out.print("The sorting result is as follows " + a +" "+ b +" "+ c );
	}

}
