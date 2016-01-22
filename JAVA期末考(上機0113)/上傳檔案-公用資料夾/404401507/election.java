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

			System.out.print("請輸入你的投票選擇,你還有 " + (11 - i) + " 張票");
			int num = input.nextInt();
			System.out.println("1.朱阿姨");
			System.out.println("2.蔡阿英");
			System.out.println("3.宋阿漁");
			System.out.print("4.廢票");

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

		System.out.println("大選結果統計:");
		System.out.println("1.朱阿姨" + num1 + "票");
		System.out.println("2.蔡阿英" + num2 + "票");
		System.out.println("3.宋阿漁" + num3 + "票");
		System.out.print("4.廢票" + num4 + "票");

	}

}
