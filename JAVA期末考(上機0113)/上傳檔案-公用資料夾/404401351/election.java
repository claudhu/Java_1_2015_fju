
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.println("中華民國總統大選，請輸入你的投票選擇，目前你還有10張選票");
	    System.out.printf("(一)、朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票\n");
	    int count=0,count2=0,count3=0,count4=0;
	    int a;
		for(int i=0;i<10;i++)
	    switch(a=input.nextInt()){
	    case 1:count++;break;
	    case 2:count2++;break;
	    case 3:count3++;break;
	    case 4:count4++;break;
	    }
	    System.out.println("大選結果統計:");
	    System.out.println("(一)、朱阿倫"+count+"票");
	    System.out.println("(二)、蔡阿英"+count2+"票");
	    System.out.println("(三)、宋阿漁"+count3+"票");
	    System.out.println("(四)、廢票"+count4+"票");
	}

}
