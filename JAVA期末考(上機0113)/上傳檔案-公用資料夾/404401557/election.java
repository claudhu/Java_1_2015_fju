

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有10張票");
		System.out.println("(一).朱阿倫\n"+"(二).蔡阿英\n"+"(三).宋阿漁\n"+"(四).廢票\n");
		
		
		int a = input.nextInt();
		int aa= 10 - a;
		System.out.println("目前你還有"+aa+"張票");
		int b = input.nextInt();
		int bb= 10 - a - b;
		System.out.println("目前你還有"+bb+"張票");
		int c = input.nextInt();
		int cc = 10 - a -b- c;
		System.out.println("目前你還有"+cc+"張票");
		int d = input.nextInt();
		
		System.out.println("大選結果統計:\n"+"(一).朱阿倫"+a+"票\n"+"(二).蔡阿英"+b+"票\n"+
				"(三).宋阿漁"+c+"票\n"+"(四).廢票"+d+"票");
		
		
		

	}

}
