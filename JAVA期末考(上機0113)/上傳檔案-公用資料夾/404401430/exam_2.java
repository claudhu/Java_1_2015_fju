

import java.util.Scanner;

public class exam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入您的投票(1.朱阿倫、2.蔡阿英、3.宋阿漁、4.廢票):");
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i=0;i<9;i++){
			int vote = input.nextInt();
			System.out.printf("中國民國總統大選，請輸入您的投\n"
					+ "票選擇，目前您還有%d張選票\n",(9-i));
			System.out.printf("(一、)朱阿倫\n"
					+ "(二、)蔡阿英\n"
					+ "(三、)宋阿漁\n"
					+ "(四、)廢票\n");
			
			if(vote==1)
				count1++;
			else if(vote==2)
				count2++;
			else if(vote==3)
				count3++;
			else
				count4++;
		}
		System.out.printf("大選結果統計:\n"
				+"(一、)朱阿倫 %d 票\n"
				+ "(二、)蔡阿英 %d 票\n"
				+ "(三、)宋阿漁 %d 票\n"
				+ "(四、)廢票 %d 票",count1,count2,count3,count4);
		
		input.close();

	}

}
