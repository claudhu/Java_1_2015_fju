
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);

    System.out.print("Enter code of ticket: ");
    int code = input.nextInt(6); //code number
    
    int[] code = {3000,2500,2000,1000,500};
    
    int price1 = 3000;//VIP
    int price2 = 2500;//包廂
    int price3 = 2000;//前中場
    int price4 = 1000;//左右場
    int price5 = 500;//最高區座位
    
    System.out.print("Enter numbers of ticket: ");
    int i = input.nextInt(); //numbers of ticket
    
    int j = ()*i; //price
    System.out.print("The price is " + j + ",Thank You!");
	}

}
