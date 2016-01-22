
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		
		System.out.println("中華民國總統大選,請輸入您的投票選擇,目前您還有"+"10"+"張選票");
		System.out.println("(一)朱阿倫");
		System.out.println("(二)蔡阿英");
		System.out.println("(三)宋阿漁");
		System.out.println("(四)廢票");
		int count = 0;
		
		while(count<=10){
			count++;
			for(int j=10;j>=1;j--){
				System.out.println("中華民國總統大選,請輸入您的投票選擇,目前您還有"+j+"張選票");
				int a = input.nextInt();
				if(a==1){
					n1++;
				}
				else if(a==2){
					n2++;
				}
				else if(a==3){
					n3++;
				}
				else{
					n4++;
				}
				
			}
			System.out.println("大選結果統計:");
			System.out.println("(一) 朱阿倫"+n1+"票");
			System.out.println("(二) 蔡阿英"+n2+"票");
			System.out.println("(三) 宋阿漁"+n3+"票");
			System.out.println("(四) 廢票"+n4+"票");break;
	    }
		

	 }

}
