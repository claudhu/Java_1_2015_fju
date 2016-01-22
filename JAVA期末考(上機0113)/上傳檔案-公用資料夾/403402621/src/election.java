import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=10;
		System.out.println("中華民國總統大選，請輸入你的投\n票選擇，目前您還有"+n+"張選票\n(一)、朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票");
		int a = 0;
		int b=0;
		int c=0;
		int d=0;
		int i;
		for(int k=1;k<=10;k++){
			switch(i=input.nextInt()){
			case 1:
				a=a+1;
			case 2:
				b=b+1;
			case 3:
				c=c+1;
			case 4:
				d=d+1;
			}
		}
		System.out.print("大選結果統計:\n(一)、朱阿倫"+a+"票\n(二)、蔡阿英"+b+"票\n(三)、宋阿漁"+c+"票\n(四)、廢票"+d+"票");

	}

}
