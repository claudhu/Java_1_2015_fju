
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("中華民國總統大選，請輸入您的投票選擇，目前您還有10張選票\n(一)、朱阿倫"
				+ "\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票");
		
		int num[] = new int[4];
		
		for(int i=10 ; i>=1 ; i--){
			if(i<10)
				System.out.println("目前您還有"+i+"張選票");
			
			int x = input.nextInt();
			if(x>=4 || x<=0)
				num[0]++;
			else
				num[x]++;
		}
		
		System.out.println("大選結果統計 : \n(一)、朱阿倫"+num[1]+"票\n(二)、蔡阿英"+num[2]+"票\n"
				+ "(三)、宋阿漁"+num[3]+"票\n(四)、廢票"+num[0]);
		
		
		
	}

}
