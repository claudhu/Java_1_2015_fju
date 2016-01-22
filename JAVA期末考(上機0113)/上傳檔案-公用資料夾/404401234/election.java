import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int m =10 ; m>0 ;m--){
		System.out.println("中華民國總統大選，請輸入你的投票選擇目前您還有"+m+"張選票");
		System.out.println("(一)、朱阿倫");
		System.out.println("(二)、蔡阿英");
		System.out.println("(三)、宋阿漁");
		System.out.println("(四)、廢票");		
			
			int j = input.nextInt();
		
			if(j == 1)
				a += 1;
			
			else if(j==2)
				b += 1;
			else if(j==3)
				c += 1;
			else 
				d += 1;
			
	 }
		System.out.println("中華民國總統大選結果統計");
		System.out.println("(一)、朱阿倫"+a+"票");
		System.out.println("(二)、蔡阿英"+b+"票");
		System.out.println("(三)、宋阿漁"+c+"票");
		System.out.println("(四)、廢票"+d+"票");
		
		}
		
	}


