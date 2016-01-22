
import java.util.Scanner;
public class oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the ticket number : ");
		int num = input.nextInt();
		System.out.print("Enter the number of ticket : ");
		int num1=input.nextInt();
		if(num==1){
			System.out.print("The price is "+(3000*num1));
		}
		else if(num==2){
			System.out.print("The price is "+(2500*num1));
		}
		else if(num==3){
			System.out.print("The price is "+(2000*num1));
		}
		else if(num==4){
			System.out.print("The price is "+(1000*num1));
		}
		else if(num==5){
			System.out.print("The price is "+(500*num1));
		}
		else
			System.out.print("wrong!");
	}

}
