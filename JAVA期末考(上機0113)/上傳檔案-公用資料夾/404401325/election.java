

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a = 0,b = 0,c = 0,d = 0;
		for(int i=10;i>0;i--){
			System.out.println("中國民國國民大選,請輸入你的藤票選擇,目前你還有"+i+"張票");
			System.out.println("(一)、朱阿倫");
			System.out.println("(二)、蔡阿英");
			System.out.println("(三)、宋阿漁");
			System.out.println("(四)、廢票");
			System.out.println("輸入號碼:");
			int k=input.nextInt();
			
			if(k==1)
				a++;
			else if(k==2)
				b++;
			else if(k==3)
				c++;
			else
				d++;
			}
		System.out.println("大選統計結果:");
		System.out.println("(一)、朱阿倫"+a+" 票");
		System.out.println("(二)、蔡阿英"+b+" 票");
		System.out.println("(三)、宋阿漁"+c+" 票");
		System.out.println("(四)、    廢票"+d+" 票");

	}

}
