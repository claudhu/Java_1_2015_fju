
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("選擇代碼");
    int a=input.nextInt();
    System.out.println("選擇數量");
    int num=input.nextInt();
    int total;
    if(a==1){
    	 total=3000*num;
    	 System.out.println("總金額:"+total);
    }
    if(a==2){
    	total=2500*num;
    	System.out.println("總金額:"+total);
    }
    if(a==3){
    	total=2000*num;
    	System.out.println("總金額:"+total);
    }
    if(a==4){
    	 total=1000*num;
    	 System.out.println("總金額:"+total);
    }
    if(a==5){
    	total=500*num;
    	System.out.println("總金額:"+total);
    }
    }
	}

