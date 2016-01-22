import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int choice [] = new int [4];
		int per = 0;
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("中華民國總統大選，請輸入你的投票選擇，目前你還有 " + (10-i) + " 張選票。");
			System.out.print("1、朱阿倫  \n2、蔡阿英\n3、宋阿漁\n4、廢票\n你投（請輸入數字1-4）：");	
			per = input.nextInt();
			
			if(per == 1){
				choice[0]++;
				
			}
			else if(per == 2){
				choice[1]++;
			}
			else if(per == 3){
				choice[2]++;
			}
			else if(per == 4){
				choice[3]++;
			}		
			System.out.println("");
			
		}
		
		System.out.println("大選結果統計:1、朱阿倫 " + choice[0] + " 票");
		System.out.println("大選結果統計:2、蔡阿英 " + choice[1] + " 票");
		System.out.println("大選結果統計:3、宋阿漁 " + choice[2] + " 票");
		System.out.println("大選結果統計:4、廢票 " + choice[3] + " 票");

		
		
		
	}

}
