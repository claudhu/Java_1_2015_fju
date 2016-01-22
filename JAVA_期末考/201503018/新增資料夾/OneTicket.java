
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("please enter the rank and number: ");
int r=input.nextInt();
int n=input.nextInt();
	
if(r==1){
	int p1=3000*n;
	System.out.print("total money is "+p1);
}
else if(r==2){
	int p2=2500*n;
	System.out.print("total money is "+p2);
}
else if(r==3){
	int p3=2000*n;
	System.out.print("total money is "+p3);
}
	else if(r==4){
		int p4=1000*n;
		System.out.print("total money is "+p4);	
}
	else {
		int p5=500*n;
		System.out.print("total money is "+p5);}
}

}
