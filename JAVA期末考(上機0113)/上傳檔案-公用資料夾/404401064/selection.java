
import java.util.Scanner;
public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有張選票");
		System.out.println("（一）朱立倫" + "\n" + "（二）蔡英文" + "\n" + "（三）宋阿漁" + "\n" + "（四）廢票");
		
		int number;
		number = input.nextInt();
		switch(number){
		case 1 : {
			     int total = 10;
			     int number1 ;
			     int number2 ;
			     int number3 ;
			     number1 = 1;number2 = 0;number3 = 0;total = 9;
			      System.out.print("（一）朱立倫"+number1+"票" + "\n" + 
		                           "（二）蔡英文"+number2+"票" + "\n" + 
				                   "（三）宋阿漁"+number3+"票" + "\n" + 
		                           "（四）廢票");
			      System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有張"+total+"選票");break;
		}
		case 2:{
			 int total = 10;
		     int number1 ;
		     int number2 ;
		     int number3 ;
		     number1 = 0;number2 = 1;number3 = 0;total = 9;
		      System.out.print("（一）朱立倫"+number1+"票" + "\n" + 
	                           "（二）蔡英文"+number2+"票" + "\n" + 
			                   "（三）宋阿漁"+number3+"票" + "\n" + 
	                           "（四）廢票");
		      System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有張"+total+"選票");break;
			
		}
		case 3:{
			int total = 10;
		     int number1 ;
		     int number2 ;
		     int number3 ;
		     number1 = 0;number2 = 0;number3 = 1;total = 9;
		      System.out.print("（一）朱立倫"+number1+"票" + "\n" + 
	                           "（二）蔡英文"+number2+"票" + "\n" + 
			                   "（三）宋阿漁"+number3+"票" + "\n" + 
	                           "（四）廢票");
		      System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有張"+total+"選票");break;
		}
		case 4:{
		      System.out.println("byebye");break;
		}
		default:System.out.println("請重新選擇");
		
		}	

	}

}
