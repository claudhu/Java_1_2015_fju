
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int ticket=10;
		int a=0,b=0,c=0,d=0;
		for(int i=1;i<=10;i++)
		{
		System.out.println("中國民總統大選，請輸入你的投票選擇,目前你還有"+ticket+"張選票,(一)ˋ朱阿倫,"
				+ "(二)ˋ蔡阿英,(三)ˋ宋阿漁,(四)ˋ廢票");
		int k=input.nextInt();
		switch(k)
		{
		case 1:a++;break;
		case 2:b++;break;
		case 3:c++;break;
		default:d++;break;
		}
		ticket--;
		}
		System.out.println("大選結果統計:");
		System.out.println("(一)朱阿倫ˋ"+a+"票");
		System.out.println("(二)蔡阿英ˋ"+b+"票");
		System.out.println("(三)宋阿漁ˋ"+c+"票");
		System.out.println("(四)廢票ˋ"+d+"票");
	}

}
