import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1"+"VIP"+"3000"+"2"+"碵"+"2500"+"3"+"玡い初"+"2000"+"4"+"オ初"+"1000"+"5"+"程蔼跋畒"+"500");

System.out.println("叫匡拒贺布块璶潦禦碭眎");

Scanner input = new Scanner(System.in);

int num = input.nextInt();

int ticket = input.nextInt();

int price1 = 3000*ticket;

int price2 = 2500*ticket;

int price3 = 2000*ticket;

int price4 = 1000*ticket;

int price5 = 500*ticket;

if(num==1)
	System.out.println("布基琌:"+price1);

if(num==2)
	System.out.println("布基琌:"+price2);

if(num==3)
	System.out.println("布基琌:"+price3);

if(num==4)
	System.out.println("布基琌:"+price4);

if(num==5)
	System.out.println("布基琌:"+price5);



	}

}
