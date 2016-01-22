


import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int person1 = 0;
		int person2 = 0;
		int person3 = 0;
		int person4 = 0;
		for(int i =10;i>=1;i--)
		{
			System.out.printf("中國民國總統大選，請輸入你的投票選擇，目前您還有%d張選票\n",i);
			System.out.println("(一)、朱阿倫");
			System.out.println("(二)、蔡阿英");
			System.out.println("(三)、宋阿漁");
			System.out.println("(四)、廢票");					

			int a =input.nextInt();
			switch(a)
			{
			case 1:
				person1++;
				break;
			case 2:
				person2++;
				break;
			case 3:
				person3++;
				break;
			case 4:
				person4++;
				break;
			default:
					break;
				
			}
		}
		
		System.out.println("大選結果統計");
		System.out.println("(一)、朱阿倫"+person1+"票");
		System.out.println("(二)、蔡阿英"+person2+"票");
		System.out.println("(三)、宋阿漁"+person3+"票");
		System.out.println("(四)、廢票"+person4+"票");					


			
	}

}
