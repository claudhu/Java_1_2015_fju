

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pig = 0 ;
		int inin = 0 ;
		int fish = 0 ;
		int nono = 0 ;
       
		for(int i = 0 ; i < 10 ; i++ ){
			System.out.println("中華民國總統大選，請輸入您的投票選擇!\n"
					+ "您目前還有"+(10-i)+"張選票"
							+ "\n(一)、朱阿倫\n (二)、蔡阿英\n (三)、宋阿漁\n (四)廢票\n") ;
			int vote = input.nextInt();
			switch ( vote % 4){
			case 0 :  nono += 1 ; break ;
			case 1 :  pig += 1 ; break ;
			case 2 :  inin += 1 ; break ;
			case 3 :  fish += 1 ; break ;
		}
		
		}
		System.out.println("大選結果統計:\n"
				+ "\n(一)、朱阿倫:"+pig+"\n"
						+ " (二)、蔡阿英:"+inin+"\n"
								+ " (三)、宋阿漁:"+fish+"\n"
										+ " (四)廢票:\n"+nono) ;
		

	}

}
