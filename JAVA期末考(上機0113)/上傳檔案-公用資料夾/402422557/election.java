import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a=0,b=0,c=0,d=0,count=10;
		int election[]=new int[10];
		for(i=1;i<=10;i++){
		System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有"+count+"張選票(一)、朱阿倫(二)、蔡阿英(三)、宋阿漁 (四)、廢票");
		election[i-1]=sc.nextInt();
		count--;
		if(election[i-1]==1)
			a++;
		else if(election[i-1]==2)
			b++;
		else if(election[i-1]==3)
			c++;
		else
			d++;
		}
		System.out.println("大選結果統計:");
		System.out.println("(一)朱阿倫:"+a+"張票");
		System.out.println("(二)蔡阿英:"+b+"張票");
		System.out.println("(三)宋阿魚:"+c+"張票");
		System.out.println("(四)廢票:"+d+"張票");
		
	}

}
