import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("中華民國大選，請輸入你的投");
        System.out.println("票選擇目前您還有10張選票");
        System.out.println("(一)、朱阿倫");
        System.out.println("(二)、蔡阿英");
        System.out.println("(三)、宋阿魚");
        System.out.println("(四)、廢票");
        int a = 0,b=0,c=0,d=0 ;
        for(int i=10 ; i>=1 ; i--){
        	int ticket = input.nextInt();
        	if(ticket==1)
        		a++;
        	if(ticket==2)
        		b++;
        	if(ticket==3)
        		c++;
        	if(ticket==4)
        		d++;
        	if(ticket<1||ticket>4)
        		d++;        		
        	System.out.println("你還有"+(i-1)+"張票");
        }
        System.out.println("大選結果統計:");
        System.out.println("(一)、朱阿倫   "+a+"張票");
        System.out.println("(一)、蔡阿英   "+b+"張票");
        System.out.println("(一)、宋阿魚   "+c+"張票");
        System.out.println("(一)、廢票   "+d+"張票");
	}
	

}
