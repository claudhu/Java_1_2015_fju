
import java.util.Scanner;
public class election {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please select your choice:");
	System.out.println("(一)、朱阿倫 (二)、蔡阿英 (三)、宋阿漁");
	int a = 0,b = 0,c =0 ,d = 0;

	for (int i = 10 ; i >= 1 ; i--){
		System.out.println("中國民國總統大選，請輸入你的投票選擇，目前你還有" + i + "張選票");
		int ans = input.nextInt();
	    if (ans == 1)
	    	a++;
	    else if (ans ==2 ){
	    	b++;}
	    else if (ans == 3){
	    	c++;}
	    else {
	    	d++;}
	    
	}
	
	System.out.println("(一.)朱阿倫" + a + "票");
	System.out.println("(二.)蔡阿英" + b + "票");
	System.out.println("(三.)宋阿魚" + c + "票");
	System.out.println("(四.)廢票" + d + "票");
	    	 
		
	
		
}
}