import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		for(int i=10;i>0;i--){
		System.out.print("中國民國總統大選，請輸入你的投票選擇，目前您還有"+i+"張選票");
		int z=input.nextInt();
		
		if(z>3||z<1){
			d++;
		}
		else if(z<=3&&z%3==1){
			a++	;		
		}
		else if(z<=3&&z%3==2){
			b++;		
		}
		else if(z<=3&&z%3==0) {
			c++;
		}
				
		}
		System.out.println("大選結果統計:");
		System.out.println("(一)、朱阿倫"+a+"票");
		System.out.println("(二)、蔡阿英"+b+"票");
		System.out.println("(三)、宋阿魚"+c+"票");
		System.out.println("(四)、廢票"+d+"票");
	}
	

}
