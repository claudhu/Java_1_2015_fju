import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] menpiao = {3000 , 2500 ,2000 ,1000 ,500};
Scanner input = new Scanner(System.in);
System.out.print("Please enter the ticket's number:");
int daima = input.nextInt();
System.out.print("Please enter the count:");
int shuliang = input.nextInt();
int jine = menpiao[daima - 1] * shuliang;
System.out.println("You need to paid:" + jine +" dollers");
		
	}

}
