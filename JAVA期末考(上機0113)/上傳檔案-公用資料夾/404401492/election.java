import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner (System.in);
    System.out.println("中國民總統大選，請輸入你的投票選擇，目前您還有10張選票");
    System.out.println("(一)朱阿倫");
    System.out.println("(二)蔡阿英");
    System.out.println("(三)宋阿漁");
    System.out.println("(四)廢票");
    int a = 0 ; int b = 0 ;int c = 0;int d =0;
    for(int i = 9; i>=0 ; i--){
    	int ticket = input.nextInt();
     if(ticket==1){
    	 System.out.printf("中國民總統大選，請輸入你的投票選擇，目前您還有%d張選票",i);
    	 a++;}
     else if (ticket==2){
        	 System.out.printf("中國民總統大選，請輸入你的投票選擇，目前您還有%d張選票",i);
        	 b++;}
     else if(ticket==3){
    	 System.out.printf("中國民總統大選，請輸入你的投票選擇，目前您還有%d張選票",i);
    	 c++;}
    else if(ticket==4){
        	 System.out.printf("中國民總統大選，請輸入你的投票選擇，目前您還有%d張選票",i);
        	 d++;}
     }
    System.out.println("\n大選結果統計：");
    System.out.printf("(一)、朱阿倫 、朱阿倫%d票\n",a);
    System.out.printf("(二)、蔡阿英 、蔡阿英%d票\n",b);
    System.out.printf("(三)、宋阿魚 、宋阿魚%d票\n",c);
    System.out.printf("(四)、廢票 、廢票 %d票\n",d);

    }

	}


