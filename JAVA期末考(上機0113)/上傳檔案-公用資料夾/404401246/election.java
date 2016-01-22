
import java.util.Scanner;
public class election {

	public static void main(String args[]){
		
		
		
		System.out.println("中華民國總統大選，請輸入你的投票選擇，目前您還有 10 張選票");
		System.out.println("(一)朱阿倫");
		System.out.println("(二)蔡阿英");
		System.out.println("(三)宋阿漁");
		System.out.println("(四)廢票");
		
		
		int num[] = new int[10];
		System.out.println("糗輸入你的選擇: (有10票)");
		Scanner input = new Scanner(System.in);
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(int i=0;i<num.length; i++){
			num[i] = input.nextInt();
			if(num[i]==1){
				count1++;
			}
			else if(num[i]==2){
				count2++;
			}
			else if(num[i]==3){
				count3++;
			}
			else if(num[i]==4){
				count4++;
			}
		}
		
		
				
		
		System.out.println("大選統計結果:");
		System.out.println("(一)朱阿倫  "+count1+" 票");
		System.out.println("(二)蔡阿英  "+count2+" 票");
		System.out.println("(三)宋阿漁  "+count3+" 票");
		System.out.println("(四)廢票  "+count4+" 票");
		
	}
}
