import java.util.*;
public class election {

	public static void main(String[] args) {
		
		int t=0,t1=0,t2=0,t3=0,t4=0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i =10 ;i>0;i--){
		
		System.out.printf("中國民總統大選，請輸入你的投票選擇，目前您還有%d張選票:\n(一)、朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁 \n(四)、廢票\n",i);
		
		 t=input.nextInt();
		 
		 if(t==1)
			 t1++;
		 else if(t==2)
			 t2++;
		 else if(t==3)
			 t3++;
		 else if(t==4)
			 t4++;
		 
		
		}
		
		System.out.printf("大選結果統計： \n(一)、朱阿倫 %d票\n(二)、蔡阿英 %d票\n(三)、宋阿魚 %d票\n(四)、廢票 %d票",t1,t2,t3,t4);
	}

}
