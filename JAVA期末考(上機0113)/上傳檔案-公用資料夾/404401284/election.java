import java.util.Scanner;

public class election {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = 10;
		int a = 0, b = 0, c = 0, d = 0;

		System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有" + x + "張");
		System.out.println("(一)、朱阿倫");
		System.out.println("(二)、蔡阿英");
		System.out.println("(三)、宋阿漁 ");
		System.out.println("(四)廢票");
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

			System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有" + x + "張");
			ticket = input.nextInt();
			
			if (x == 1)
				break;
		}

		System.out.println("大選結果統計： 大選結果統計： ");
		System.out.println("(一)、朱阿倫 " + a + "票 ");
		System.out.println("(二)、蔡阿英 " + b + "票 ");
		System.out.println("(三)、宋阿魚 " + c + "票 ");
		System.out.println("(三)、廢票  " + d + "票 ");
	}

}
