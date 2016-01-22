

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
	System.out.println("中華民國大選，請輸入你的投");
	System.out.println("票選擇，目前您還有10張選票");
	System.out.println("(一)、朱阿倫");
	System.out.println("(二)、蔡阿英");
	System.out.println("(三)、宋阿漁");
	System.out.println("(四)、廢票");
	int num1=0 , num2=0 , num3=0 , num4=0 ;
	for (int i = 10 ; i>=1 ; i--){
		int ticket = input.nextInt();
		if(ticket==1)
			num1++;
		if(ticket==2)
			num2++;
		if(ticket==3)
			num3++;
		if(ticket==4)
			num4++;
		if(ticket<1||ticket>4)
			num4++;
		System.out.println("你還有"+(i-1)+"張票");
			
	}
	    System.out.println("大選結果統計:");
	    System.out.println("(一)、朱阿倫"+num1+"票");
	    System.out.println("(一)、蔡阿英"+num2+"票");
	    System.out.println("(一)、宋阿漁"+num3+"票");
	    System.out.println("(一)、廢票"+num4+"票");
	
	
	}

}
