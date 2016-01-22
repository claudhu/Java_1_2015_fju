
import java.util.*;
public class election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=0,num2=0,num3=0,num4=0;
		System.out.printf("中華民國總統大選，請輸入你的投票選擇，\n(一)、朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票\n");
		for(int i=0; i<10; i++){
		System.out.printf("目前您還有%d張選票\n",10-i);
		int a = input.nextInt();
		switch(a){
		case 1:num1++;break;
		case 2:num2++;break;
		case 3:num3++;break;
		default: num4++;break;
		}
     }
		System.out.printf("(一)、朱阿倫%d票\n(二)、蔡阿英%d票\n(三)、宋阿漁%d票\n(四)、廢票%d票",num1,num2,num3,num4);

}
}