
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("叫块布絏");
		int a = input.nextInt();
		System.out.println("叫块布计秖");
		int b = input.nextInt();
		
		if(a==1){
			System.out.println("布羆肂:"+b*3000);
		}
		else if(a==2){
			System.out.println("布羆肂:"+b*2500);
		}
		else if(a==3){
			System.out.println("布羆肂:"+b*2000);
		}
		else if(a==4){
			System.out.println("布羆肂:"+b*1000);
		}
		else{
			System.out.println("布羆肂:"+b*500);
		}
		
		
		

	}

}
