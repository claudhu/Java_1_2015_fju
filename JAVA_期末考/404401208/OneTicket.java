import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input =new Scanner(System.in);
    System.out.println("請輸入門票代碼 : ");
    int code = input.nextInt();
    System.out.println("請輸入欲購買的門票數量 : ");
    int sum = input.nextInt();
    switch(code){
    case 1 : System.out.println("您購買的是VIP票"+sum+"張，一共是"+sum*3000+"元。");break;
    case 2 : System.out.println("您購買的是包廂票"+sum+"張，一共是"+sum*2500+"元。");break;
    case 3 : System.out.println("您購買的是前中場票"+sum+"張，一共是"+sum*2000+"元。");break;
    case 4 : System.out.println("您購買的是左右場票"+sum+"張，一共是"+sum*1000+"元。");break;
    case 5 : System.out.println("您購買的是最高區座位票"+sum+"張，一共是"+sum*500+"元。");
    }
	}

}
