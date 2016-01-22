
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("中華民國總統大選，請輸入您的投票選擇");
		System.out.println("(一)朱阿倫");
		System.out.println("(二)蔡阿英");
		System.out.println("(三)宋阿漁");
		System.out.println("(四)廢票");
		int count=10;
		int a=0,b=0,c=0,d=0;
		while(count>0){
			
			System.out.println("您還有"+count+"票");
			int  t =input.nextInt();
			if(t==1){
				a++;
				count--;}
			else if(t==2){
				b++;
				count--;}
			else if(t==3){
				c++;
				count--;}
			else if(t==4){
				d++;
				count--;}
			else
				System.out.println("施主您逗趣了，不想投至少投個正確的廢票吧");
				
		}
		System.out.println("大選結果統計");
		System.out.println("(一)朱阿倫  "+a+"票");
		System.out.println("(二)蔡阿英  "+b+"票");
		System.out.println("(三)宋阿漁  "+c+"票");
		System.out.println("(四)廢票      "+d+"票");
		

	}

}
