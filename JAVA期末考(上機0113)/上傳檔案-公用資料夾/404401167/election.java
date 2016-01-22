import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("中華民國總統大選，請輸入你的投票選擇，目前您還有10張選票");
		System.out.println("(一)、朱阿倫");
		System.out.println("(二)、蔡阿英");
		System.out.println("(三)、宋阿漁");
		System.out.println("(四)、廢票");
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		for(int i=10;i>0;i--){
			int j=input.nextInt();
			System.out.println("中華民國總統大選，請輸入你的投票選擇，目前您還有"+(i-1)+"張選票");
			System.out.println("(一)、朱阿倫");
			System.out.println("(二)、蔡阿英");
			System.out.println("(三)、宋阿漁");
			System.out.println("(四)、廢票");
			if(j==1)
				n1++;
			
			else if(j==2)
				n2++;
			
			else if(j==3)
				n3++;
			
			else
				n4++;
	
			
			
		}
		System.out.println("大選結果統計:");
		System.out.println("(一)、朱阿倫  "+n1+"票");
		System.out.println("(二)、蔡阿英  "+n2+"票");
		System.out.println("(三)、宋阿漁  "+n3+"票");
		System.out.println("(四)、廢票  "+n4+"票");
		

	}

}
