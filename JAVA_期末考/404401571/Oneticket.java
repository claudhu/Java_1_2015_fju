
import java.util.Scanner;
public class Oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("叫匡拒布絏");
		int ticketcode = input.nextInt();
		System.out.println("叫块眤璶眎计");
		int n = input.nextInt();
		int price;
		
		if(ticketcode==1){
			price = 3000*n;
			System.out.println("布基:"+price);
		}
		else if(ticketcode==2){
			price = 2500*n;
			System.out.println("布基:"+price);
		}
		else if(ticketcode==3){
			price = 2000*n;
			System.out.println("布基:"+price);
		}
		else if(ticketcode==4){
			price = 1000*n;
			System.out.println("布基:"+price);
		}
		else if(ticketcode==5){
			price = 500*n;
			System.out.println("布基:"+price);
		}

	}

}
