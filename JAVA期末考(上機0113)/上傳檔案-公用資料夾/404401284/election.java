import java.util.Scanner;

public class election {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = 10;
		int a = 0, b = 0, c = 0, d = 0;

		System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�" + x + "�i");
		System.out.println("(�@)�B������");
		System.out.println("(�G)�B�����^");
		System.out.println("(�T)�B������ ");
		System.out.println("(�|)�o��");
		int ticket = input.nextInt();

		for (int i = 1; i <= 10; i++) {

			if (ticket == 1) {
				a++;
				x--;
			} else if (ticket == 2) {
				b++;
				x--;
			} else if (ticket == 3) {
				c++;
				x--;
			} else if (ticket == 4) {
				d++;
				x--;
			}

			System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�" + x + "�i");
			ticket = input.nextInt();
			
			if (x == 1)
				break;
		}

		System.out.println("�j�ﵲ�G�έp�G �j�ﵲ�G�έp�G ");
		System.out.println("(�@)�B������ " + a + "�� ");
		System.out.println("(�G)�B�����^ " + b + "�� ");
		System.out.println("(�T)�B������ " + c + "�� ");
		System.out.println("(�T)�B�o��  " + d + "�� ");
	}

}
