import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;

		for (int i = 1; i < 11; i++) {

			System.out.print("�п�J�A���벼���,�A�٦� " + (11 - i) + " �i��");
			int num = input.nextInt();
			System.out.println("1.������");
			System.out.println("2.�����^");
			System.out.println("3.������");
			System.out.print("4.�o��");

			switch (num) {

			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;

			}
			System.out.println();
		}

		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("1.������" + num1 + "��");
		System.out.println("2.�����^" + num2 + "��");
		System.out.println("3.������" + num3 + "��");
		System.out.print("4.�o��" + num4 + "��");

	}

}
