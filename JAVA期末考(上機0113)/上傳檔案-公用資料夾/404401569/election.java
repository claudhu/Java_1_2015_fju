
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in) ;
		
		while (true)
		{
			int num1 = 0 , num2 = 0 , num3 = 0 , num4 = 0 ;
			for (int i = 10 ; i > 0 ; i --)
			{
				System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有" + i + "張選票");
				System.out.println("(一)、朱阿倫(二)、蔡阿英(三)、宋阿漁 (四)、廢票");
				System.out.print("你投得票為 : ");
				int num = input.nextInt();
				
				switch (num)
				{
				case (1) : num1 ++ ; break ;
				case (2) : num2 ++ ; break ;
				case (3) : num3 ++ ; break ;
				case (4) : num4 ++ ; break ;
				}
			}
			
			System.out.println("大選結果統計 : ") ;
			System.out.println("(一)、朱阿倫 " + num1 + " 票");
			System.out.println("(二)、蔡阿英 " + num2 + " 票");
			System.out.println("(三)、宋阿漁 " + num3 + " 票");
			System.out.println("(四)、廢票 " + num4 + " 票");
			
			break ;
		}

	}

}
