
import java.util.Scanner;
public class election {

	public static void main(String[] args) 
	{
		System.out.println("(一)朱阿倫 (二)蔡阿英 (三)宋阿漁 (四)廢票");
		Scanner input = new Scanner(System.in);
		for(int i = 10; i >= 1; i--)
		{
			System.out.println("中華民國總統大選，請輸入你的投票選擇，目前你還有" + i + "張票");
			int v = input.nextInt();
			election(v);
		}
	}
	public static void election(int a)
	{
		switch(a)
		{
		case 1:
			System.out.println("(一)朱阿倫");
			break;
		case 2:
			System.out.println("(二)蔡阿英");
			break;
		case 3:
			System.out.println("(三)宋阿漁");
			break;
		case 4:
			System.out.println("(四)廢票");
			break;
		}
	}

}
