

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.print("中國民總統大選，請輸入你的投\n票選擇目前你還有10張票"
		+"\n(一)、朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票\n");
		int a=0,b =0,c=0,d=0;
		for(int i = 9;i>=0;i--){
			int ticket=input.nextInt();
			if(ticket==1)
				a++;
			if(ticket==2)
				b++;
			if(ticket==3)
				c++;
			if(ticket==4)
				d++;
			System.out.println("目前你還有"+i+"張票");
		}
		System.out.println("大選結果統計");
		System.out.println("(一)、朱阿倫"+a+"票");
		System.out.println("(二)、蔡阿英"+b+"票");
		System.out.println("(三)、宋阿漁"+c+"票");
		System.out.println("(四)、廢票"+d+"票");
		
	 
		input.close();
		
		}
	}


