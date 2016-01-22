import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] t = { 3000, 2500, 2000, 1000, 500 };
		System.out.println("Which one ticket you want to buy ? ( 1 ~ 5 ) ");
		int p = input.nextInt();
		int m = t[p-1];
		System.out.println("How many tickets you want ? ");
		int a = input.nextInt();
		System.out.println("You need to pay : " +  m * a);
		input.close();
	}

}
