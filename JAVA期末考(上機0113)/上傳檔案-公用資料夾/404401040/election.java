import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    int i = 10;
  
    System.out.println("中華民國總統大選，請輸入你的投票選擇，目前你還有 " + i + "張選票: ");
  
   for(int j = 0; j<=10; j++){
	   
	   int a = 0;break; //朱阿倫
	   int b = 1;break;//蔡阿英
	   int c = 2;break; //宋阿潦
	   int d = 3; //廢票
	   return;
	   
    int k = a+b+c+d;
	    if(k > 10){
		   System.out.print("error");
    }
    System.out.println("大選結果統計: ");
    System.out.println("(一)朱阿倫" + k);
    System.out.println("(二)蔡阿英" + k);
    System.out.println("(三)宋阿漁" + k);
    System.out.println("(四)廢票" + k);
	}

}
}