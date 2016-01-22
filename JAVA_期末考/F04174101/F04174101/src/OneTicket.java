import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out
				.println("The number 1 for VIP and number 2 for baoxiang and number3 for qianzhongchang and number 4 for zuoyouchang  and number 5 for zuigaoquzuowei: ");
		System.out.println("Pleases choice  your Ticket: ");
		int typ = in.nextInt();
		System.out.println("Pleases enter your number: ");
		int num = in.nextInt();
		if (typ == 1) {
			System.out.println("Total Money is:  " + 3000 * num);
		} else if (typ == 2) {
			System.out.println("Total Money is:  " + 2500 * num);
		} else if (typ == 3) {
			System.out.println("Total Money is:  " + 2000 * num);
		} else if (typ == 4) {
			System.out.println("Total Money is:  " + 1000 * num);
		} else if (typ == 5) {
			System.out.println("Total Money is:  " + 500 * num);
		} else {
			System.out.println("Plase enter your Ticket number for 1~5 again!");
		}

	}

}
