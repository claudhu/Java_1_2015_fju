import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int m = 0;
		while(m>=0){
			System.out.println("Please enter the ticket number :");
			int a=input.nextInt();
			if(a==0){
				System.out.print("You have to pay "+m+" dollar");
				break;
			}
			System.out.println("please enter the quantity: ");
			int b=input.nextInt();
			
			if(a==1)
				m=3000*b+m;
			else if(a==2)
				m=2500*b+m;
			else if(a==3)
				m=2000*b+m;
			else if(a==4)
				m=1000*b+m;
			else if(a==5)
				m=500*b+m;
			
		}
		
		

	}

}
