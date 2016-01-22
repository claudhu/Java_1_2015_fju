
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    
	    int []b= new int[4];
		for(int c=10;c>0;c--){
			System.out.println("中華民國總統大選，請輸入"
					+ "你的投票選擇，目前你還有"+c+"張選票");
			System.out.println("1.朱阿倫");
			System.out.println("2.蔡阿英");
			System.out.println("3.宋阿魚");
			System.out.println("4.廢票");
					
			int a=input.nextInt();
		
		switch(a){
		
		case 1 : b[0]+=1;
        break;
		case 2 : b[1]+=1;
		break;
		case 3 : b[2]+=1;
		break;
		
		case 4 : b[3]+=1;
		break;
		
				
	}
		}
		System.out.println("大選結果統計:");
		System.out.println("1.朱阿倫"+b[0]+"票");
		System.out.println("2.蔡阿英"+b[1]+"票");
		System.out.println("3.宋阿魚"+b[2]+"票");
		System.out.println("4.廢票"+b[3]+"票");
	}
}
