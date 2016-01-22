
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("中國民總統大選請輸入你的投票選擇，目前您還有10張選票");
		System.out.println("(一)、朱阿倫");
		System.out.println("(二)、蔡阿英");
		System.out.println("(三)、宋阿漁");
		System.out.println("(四)、廢票");
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0;i<10;i++){
			
			
			System.out.println("請輸入你的投票選擇，目前您還有"+ (10-count) +"張選票");
			int j = input.nextInt();
			
			if(j==1)
				a = a+1;
			else if(j==2)  
			    b = b+1;
			else if(j==3) 
				c = c+1; 
			else if(j==4) 
				d = d+1;  
			count++;  
			
			}
		System.out.println("大選結果統計:");
		System.out.println("(一)、朱阿倫" + a +"票");
		System.out.println("(二)、蔡阿英" + b +"票");
		System.out.println("(三)、宋阿漁" + c +"票");
		System.out.println("(四)、廢票"  + d +"票");
			
			
		}
			 
			            
                           

	}


