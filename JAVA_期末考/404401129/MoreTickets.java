import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] x = new int[6][2];
		x[1][0] = 1;
		x[1][1] = 3000;
		x[2][0] = 2;
		x[2][1] = 2500;
		x[3][0] = 3;
		x[3][1] = 2000;
		x[4][0] = 4;
		x[4][1] = 1000;
		x[5][0] = 5;
		x[5][1] = 500;
		int sum = 0 ;
		while (true) {
			System.out.println("Which one ticket you want to buy ? ( 1 ~ 5 ) ");
			int p = input.nextInt();
			int m = x[p][1];
			if(p == 0){
				break;
			}
			System.out.println("How many this kind of tickets you want ? ");
			int a = input.nextInt();
			int z = (m*a) ;
			sum = sum + z ;
		}
		System.out.println("The total you need to pay : " + sum);
		input.close();
	}

}
