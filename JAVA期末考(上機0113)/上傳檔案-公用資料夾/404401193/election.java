
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("(一)‵朱阿倫");
		System.out.println("(二)‵蔡阿英");
		System.out.println("(三)‵宋阿魚");
		System.out.println("(四)‵廢票");
		System.out.println("你有十張票,你要投給誰");
		int i = 10;
		int e ;
		int finall;
		int a=0,b=0,c=0,d=0;
		for(e=1;e<=10;e++){
			int who = input.nextInt();
			finall= i - e;
			System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有"+finall+"張選票");
			if(who==1){
				a+=1;}
				
			if(who==2){
				b+=1;}
				
			if(who==3){
				c+=1;}
				
			if(who==4){
				d+=1;}
			
			
			if (i == 0)
				break;
			
		
		}
		System.out.println("大選結果統計:");
		System.out.println("(一)‵朱阿倫"+a+"票");
		System.out.println("(一)‵蔡阿英"+b+"票");
		System.out.println("(一)‵宋阿魚"+c+"票");
		System.out.println("(一)‵廢票"+d+"票");
		
		
		
	}
}


