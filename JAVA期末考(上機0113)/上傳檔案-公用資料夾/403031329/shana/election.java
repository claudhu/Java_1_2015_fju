

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 10;
		
        System.out.println("(一)朱阿倫");
		
		System.out.println("(二)蔡阿英");
		
		System.out.println("(三)宋阿漁");
		
		System.out.println("(四)廢票");
		
		
		for(;;){
			
			int k1 = 0;
			int k2 = 0;
			int k3 = 0;
			int k4 = 0;
		
		                                    
		System.out.println("中華民國總統大選，請輸入你的投票選擇，目前還有"+count+"張選擇: ");
		
		int n=input.nextInt();
		
		switch (n) {
		
			case 1: k1++; count--;
			break;
			
			case 2: k2++; count--;
			break;
			
			case 3: k3++; count--;
			break;
			
			case 4: k4++; count--;
			
			
			default:
			
			System.out.printf("輸入票數: \n");
		}
		if(count==0){
			System.out.println("大選統計結果");
			System.out.printf("(一)朱阿倫     \n"+"(二)蔡阿英    \n"+"(三)宋阿漁     \n"+"(四)廢票    \n",k1,k2,k3,k4);
			break;
		}
	
		
		}	
	
		
	}
	}



