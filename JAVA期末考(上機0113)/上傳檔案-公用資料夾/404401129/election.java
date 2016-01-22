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
			System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有" + i
					+ "張選票(一)、朱阿倫(二)、蔡阿英(三)、宋阿漁 (四)、廢票");
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
		System.out.println("大選結果統計： 大選結果統計：");
		System.out.println("(一)、朱阿倫 、朱阿倫 " + a + " 票");
		System.out.println("(二)、蔡阿英 、蔡阿英 " + b + "票");
		System.out.println("(三)、宋阿魚 、宋阿魚 " + c + "票");
		System.out.println("(四)、廢票 、廢票 " + d + "票");
		input.close();
	}
}
