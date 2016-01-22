import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the ticket number :");
		int a=input.nextInt();
		System.out.println("please enter the quantity: ");
		int b=input.nextInt();
		int m = 0;
		if(a==1){
			m=3000*b;}
		else if(a==2)
			m=2500*b;
		else if(a==3)
			m=2000*b;
		else if(a==4)
			m=1000*b;
		else if(a==5)
			m=500*b;
		System.out.println("You have to pay "+m+" dollar");
		
	}

}
