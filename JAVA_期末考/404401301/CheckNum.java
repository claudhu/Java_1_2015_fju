
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 9 digits: ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();
		
		int checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(checksum==10)
			System.out.print("The checksum is : X " );
		else
			System.out.print("The checksum is :" +checksum);
		
		int ISBN =1000000000*d1+100000000*d2+10000000*d3+1000000*d4+100000*d5+10000*d6+1000*d7+100*d8+10*d9+checksum;
		System.out.println("\nThe ISBN is: "+ ISBN);
		
		

	}

}
