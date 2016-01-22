import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		System.out.print("Please enter 9 digits : ");
		for (int i = 0; i <= 8; i++) {
			num[i] = input.nextInt();
		}
		int c = (num[0] * 1 + num[1] * 2 + num[2] * 3 + num[3] * 4 + num[4] * 5
				+ num[5] * 6 + num[6] * 7 + num[7] * 8 + num[8] * 9) % 11;
		if(c == 10){
			System.out.println("The check number is : X" );
		}
		else{
			System.out.println("The check number is : " + c );
		}
		System.out.print("The ISBN is :");
		for(int i = 0 ; i <= 8 ; i++){
			System.out.print(num[i]);
		}
		if(c == 10)
		System.out.print("X");
		else
		System.out.print(c);
		input.close();
	}

}
