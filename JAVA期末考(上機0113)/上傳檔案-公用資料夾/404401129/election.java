import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 10; i > 0; i--) {
			System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�" + i
					+ "�i�ﲼ(�@)�B������(�G)�B�����^(�T)�B������ (�|)�B�o��");
			int v = input.nextInt();
			if (v == 1) {
				a++;
			} else if (v == 2) {
				b++;
			} else if (v == 3) {
				c++;
			} else {
				d++;
			}
		}
		System.out.println("�j�ﵲ�G�έp�G �j�ﵲ�G�έp�G");
		System.out.println("(�@)�B������ �B������ " + a + " ��");
		System.out.println("(�G)�B�����^ �B�����^ " + b + "��");
		System.out.println("(�T)�B������ �B������ " + c + "��");
		System.out.println("(�|)�B�o�� �B�o�� " + d + "��");
		input.close();
	}
}
