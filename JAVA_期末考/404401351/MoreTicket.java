
import java.util.Scanner;
public class MoreTicket {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i=-1,total, count=0, count2=0, count3=0, count4=0, count5=0;
	while(i<0){
    System.out.println("選擇代碼");
    int a=input.nextInt();
    if(a==0){
    	break;
    }
    System.out.println("選擇數量");
    int num=input.nextInt();
    
    if(a==1){
    	 count=num;
    }
    if(a==2){
    	 count2=num;
    }
    if(a==3){
    	 count3=num;
    }
    if(a==4){
    	 count4=num;
    }
    if(a==5){
    	 count5=num;
    }
    }
	total=(3000*count)+(2500*count2)+(2000*count3)+(1000*count4)+(500*count5);
    System.out.println("總共"+total+"元");
    }
	}

