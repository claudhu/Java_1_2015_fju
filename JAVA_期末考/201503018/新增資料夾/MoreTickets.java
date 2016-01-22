
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("please enter the rank and number: ");
		int r=input.nextInt();
		int p =0;
		int total=0;
	while(r!=0){
		switch(r){
		case 1:p=3000;break;
		case 2:p=2500;break;
		case 3:p=2000;break;
		case 4:p=1000;break;
		case 5:p=500;break;
		}
		total =total+p;
		r=input.nextInt();
	}
	System.out.print("The total is : "+ total);
	}

}
